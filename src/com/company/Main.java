package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circulo> Figuras = new ArrayList<>();
        Circulo circulo = new Circulo();
           Figuras.add(circulo);
        System.out.println(circulo.Area(2));
    }
}