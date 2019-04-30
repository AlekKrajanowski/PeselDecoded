/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpesel;

/**
 *
 * @author Alek
 */
//Klasa zawierająca zwrot poszczególnych cyfr Peselu
public class ReturnNumbers {
    
    //Zwraca liczbę opisującą miesiąc
    int monthReturn(String number)throws Exception{
        
        int monthNumber = Integer.parseInt(number.substring(2,4));
        
        return monthNumber;  
    }
    //Zwraca liczbę opisującą płeć
    int sexReturn(String number)throws Exception{
        
        int sexNumber = Integer.parseInt(number.substring(9,10));
        
        return sexNumber;  
    }
    //Zwraca liczbę opisującą dzień urodzenia
    int dayReturn(String number)throws Exception{
        
        int dayNumber = Integer.parseInt(number.substring(4,6));
        
        return dayNumber;  
    }
    //Zwraca liczbę opisującą w jakim roczniku jest dana osoba
    int yearReturn(String number)throws Exception{

        int yearNumber = Integer.parseInt(number.substring(2,3));
        
        
        return yearNumber;  
    }
    //Zwraca końcówkę roku urodzenia
    int endReturn(String number)throws Exception{

        int endNumber = Integer.parseInt(number.substring(0,2));
        
        
        return endNumber;  
    }
    
    
}
