/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_de_clase_y_metodo_final;

/**
 *
 * @author Fernando
 */

//definicion de la clase final del area del circulo
public final class circulo {
    private final double PI = 3.1416; // Constante
    private double radio;
    
//constructor 
    public circulo(double radio) {
        this.radio = radio;
    }
    
    // Método final para calcular el área del círculo
    public final double calcularArea() {
        return PI * radio * radio;
    }
    
    
    
}


