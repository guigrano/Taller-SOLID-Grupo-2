/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplods;


public class Rectangulo implements Figura{
    private double ancho;
    private double largo;
    
    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    @Override
    public double calcularArea(){
        return ancho*largo;
    }
}
