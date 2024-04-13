/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author alvar
 */
public class VehiculoEspacial  extends Vehiculo{
    private String resistenciaTermica;
    
    public VehiculoEspacial(String marca,String modelo,String resistenciaTermica){
        super (marca,modelo);
        this.resistenciaTermica=resistenciaTermica;
    }
    public void mostrarInfo(){
    super.mostrarinfo();
        System.out.println("Tipo de resistencia "+ resistenciaTermica);
}
    
} 
