/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_telefono;

/**
 *
 * @author Fernando
 */
public class telefonocelular extends telefono implements comunicador{
    
    private String modelo, pixeles;

    public telefonocelular(String modelo, String pixeles, String numero, String compania) {
        super(numero, compania);
        this.modelo = modelo;
        this.pixeles = pixeles;
    }
    
    public void caracterisiticas1(){
        System.out.println("El modelo del celular es: "+modelo+"\n"+"Tiene estos pixeles: "+pixeles+"\n");
        System.out.println("El numero del telefono es: "+numero+"\n"+"Compania: "+compania+"\n");
    }

   public void jugar(String Juego){
        System.out.println("Usted está jugando "+Juego);
    }
    
    @Override
    public void enviarmensaje(){
        System.out.println("Abir aplicación de mensaje, escribir mensaje, enviar mensaje");
    }
    
    
    
    
}
