/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gonzalezmolinaalvaroexamenentornos;

/**
 * Clase que representa un rectángulo con un identificador, dos lados y un color.
 * Permite calcular su área y obtener información de sus propiedades.
 * 
 * @author alvaro.gonzalez12
 */
class AGM_Rectangulo {

    int id;
    double ladoA;
    double ladoB;
    String Color;

    /**
     * Constructor de la clase AGM_Rectangulo.
     * 
     * @param id Identificador único del rectángulo
     * @param ladoA Longitud del primer lado
     * @param ladoB Longitud del segundo lado
     * @param Color Color del rectángulo
     */
    public AGM_Rectangulo(int id, double ladoA, double ladoB, String Color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.Color = Color;
    }

    /**
     * Obtiene el identificador del rectángulo.
     * 
     * @return ID del rectángulo
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del rectángulo.
     * 
     * @param id Nuevo ID del rectángulo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la longitud del lado A del rectángulo.
     * 
     * @return Lado A
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * Establece la longitud del lado A del rectángulo.
     * 
     * @param ladoA Nuevo valor para el lado A
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * Obtiene la longitud del lado B del rectángulo.
     * 
     * @return Lado B
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * Establece la longitud del lado B del rectángulo.
     * 
     * @param ladoB Nuevo valor para el lado B
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * Obtiene el color del rectángulo.
     * 
     * @return Color del rectángulo
     */
    public String getColor() {
        return Color;
    }

    /**
     * Establece el color del rectángulo.
     * 
     * @param Color Nuevo color del rectángulo
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Devuelve una representación en texto del rectángulo.
     * 
     * @return Cadena con los atributos del rectángulo
     */
    @Override
    public String toString() {
        return "Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", Color=" + Color + '}';
    }

    /**
     * Calcula el área de un rectángulo usando sus lados.
     * 
     * @param rectangulo Objeto AGM_Rectangulo del cual se va a calcular el área
     * @return Área del rectángulo (ladoA * ladoB)
     */
    public static double calcularAreaRectangulo(AGM_Rectangulo rectangulo) {
        double ladoA = rectangulo.getLadoA();
        double ladoB = rectangulo.getLadoB();
        return ladoA * ladoB;
    }
}
