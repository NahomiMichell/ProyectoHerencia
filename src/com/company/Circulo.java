package com.company;

import static java.lang.Math.*;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio){
      this.radio = radio;
    }

    public Circulo() {

    }

    public double Area (double radio){
        super.area = PI * pow(radio,2);
        return area;
    }
    public double Perimetro (double radio){
        super.perimetro = 2 * PI * radio;
        return perimetro;
    }
    public double perimetroConDiametro (double diametro){
        double pcd = PI * diametro;
        return pcd;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setArea(double area) {

    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public void setPerimetro(double perimetro) {

    }
}
