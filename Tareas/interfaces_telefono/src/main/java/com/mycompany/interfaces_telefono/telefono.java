/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_telefono;

/**
 *
 * @author Fernando
 */
public class telefono {
     protected String numero, compania;

    public telefono(String numero, String compania) {
        this.numero = numero;
        this.compania = compania;
    }
     
     public void HacerLlamada (String NumMar){
        System.out.println("Usted está llamando al número "+NumMar);
    }
    
    public void RecibirLlamada (String NumRec){
        System.out.println("Usted está recibiendo una llamada del número " +NumRec);
    }
     
     
}
