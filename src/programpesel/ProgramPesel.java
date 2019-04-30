/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpesel;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Alek
 */
public class ProgramPesel {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, Exception {
        //tworzymy zmienną typu Scanner dzięki której pobieramy nasz kod Pesel
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your PESEL code: ");
        String text = scan.nextLine(); 
        //obiekty poszcególnychklas
        ReturnNumbers Return = new ReturnNumbers();
        DataBase PickUp = new DataBase();
        
        
        System.out.println("Day: "+Return.dayReturn(text));
        //Wywołania poszczególnych metod
        PickUp.readMonth(Return.monthReturn(text));
        PickUp.readYear(Return.yearReturn(text),Return.endReturn(text));
        PickUp.readSex(Return.sexReturn(text));

    }
    
}
