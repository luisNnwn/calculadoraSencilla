//importante el import, ya que nuestra clase Calculadora
//se encuentra en un distinto nivel
import modelo.Calculadora;
//el import de el scanner
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //aca se instancia el objeto de la clase scanner
        //que permite las entradas de texto del usuario
        Scanner scanner = new Scanner(System.in);
        /*Aca instancio un objeto de Clase calculadora
        * haciendo uso del constructor*/
        Calculadora calculadora = new Calculadora();
        /*Estas variables a continuación son para poder
        * asignarles los metodos .get() a través del objeto*/
        int numeroA;
        int numeroB;
        /*Esta variable es para usarla en la estructura switch
        * y las opciones de los cases*/
        int opcion;
        /*Aca lo que hago es que le asigno a las variables que
        * cree el valor del objeto calculadora a través de los
        * metodos get*/
        numeroA = calculadora.getA();
        numeroB = calculadora.getB();

        /*Acá uso el do while porque me gusta jaj aunque es ideal
        * si quiero repetir el switch cada vez que se realiza una
        * operacion, a no ser que el usuario se salga del prorama*/
        do {
            System.out.println("CALCULADORA");
            System.out.println("Seleccione una operacion: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            //tomo la variable opcion
            opcion = scanner.nextInt();
            //en la condicion del switch le paso la opcion capturada
            //anteriormente
            switch (opcion) {
                case 1:
                    /*Acá pude haber simplificado en una sola linea
                    * el contenido de los case a través de hacer una funcion
                    * luego del codigo main y luego llamarla aca...
                    *
                    * otsea, separar la lógica para capturar los valores
                    * en una función y luego llamar eso aca*/
                    System.out.println("Ingrese el primer numero: ");
                    /*capturo asignando el valor de la variable numeroA
                    * a el valor que se captura del usuario*/
                    numeroA = scanner.nextInt();
                    /*ahora a través del objeto llamo al metodo setA y le paso
                    * el valor que ya capture. Esto es importante porque el metodo
                    * setA(), tiene por firma: public void setA (int a), lo que indica
                    * que debe recibir un número entero y para cada vez que se
                    * captura una entrada del usuario se hace eso */
                    calculadora.setA(numeroA);
                    System.out.println("Ingrese el segundo numero: ");
                    numeroB = scanner.nextInt();
                    calculadora.setB(numeroB);
                    /*Ahora a través del objeto calculadora accedo al
                    * metodo correspondiente del case, en este caso la suma*/
                    System.out.println("Resultado: " + calculadora.sumarNumeros());
                    break; //sale del case con break, si se cumple termina.. aunque el menu se repite por el do while
                case 2:
                    /*para el demás codigo siguiente, el procedimiento es el mismo*/
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
            /*En la condicion del while evaluo aceptar cualquiera
            * de las condiciones del menu, exceptuando el 5 para poder
            * repetir el menu*/
        } while (opcion != 5);
    }


}