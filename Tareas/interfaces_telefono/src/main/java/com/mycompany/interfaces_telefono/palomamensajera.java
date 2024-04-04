/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_telefono;

/**
 *
 * @author Fernando
 */
public class palomamensajera extends paloma implements comunicador {

    private String raza, duenio;

    public palomamensajera(String raza, String duenio, String nombre, String color) {
        super(nombre, color);
        this.raza = raza;
        this.duenio = duenio;
    }
    
    public void caracterisiticas2(){
        System.out.println("El nombre de la paloma es: "+nombre+"\n"+"El color de la paloma es: "+color+"\n");
        System.out.println("La raza de la paloma es: "+raza+"\n"+"El duenio de la paloma es: "+duenio+"\n");
    }

   public void alimentar(String comida){
        System.out.println("Usted está alimentando a la paloma "+comida);
    }
    
    @Override
    public void enviarmensaje(){
        System.out.println("Recibir paloma, agarrar el recado de su pata, escribir mensaje y colocarlo nuevamnete en su pata, enviar paloma de regreso");
    }



    
}
