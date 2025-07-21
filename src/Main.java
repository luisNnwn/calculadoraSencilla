import modelo.Calculadora;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int numeroA;
        int numeroB;
        int opcion;
        numeroA = calculadora.getA();
        numeroB = calculadora.getB();

        do {
            System.out.println("CALCULADORA");
            System.out.println("Seleccione una operacion: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    //aunque para que quedara mas limpio pude haber puesto los inputs en cada funcion
                    System.out.println("Ingrese el primer numero: ");
                    numeroA = scanner.nextInt();
                    calculadora.setA(numeroA);
                    System.out.println("Ingrese el segundo numero: ");
                    numeroB = scanner.nextInt();
                    calculadora.setB(numeroB);
                    System.out.println("Resultado: " + calculadora.sumarNumeros());
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    numeroA = scanner.nextInt();
                    calculadora.setA(numeroA);
                    System.out.println("Ingrese el segundo numero: ");
                    numeroB = scanner.nextInt();
                    calculadora.setB(numeroB);
                    System.out.println("Resultado: " + calculadora.restarNumeros());
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    numeroA = scanner.nextInt();
                    calculadora.setA(numeroA);
                    System.out.println("Ingrese el segundo numero: ");
                    numeroB = scanner.nextInt();
                    calculadora.setB(numeroB);
                    System.out.println("Resultado: " + calculadora.multiplicarNumeros());
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    numeroA = scanner.nextInt();
                    calculadora.setA(numeroA);
                    System.out.println("Ingrese el segundo numero: ");
                    numeroB = scanner.nextInt();
                    calculadora.setB(numeroB);
                    System.out.println("Resultado: " + calculadora.dividirNumeros());
                    break;
                default:
                    System.out.println("Gracias por usar la calculadora.");
            }
        } while (opcion != 5);
    }


}