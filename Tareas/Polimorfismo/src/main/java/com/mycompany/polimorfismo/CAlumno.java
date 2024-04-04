/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Fernando
 */
public class CAlumno extends CDeptRobotica {
    private String Carrera;
    private int Semestre;
    private String Status;

    public CAlumno(String Carrera, int Semestre, String Status, String Id, String Nombre) {
        super(Id, Nombre);
        this.Carrera = Carrera;
        this.Semestre = Semestre;
        this.Status = Status;
    }

    @Override
    public String MostrarDatos() {
            return super.MostrarDatos()+ "CAlumno{" + "Carrera=" + Carrera + ", Semestre=" + Semestre + ", Status=" + Status + '}';
    }
    

}
