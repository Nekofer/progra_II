/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracto;

/**
 *
 * @author Fernando
 */
public class rectangulo extends cfigeometrica {
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return base*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
