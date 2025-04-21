/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gonzalezmolinaalvaroexamenentornos;

/**
 * Clase principal del programa que crea instancias de figuras geométricas
 * (círculo y rectángulo), calcula sus áreas y muestra la diferencia entre ellas.
 * También imprime los detalles de los objetos creados.
 * 
 * @author alvaro.gonzalez12
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * Crea las figuras, calcula áreas, diferencia e imprime resultados.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        
        // Constantes descriptivas
        final int ID_CIRCULO = 1;
        final int ID_RECTANGULO = 2;
        final int RADIO_CIRCULO = 3;
        final double LADO_A_RECTANGULO = 3.0;
        final double LADO_B_RECTANGULO = 3.0;
        final String COLOR_CIRCULO = "verde";
        final String COLOR_RECTANGULO = "rojo";

        // Crear instancias de círculo y rectángulo
        AGM_Circulo circulo1 = new AGM_Circulo(ID_CIRCULO, RADIO_CIRCULO, COLOR_CIRCULO);
        AGM_Rectangulo rectangulo1 = new AGM_Rectangulo(ID_RECTANGULO, LADO_A_RECTANGULO, LADO_B_RECTANGULO, COLOR_RECTANGULO);
        
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

    /**
     * Calcula la diferencia entre el área del rectángulo y el área del círculo.
     *
     * @param areaRectangulo Área del rectángulo
     * @param areaCirculo Área del círculo
     * @return Diferencia entre ambas áreas (rectángulo - círculo)
     */
    public static double calcularDiferencia(double areaRectangulo, double areaCirculo) {
        return areaRectangulo - areaCirculo;
    }
}
