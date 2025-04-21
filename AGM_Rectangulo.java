/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gonzalezmolinaalvaroexamenentornos;

/**
 *
 * @author alvaro.gonzalez12
 */
class AGM_Rectangulo {
    

    int id;
    double ladoA;
    double ladoB;
    String Color;

    public AGM_Rectangulo(int id, double ladoA, double ladoB, String Color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", Color=" + Color + '}';
    } 
    
    
}
    
