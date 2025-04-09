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
        // Crear instancias de círculo y rectángulo
        AGM_Circulo circulo1 = new AGM_Circulo(3, 3, "verde");
        AGM_Rectangulo rectangulo1 = new AGM_Rectangulo(3, 3.0, 3.0, "rojo");
        
        // Llamada a métodos extraídos
        double areaRectangulo = AGM_Rectangulo.calcularAreaRectangulo(rectangulo1);
        double areaCirculo = AGM_Circulo.calcularAreaCirculo(circulo1);
        double diferencia = calcularDiferencia(areaRectangulo, areaCirculo);

        // Imprimir resultados
        System.out.println("Area del rectangulo: " + areaRectangulo);
        System.out.println("Area del circulo: " + areaCirculo);
        System.out.println("Diferencia entre areas: " + diferencia);
        
        // Imprimir los datos de los objetos
        System.out.println("Rectangulo: " + rectangulo1);
        System.out.println("Circulo: " + circulo1);
    }


    // Metodo para calcular la diferencia entre areas
    public static double calcularDiferencia(double areaRectangulo, double areaCirculo) {
        return areaRectangulo - areaCirculo;
    }
}