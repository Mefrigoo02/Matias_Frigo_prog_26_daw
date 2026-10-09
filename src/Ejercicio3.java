import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        //ejercicio();
        ejercicio7();
    }
 /*
 Ejercicio 1: Realizar un programa que imprima en pantalla los números del 1 al 100. (Debes hacerlo
 con las tres estructuras iterativas vistas: while, do while y for). 
 */
    public static void ejercicio1(){
        int i = 1 ;
        
        while (i<=100) {
            System.out.println(i);

            i = i + 1;
        }
    }

      public static void ejercicio1_2(){
     
    int i = 1;

        do {
        System.out.println(i);
        i = i + 1;
        } while (i <= 100);
    }

      public static void ejercicio1_3(){
     
    int i = 1;

        do {
        System.out.println(i);
        i = i + 1;
        } while (i <= 100);
    }
/*
Ejercicio 2: Escribir un programa que solicite un valor positivo y nos muestre desde 1 hasta el valor
ingresado de uno en uno.
*/
    public static void ejercicio2(){
        System.out.println("Introduza un valor positvo");
        int num = sc.nextInt();

        int i = 1;

        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
/*
Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre
posteriormente la suma de los valores ingresados y su promedio.
*/
     public static void ejercicio3(){
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el valor " + i + ": ");
            int num = sc.nextInt();

            suma = suma + num;
        }

        promedio = (double) suma / 10;

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
/*
Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
o Guarda en una variable tu nombre.
o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca por teclado.
o El programa finaliza cuando el usuario adivina tu nombre. Sino el programa debe continuar
pidiendo al usuario que lo intente otra vez.
*/
      public static void ejercicio4(){
       String nombre = "carlos";
       String intento;

       System.out.println("Adivina mi nombre");

       intento = sc.nextLine();
       while (!intento.equals(nombre)) {
            System.out.println("Nombre incorrecto, intentalo otra vez");
            intento = sc.nextLine();
        
       }
        System.out.println("Correcto, lo has adivinado");
    }
/* 
Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y muestre al usuario el resultado
de la tirada. Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que el
resultado es el mismo. La aplicación se debe repetir hasta que el usuario indique que no quiere tirar
más (preguntando por ‘s’ o ‘n’, o “si” o “no”).
*/
      public static void ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String respuesta;

        do {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);

            if (dado1 == dado2) {
                System.out.println("¡Los dos dados tienen el mismo número!");
            }

            System.out.print("¿Quieres tirar otra vez? (s/n): ");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Fin del programa.");

        teclado.close();
    
    }
/*
Ejercicio 6: Realizar un juego para adivinar un número. Para ello primero, el programa debe guardar
un número en una variable y el usuario debe introducir números hasta acertarlos. Para darle pistas
al usuario se le indicará “mayor” o “menor” según sea mayor o menor con respecto al número
guardado. El proceso termina cuando el usuario acierta.
*/
     public static final int VALOR_SECRETO = 4;  
     public static void ejercicio6(){
      System.out.println("Empieza el juego");
      System.out.println("adivina el numero");
      boolean acierta = false;
       while (!acierta) {
        int valor = Integer.parseInt(sc.next () );
        sc.nextLine ();

        if (VALOR_SECRETO !=valor) {
            System.out.println("Has fallado, inentalo otra vez");
        }
        else {
            acierta = true ;
       }
    }
        System.out.println("Enorabuena lo has acertado");
    }
/*
 Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre la hora sin parar. Debe
esperar un segundo real para darle más realismo. Pasos:
o Pide al usuario que introduzca la hora y los minutos.
o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
o Cada vez que transcurra un segundo incrementa la hora comprobando si hay cambio de
minuto y hora
o Muéstralo por pantalla.
Thread.sleep(1000);
(Nota: La función Thread.sleep
*/
    public static void ejercicio7() {
        System.out.println("Introduzca la hora y los minutos");
        int hora = sc.nextInt();
        int min = sc.nextInt();
        int seg = 0;
        int milseg;

}
/*
Ejercicio 8: Escriba un programa que calcule el factorial de un número. El factorial de un número es
igual al producto de todos los números enteros positivos desde 1 hasta dicho número.

*/
   public static void ejercicio8() {
        System.out.println("Introduzca la hora y los minutos");

}
/*
Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. La altura de la escalera se lee
por teclado. Ejemplo: Si introducimos un 5 nos queda:
*
**
***
****
*****
Posteriormente hacer lo mismo, pero con la pirámide invertida.
*/
   public static void ejercicio9() {
        System.out.println("Introduzca la hora y los minutos");

}
}
