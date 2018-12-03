/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_2;

/**
 *
 * @author aparcerozas
 */
public class Boletin12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main (String [] args) { 
        Clase1 obj1= new Clase1(5,4); 
        System.out.print(obj1.modificar(4)+" "); 
        Clase1 obj2= new Clase1(5,4); 
        System.out.print(obj2.modificar(5)+" "); 
        obj2=obj1; 
        System.out.println(obj2.modificar(5)+" "); 
    }
    
}
