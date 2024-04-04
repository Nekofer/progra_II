/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author Fernando
 */
public class Polimorfismo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CDeptRobotica robotica []= new CDeptRobotica [4];
        robotica[0] = new CDeptRobotica ("55858","Ángel");
        robotica [1]= new CAlumno ("ing robotica",4,"baja de la vida","261553","Karen Gisel");
        robotica [2]= new CDocente("Maestro","ingenieria",4,4,"45524","Omar");
        robotica [3]= new CTutor("tutor","6 meses",40,"43522","Poncho");
        
        for( CDeptRobotica integrantes: robotica){
            System.out.println(integrantes.MostrarDatos());
            System.out.println("");
        }
        
        
        
    }
}
