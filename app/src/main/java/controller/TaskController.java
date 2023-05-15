/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Task;
import util.ConnectionFactory;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beluga
 */
public class TaskController {

    public void save(Task task) throws SQLException {

        String sql = "ISERT INTO tasks (idProject"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt)VALUES(?,?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            //abaixo carrega os valores para o statement para trocar as ? pelos values
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        }// fim do try
        catch (SQLException ex) {

            throw new RuntimeException("Erro ao salvar a tarefa"
                    + ex.getMessage(), ex);

        }//fim do catch
        finally {

            ConnectionFactory.closeConnection(connection, statement);

        }//fim fo finally

    }

    public void update(Task task) {

        String sql = "UPDATE tasks SET"
                + "idProject =?,"
                + "name = ?,"
                + "description=?,"
                + "notes=?, "
                + "completed=?,"
                + "deadline=?,"
                + "createdAt=?,"
                + "updatedAt=?"
                + "WHERE id =?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Estabelecendo a conexão com BD
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            // Setando os valores do statement
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            
            //Executando a query
            statement.execute();
        }//fim do try 
        catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + ex.getMessage());
        }//fim do catch

    }// fim do UPDATE

    public void removeById(int taskId) throws SQLException {

        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Criação da conexão com BD
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando os valores
            statement.setInt(1, taskId);
            
            // Executando a query
            statement.execute();

        }//fim dao try
        catch (Exception ex) {
            // caso a execução da query der errado, aparecerá uma msg de erro 
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);

        }//fim do ctach
        finally {
            // fecha a conexão com banco de dado e com a query
            ConnectionFactory.closeConnection(connection, statement);

        }//fimdo finally

    }

    public List<Task> getAll(int idProject) {

        String sql = "SELECT * FROM tasks WHERE idProject=?";

        Connection connection = null;
        PreparedStatement statement = null;
        
        //Classe que vai recuperaros dados do banco de dados
        ResultSet resultSet = null;

        //lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Task> tasks = new ArrayList<Task>();
       
        try {
            
            //Criando conexão com BD
            connection = ConnectionFactory.getConnection();            
            
            // Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
            
            //Valor retornado pela execução da query
            resultSet = statement.executeQuery();
            
            //Enquanto houver valores a serem percorridos no resultSet vai fazer isso
            while (resultSet.next()) {

                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                //Adiciono a tarefa na lista de tarefa
                tasks.add(task);
            }

        }//fim try
        catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar  a tarefa" + ex.getMessage(), ex);
        }//fim catch
        finally {
            
            ConnectionFactory.closeConnection(connection, statement, resultSet);

        }

        //listas de tarefas que foi criada e carregada do banco de dados 
        return tasks;

    }
}
