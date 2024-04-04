/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Fernando
 */
public class CTutor extends CDeptRobotica {
   String Cargo,Tiempo;
   int Horasgrupo;

    public CTutor(String Cargo, String Tiempo, int Horasgrupo, String Id, String Nombre) {
        super(Id, Nombre);
        this.Cargo = Cargo;
        this.Tiempo = Tiempo;
        this.Horasgrupo = Horasgrupo;
    }

   
    
    public String MostrarDatos() {
        return super.MostrarDatos()+"CTutor{" + "Cargo=" + Cargo + ", Tiempo=" + Tiempo + ", Horasgrupo=" + Horasgrupo + '}';
    }
   
   
}
