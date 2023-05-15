
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;

import util.ConnectionFactory;



/**
 *
 * @author Beluga
 */
public class ProjectController {
    
     public void save(Project project) throws SQLException {

        String sql = "ISERT INTO projects (name"
                + "description,"
                + "createdAt,"
                + "updatedAt)VALUES(?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            //abaixo carrega os valores para o statement para trocar as ? pelos values
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.execute();
        }// fim do try
        catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto"
                    + ex.getMessage(), ex);

        }//fim do catch
        finally {

            ConnectionFactory.closeConnection(connection, statement);

        }//fim fo finally

    }

    public void update(Project project) {

        String sql = "UPDATE project SET"
                + "name = ?,"
                + "description=?,"
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
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5,project.getId());
            
           
            
            //Executando a query
            statement.execute();
        }//fim do try 
        catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o projeto" + ex.getMessage());
        }//fim do catch

    }// fim do UPDATE

    public void removeById(int idProject)  {

        String sql = "DELETE FROM projects WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Criação da conexão com BD
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando os valores
            statement.setInt(1, idProject);
            
            // Executando a query
            statement.execute();

        }//fim dao try
        catch (Exception ex) {
            // caso a execução da query der errado, aparecerá uma msg de erro 
            throw new RuntimeException("Erro ao deletar o projeto" + ex.getMessage(), ex);

        }//fim do ctach
        finally {
            // fecha a conexão com banco de dado e com a query
            ConnectionFactory.closeConnection(connection, statement);

        }//fimdo finally

    }

    public List<Project> getAll() {

        String sql = "SELECT * FROM projects";
       
//lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Project> projects = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        
        //Classe que vai recuperar os dados do banco de dados
        ResultSet resultSet = null;

    
       
        try {
            
            //Criando conexão com BD
            connection = ConnectionFactory.getConnection();            
            
            // Preparando a query
            statement = connection.prepareStatement(sql);
            
           
            
            //Valor retornado pela execução da query
            resultSet = statement.executeQuery();
            
            //Enquanto houver valores a serem percorridos no resultSet vai fazer isso
            while (resultSet.next()) {

                 Project project = new Project();
                
               project.setId(resultSet.getInt("id"));
               project.setName(resultSet.getString("name"));
               project.setDescription(resultSet.getString("description"));
               project.setCreatedAt(resultSet.getDate("createdAt"));
               project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                //Adiciono o projeto na lista de projetos
               project.add(project);
            }

        }//fim try
        catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar  o projeto" + ex.getMessage(), ex);
        }//fim catch
        finally {

            ConnectionFactory.closeConnection(connection, statement, resultSet);

        }

        //listas de projetos que foi criada e carregada do banco de dados 
        return projects;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
