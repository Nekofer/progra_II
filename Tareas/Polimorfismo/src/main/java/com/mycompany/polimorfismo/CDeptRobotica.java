/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Fernando
 */
public class CDeptRobotica {
    protected String Id;
    protected String Nombre;

    public CDeptRobotica(String Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
    }

    
    public String MostrarDatos() {
        return "CDeptRobotica{" + "Id=" + Id + ", Nombre=" + Nombre + '}';
    }
    
    
}
