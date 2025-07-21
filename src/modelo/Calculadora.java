package modelo;

/*El objetivo de este sencillo ejercicio fue poder practicar
* la manera en que se estructuran las clases o modelos
* como preparación para repasar poo.
*
* Elaboré una calculadora sencilla, con una sola clase, cuatro
* metodos que realizan las operaciones y el uso de instancias de
* objetos*/

public class Calculadora {

    //primero creamos los atributos de la clase
    //solo necesitabamos dos porque la naturaleza de las operaciones
    //asi lo demandaba:
    //suma: sumandos (Ambos números)
    //resta: minuendo y sustraendo
    //multiplicacion: multiplicando y multiplicador
    //resta: dividendo y divisor
    int a;
    int b;


    //constructor vacio por defecto
    /*Este constructor lo declaré explicitamente, aunque
    * como ya sabemos Java crea uno por defecto, este es un
    * constructor vacío*/
    public Calculadora(){

    }

    /*Este es el constructor con parametros*/
    public Calculadora (int a, int b){
        this.a = a;
        this.b = b;
    }

    /*Estos metodos get y set son los que me permitieron
    * poder acceder y setear los valores que
    * el usuario iba ingresando a los atributos de los objetos*/
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

    /*Estos son metodos simples, que retornan en sí la operación
    * requerida a realizarse*/
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
