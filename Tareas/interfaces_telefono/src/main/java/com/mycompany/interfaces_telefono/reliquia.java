/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_telefono;

/**
 *
 * @author Fernando
 */
public class reliquia {
     protected String marca, ubicacion;

    public reliquia(String marca, String ubicacion) {
        this.marca = marca;
        this.ubicacion = ubicacion;
    }

     public void HacerLlamada (String RL){
        System.out.println("Usted está escribiendo el mensaje "+RL);
    }
    
    public void RecibirLlamada (String RE){
        System.out.println("Usted está enviando el mensaje " +RE);
    }
}
