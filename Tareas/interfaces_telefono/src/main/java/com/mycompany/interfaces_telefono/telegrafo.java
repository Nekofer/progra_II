/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_telefono;

/**
 *
 * @author Fernando
 */
public class telegrafo extends reliquia implements comunicador{
    private String codigo, tamanio;

    public telegrafo(String codigo, String tamanio, String marca, String ubicacion) {
        super(marca, ubicacion);
        this.codigo = codigo;
        this.tamanio = tamanio;
    }
    
    public void caracterisiticas3(){
        System.out.println("La marca del telegrafo es: "+marca+"\n"+"La ubicacion en donde se encuentra el telegrafo es: "+ubicacion+"\n");
        System.out.println("El codigo para inciar el mensaje es: "+codigo+"\n"+"El tamnio del telegrafo es: "+tamanio+"\n");
    }

   public void escribir(String e){
        System.out.println("Usted está digitalizando el mensaje "+e);
    }
    
    @Override
    public void enviarmensaje(){
        System.out.println("Recibir el mensaje, traducirlo, escribir mensaje traducido y enviar mensaje");
    }
    
    
}
