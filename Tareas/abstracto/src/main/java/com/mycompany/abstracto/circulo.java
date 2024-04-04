/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracto;

/**
 *
 * @author Fernando
 */
public class circulo extends cfigeometrica{
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return 3.1416*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    
    
    
    
}
