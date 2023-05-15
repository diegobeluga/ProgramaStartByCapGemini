
package TodoApp;

import controller.ProjectController;
import java.sql.Connection;
import java.sql.SQLException;
import model.Project;
import util.ConnectionFactory;

public class App {
    

    public static void main(String[] args) {
    
      Connection c = ConnectionFactory.getConnection();// chamei para criar a conexão
     ConnectionFactory.closeConnection(c);//chamei para fechar a conexão
     
    
    ProjectController projectController = new ProjectController();
    
    

    
   
  
    
    
    
    
    
    
    
    
    
        
    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
