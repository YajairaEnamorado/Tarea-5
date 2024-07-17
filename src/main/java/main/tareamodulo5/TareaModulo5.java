/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.tareamodulo5;

/**
 *
 * @author Michel
 */
public class TareaModulo5 {

    public static void main(String[] args) {
        //AQUI  SE COLOCAN LOS DATO DE LAS FORMAS
        Circulo circulo = new Circulo(6);
        Linea linea = new Linea(11);
        Triangulo triangulo = new Triangulo(70);
        Cuadrado cuadrado = new Cuadrado(35);

        circulo.establecerColor("Magenta");
        linea.establecerColor("AzulMarino");
        triangulo.establecerColor("Rojo");
        cuadrado.establecerColor("Amarillo");

        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();
    }

    // e Formas
    public static abstract class Formas {
        protected String color;

        public Formas() {
            this.color = "Negro";
        }

        public abstract void dibujar();

        public void establecerColor(String color) {
            this.color = color;
        }
    }

    //  Circulo
    public static class Circulo extends Formas {
        private double radio;

        public Circulo(double radio) {
            super();
            this.radio = radio;
        }

        @Override
        public void dibujar() {
            System.out.println("Dibujando un círculo de color " + color + " con radio " + radio);
        }
    }

    //  Linea
    public static class Linea extends Formas {
        private double largo;

        public Linea(double largo) {
            super();
            this.largo = largo;
        }

        @Override
        public void dibujar() {
            System.out.println("Dibujando una línea de color " + color + " con largo " + largo);
        }
    }

    //  Triangulo
    public static class Triangulo extends Formas {
        private double angulo;

        public Triangulo(double angulo) {
            super();
            this.angulo = angulo;
        }

        @Override
        public void dibujar() {
            System.out.println("Dibujando un triángulo de color " + color + " con ángulo " + angulo);
        }
    }

    //  Cuadrado
    public static class Cuadrado extends Formas {
        private double area;

        public Cuadrado(double area) {
            super();
            this.area = area;
        }

        @Override
        public void dibujar() {
            System.out.println("Dibujando un cuadrado de color " + color + " con área " + area);
        }

        public double obtenerArea() {
            return area;
        }
    }
}
