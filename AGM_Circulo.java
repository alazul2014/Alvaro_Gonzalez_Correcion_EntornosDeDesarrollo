/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gonzalezmolinaalvaroexamenentornos;

/**
 *
 * @author alvaro.gonzalez12
 */
class AGM_Circulo {

    private int id;
    private double radio;
    private String color;

    @Override
    public String toString() {
        return "Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }

    // Métodos de calculo del área
    public void calculoAreaCirculo() {
        System.out.println("");
    }

    // Metodo de calculo de la diferencia
    public void calculoDiferencia() {
        System.out.println("");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AGM_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }
    
    
}

