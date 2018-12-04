/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Garaje {
    private int numCoches;
    private Coche car = new Coche();
    private Date fechaInicio;
    private double precio;

    public Garaje() {
        this.numCoches = 0;
    }

    public Garaje(int numCoches) {
        this.numCoches = numCoches;
    }

    public int getNumCoches() {
        return numCoches;
    }

    public void setNumCoches(int numCoches) {
        this.numCoches = numCoches;
    }
    
    public void aparcar(Coche car){
        if(numCoches < 5){
            numCoches++;
            this.car = car;
            fechaInicio = new Date();
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES");
        }
        else{
            JOptionPane.showMessageDialog(null, "COMPLETO");
        }
    }
    
    public double pagar(){
        double pago = Double.parseDouble(JOptionPane.showInputDialog("INTRODUZCA DINERO PARA PAGAR:"));
        if(pago<precio){
            pago = Double.parseDouble(JOptionPane.showInputDialog("EL DINERO NO ES SUFICIENTE. INTRODUZCA UNA MAYOR CANTIDAD:"));
        }
        return pago;
    }
    
    public void precio(){
        Date fechaFin = new Date();
        int horas = (int)((fechaFin.getTime() - fechaInicio.getTime())/1000);
        precio = 0;
        if(horas <= 3){
            for(int i=0;i<horas;i++){
                precio = precio + 1.5;
            }
        }
        else if(horas > 3){
            precio = precio + 4.5;
            for(int i=0;i<horas-3;i++){
                precio = precio + 0.2;
            }
        }
        precio = Math.round(precio);
        double pago = this.pagar();
        JOptionPane.showMessageDialog(null, "FACTURA\nMATRÍCULA COCHE: "
                +car.getMatricula()+"\nTIEMPO: "+horas+"h"
                +"\nPRECIO: "+precio+"\nDINERO RECIBIDO: "+pago
                +"\nDINERO DEVUELTO: "+(pago-precio)+"\n\nGRACIAS POR USAR NUESTRO APARCAMIENTO");
        numCoches--;
    }
    
}
