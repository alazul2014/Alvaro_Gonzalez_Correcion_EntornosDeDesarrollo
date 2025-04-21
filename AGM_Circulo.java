/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gonzalezmolinaalvaroexamenentornos;

/**
 * Clase que representa un círculo con identificador, radio y color.
 * Permite acceder y modificar sus atributos, así como calcular su área.
 * 
 * @author alvaro.gonzalez12
 */
class AGM_Circulo {

    private int id;
    private double radio;
    private String color;

    /**
     * Constructor de la clase AGM_Circulo.
     * 
     * @param id Identificador único del círculo
     * @param radio Radio del círculo
     * @param color Color del círculo
     */
    public AGM_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    /**
     * Obtiene el identificador del círculo.
     * 
     * @return ID del círculo
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del círculo.
     * 
     * @param id Nuevo ID del círculo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el radio del círculo.
     * 
     * @return Radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio del círculo.
     * 
     * @param radio Nuevo valor para el radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Obtiene el color del círculo.
     * 
     * @return Color del círculo
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del círculo.
     * 
     * @param color Nuevo color del círculo
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve una representación en texto del círculo.
     * 
     * @return Cadena con los atributos del círculo
     */
    @Override
    public String toString() {
        return "Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }

    /**
     * Calcula el área de un círculo utilizando su radio.
     * 
     * @param circulo Objeto AGM_Circulo del cual se va a calcular el área
     * @return Área del círculo (π * radio^2)
     */
    public static double calcularAreaCirculo(AGM_Circulo circulo) {
        return circulo.getRadio() * circulo.getRadio() * Math.PI;
    }
}
