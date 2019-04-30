/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpesel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alek
 */
//Klasa dzięki której łączymy się z bazą danych, i dzięki której wyipisujemy
//wartości zamieszczone w bazie danych MySql
public class DataBase {
    
    
    //metoda zwracająca nazwę odpowiedniego miesiąca
        public void readMonth(int monthNumber)throws SQLException{
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","AK","root");
             try (Statement statment = connection.createStatement()){
                 ResultSet rs = statment.executeQuery("SELECT monthName FROM monthpeselcode WHERE monthNumber="+monthNumber+";");
                 
           while(rs.next()){
               String name = rs.getString("monthName");
               System.out.println("Month: "+name);
            }
            }  
        }catch (ClassNotFoundException ex) {
             Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLTimeoutException ex){
             System.out.println("The connection time with the database has been exceeded");
        }catch(SQLException ex){
             System.out.println("Connection error with the database");
        }   
    } 
        //metoda zwracająca nazwę płci 
        public void readSex(int sexNumber)throws SQLException{
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","AK","root");
             try (Statement statment = connection.createStatement()){
                 ResultSet rs = statment.executeQuery("SELECT sexName FROM sexnumbers WHERE sexNumber="+sexNumber+";");
                 
           while(rs.next()){
               String name = rs.getString("sexName");
               System.out.println("Sex: "+name);
            }
            }  
        }catch (ClassNotFoundException ex) {
             Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLTimeoutException ex){
             System.out.println("The connection time with the database has been exceeded");
        }catch(SQLException ex){
             System.out.println("Connection error with the database");
        }
        }
        //metoda zwracająca rok 
        public void readYear(int yearNumber, int endNumber)throws SQLException{
         
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","AK","root");
             try (Statement statment = connection.createStatement()){
                 ResultSet rs = statment.executeQuery("SELECT yearNumber FROM yearnumbers WHERE number="+yearNumber+";");
                 
           while(rs.next()){
               int name = rs.getInt("yearNumber");
               System.out.println("Year: "+name+endNumber);
            }
            }  
        }catch (ClassNotFoundException ex) {
             Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLTimeoutException ex){
             System.out.println("The connection time with the database has been exceeded");
        }catch(SQLException ex){
             System.out.println("Connection error with the database");
        }   
    }

       
}
