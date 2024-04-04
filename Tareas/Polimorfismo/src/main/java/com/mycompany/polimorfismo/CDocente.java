/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Fernando
 */
public class CDocente extends CDeptRobotica {
   String Tipo,Depto;
   int NHoras,NGrupos;

    public CDocente(String Tipo, String Depto, int NHoras, int NGrupos, String Id, String Nombre) {
        super(Id, Nombre);
        this.Tipo = Tipo;
        this.Depto = Depto;
        this.NHoras = NHoras;
        this.NGrupos = NGrupos;
    }
    
    public String MostrarDatos() {
        return super.MostrarDatos()+ "CDocente{" + "Tipo=" + Tipo + ", Depto=" + Depto + ", NHoras=" + NHoras + ", NGrupos=" + NGrupos + '}';
    }
   

}
