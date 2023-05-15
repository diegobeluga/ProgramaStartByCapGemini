
package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class ConnectionFactory {// Classe responsavél por criar uma conexão com o banco de dados e devolver para alguma parte do código;
  
    public static final String DRIVER = "com.mysql.jdbc.Driver";//estipulando ua conexão com mysql
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";//caminho de coneão ate obanco ( onde ele está)
    public static final String USER = "root";// usuário do banco de dados que vai ser utilizado
    public static final String PASS = "";//senha do banco de dados que vai ser utilizado;
    
    
    public static Connection getConnection(){// metodo para conectar o banco
        
        try {
           Class.forName(DRIVER);// carrega o driver
           return DriverManager.getConnection(URL,USER,PASS);// realizar uma conexão
            
        } catch(Exception ex){   // caso a conexão não de certo
          
            throw new RuntimeException("Erro na conexão com o banco de dados"+ex.getMessage(),ex);
                        
        }
    }
    
    public static void closeConnection (Connection connection ){
        
      try{
          
          if (connection != null){
               connection.close();
           }    
          
         } catch(Exception ex){
        
                  throw new RuntimeException("Erro ao fechar a conexão com o banco de dados",ex);
        
        
               } 
    
    
    }// fim da classe closeConnection
   
        public static void closeConnection (Connection connection,PreparedStatement statement ){
        
      try{
          
          if (connection != null){
               connection.close();
           }    
           if (statement !=null){
           statement.close();    
           }
         }
          catch(Exception ex)
                  {
        
                  throw new RuntimeException("Erro ao fechar a conexão com o banco de dados",ex);
        
        
                  } 
    
    
    }// fim da classe closeConnection
     public static void closeConnection (Connection connection,PreparedStatement statement,ResultSet resultSet ){
        
      try{
          
          if (connection != null){
               connection.close();
           }    
           if (statement !=null){
           statement.close();    
           }
           if (resultSet!= null){
           
           resultSet.close();
           
           }// fim do if do resultSet
           
         }
          catch(Exception ex)
                  {
        
                  throw new RuntimeException("Erro ao fechar a conexão com o banco de dados",ex);
        
        
                  } 
    
    
    }// fim da classe closeConnection
}
