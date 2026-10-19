/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplods;

/**
 *
 * @author ACER
 */

import java.util.List;


public class Calculadora {
    
//Siguiendo el principio DIP la clase confia en la abstraccion de la interfaz
    //No esta atada a clases concretas como Triangulo o Rectangulo
    public double sumarAreas(List<Figura> figuras) {
        double areaTotal = 0;
        
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        
        return areaTotal;
    }
}
