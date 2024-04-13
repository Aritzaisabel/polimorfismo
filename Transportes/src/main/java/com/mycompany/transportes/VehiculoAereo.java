/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author alvar
 */
public class VehiculoAereo extends Vehiculo{
    private int numRuedas ;
    
    public VehiculoAereo(String marca,String modelo,int numRuedas){
        super(marca,modelo);
        this.numRuedas=numRuedas;
        
    }
    public void mostrarInfo(){
        super.mostrarinfo();
        System.out.println("numero de ruedas: "+numRuedas );
    }
}
