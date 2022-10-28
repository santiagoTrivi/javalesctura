/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leercvs;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Carvajal-Triviño
 */
public class Leercvs {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Personas jp = new Personas();
        Scanner file = new Scanner(new File("jugadores.csv"));
            while(file.hasNextLine()){
                String [] datos;
                datos = file.nextLine().split(",");
                jp.add(datos[0], datos[1]);
                
            }
     
        jp.show();
            
        
        
        
    }
    
}
