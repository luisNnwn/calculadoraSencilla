package modelo;

import java.util.Scanner;

public class Calculadora {

    int a;
    int b;


    //constructor vacio por defecto
    public Calculadora(){

    }

    //constructos con parametros
    public Calculadora (int a, int b){
        this.a = a;
        this.b = b;
    }

    //metodos para acceder a los datos y setearlos
    public int getA(){
        return a;
    }

    public void setA (int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /*METODOS CON LAS OPERACIONES DE LA CALCULADORA*/
    public int sumarNumeros(){
        return a + b;
    }

    public int restarNumeros () {
        return a - b;
    }

    public int multiplicarNumeros() {
        return a * b;
    }

    public double dividirNumeros () {
        return a / b;
    }
}
