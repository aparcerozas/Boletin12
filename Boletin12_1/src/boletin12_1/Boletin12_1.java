/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

/**
 *
 * @author aparcerozas
 */
public class Boletin12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garaje garage = new Garaje();
        Coche lambo = new Coche("123456PO", "Lambo");
        garage.aparcar(lambo);
        garage.precio();
    }
    
}
