/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gonzalezmolinaalvaroexamenentornos;

/**
 *
 * @author alvaro.gonzalez12
 */
public class Main {

    public static void main(String[] args) {

        AGM_Circulo circulo1 = new AGM_Circulo(3, 3, "verde");
        AGM_Rectangulo rectangulo1 = new AGM_Rectangulo(3, 3.0, 3.0, "rojo");

        // Calcular area rectangulo
        double ladoA = rectangulo1.getLadoA();
        double ladoB = rectangulo1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area cuadrado: " + area1);

        // Calcular area circulo
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * radio1 * 3.14;
        System.out.println("Area circulo: " + area2);

        // Calcular diferencia entre areas
        double diferencia = area1 - area2;
        System.out.println("Diferencia areas: " + diferencia);

        // Imprimir datos
        System.out.println("Cuadrado: " + rectangulo1);
        System.out.println("Circulo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
}
