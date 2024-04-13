/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author alvar
 */
public class Transportes {
public static void main(String[]args){
    //crear un vehiculo terrestre
    VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre(" Mattel"," Terreneito",4);
    VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico(" Lancha"," Yamaha,"," Motor prr prr");
    VehiculoAereo vehiculoAereo=new VehiculoAereo(" Being"," Airbus",3);
    VehiculoEspacial vehiculoEspacial=new VehiculoEspacial(" Chirlls"," Frerks","654");
    //mostrar informacion de los vehuiculos 
    System.out.println("Información del vehículo terrestre : ");
    vehiculoTerrestre.mostrarInfo();
    
    System.out.println("Información del vehículo acuatico: ");
    vehiculoAcuatico.mostrarInfo();
    
    System.out.println("Información del vehículo aereo: ");
    vehiculoAereo.mostrarInfo();
   
    System.out.println("Informacion del vehiculo espacial");
    vehiculoEspacial.mostrarInfo();
}
}
