import java.util.Scanner;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        //ejercicio();
        ejercicio7();
    }
 //Ejercicio 1: Escribe un programa que pida un número y diga si es o no múltiplo de 3
    public static void ejercicio1(){
        System.out.println("Introduzca un numero");
        int num1 = sc.nextInt();

            if (num1 % 3 == 0) {
            System.out.println("es multiplo de 3");      
            }
            else {
            System.out.println("no es multiplo de 3");
            }
    }
 /* 
 Escribe un programa que lee por teclado tres números enteros y calcula y muestra el
 mayor de los tres
 */
    public static void ejercicio2(){
        System.out.println("Introduzca 3 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

            if (num1 >= num2 && num1 >= num3) {
            System.out.println("el numero mayor es 1");
            }
            else if (num2 >= num1 && num2 >= num3) {
            System.out.println("el numero mayor es 2");
            }
            else {
            System.out.println("el numero mayor es 3");
            }
    }
/*
Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H, M, S correspondientes
a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será
mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará
comprendido entre 0 y 59 ambos incluidos.
*/
    public static void ejercicio3(){
        System.out.println("Introduzca la hora");
        int H = sc.nextInt();
        System.out.println("Introduzca los minutos");
        int M = sc.nextInt();
        System.out.println("Introduza los segundos");
        int S = sc.nextInt();
        boolean sonvalidos = true;

            if (H < 0 || H > 24) {
                System.out.println("hora inexistente");
                sonvalidos = false;
            }
            if (M < 0 || M > 59) {
                System.out.println("minutos inexistente");
                sonvalidos = false;
            }
            if (S < 0 || S > 59) {
                System.out.println("segundos inexistente");
                sonvalidos = false;
            }
            if (sonvalidos) {
                System.out.println("la hora es " + H + ":" + M + ":" + S + ":");
            }
    }
/*
Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en pantalla
el nombre en letras de ese número. Se debe controlar que se introduzca un número válido.
*/
       public static void ejercicio4(){
        System.out.println("Introduzca un numero entre 0 y 10");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;    
            default:
                System.out.println("numero no valido");
                break;
        }
    }
/*
Ejercicio 5: Escribe un programa que realice lo contrario que el anterior, es decir pide un número en
letras y enseña un número.

*/
    public static void ejercicio5(){
        System.out.println("Introduzca un numero en letras");
        String num = sc.nextLine();


        switch (num.toUpperCase()) {
            case "CERO":
                System.out.println("0");
                break;
            case "UNO":
                System.out.println("1");
                break;
            case "DOS":
                System.out.println("2");
                break;
            case "TRES":
                System.out.println("3");
                break;
            case "CUATRO":
                System.out.println("4");
                break;
            case "CINCO":
                System.out.println("5");
                break;
            case "SEIS":
                System.out.println("6");
                break;
            case "SIETE":
                System.out.println("7");
                break;
            case "OCHO":
                System.out.println("8");
                break;
            case "NUEVE":
                System.out.println("9");
                break;
            case "DIEZ":
                System.out.println("10");
                break;    
            default:
                System.out.println("no valido");
                break;
     }
    }
/* 
Ejercicio 6: Escribe un programa que lea una variable entera mes y compruebe si el valor
corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
mostrará además el nombre del mes.
*/
    public static void ejercicio6(){
        System.out.println("Introduzca un numero");
        int num1 = sc.nextInt();

            switch (num1) {
                case 1:
                    System.out.println("enero es 31");
                    break;
                case 2:
                    System.out.println("febrero es 28");
                    break;
                case 3:
                    System.out.println("marzo es 31");
                    break;
                case 4:
                    System.out.println("abril es 30");
                    break;
                case 5:
                    System.out.println("mayo es 31");
                    break;
                case 6:
                    System.out.println("junio es 30");
                    break;
                case 7:
                    System.out.println("julio es 31");
                    break;
                case 8:
                    System.out.println("agosto es 31");
                    break;
                case 9:
                    System.out.println("septiembre es 30");
                    break;
                case 10:
                    System.out.println("octubre es 31");
                    break;
                case 11:
                    System.out.println("noviembre es 30");
                    break;
                case 12:
                    System.out.println("diciembre es 31");
                    break;
                default:
                    System.out.println("mes inexistente");
                    break;
            }
    }
/*
Ejercicio 7: Escribe un programa que pida la nota de las tres evaluaciones, y si están aprobadas
realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si no, escribe que evaluación
debe recuperar. 
*/
     public static void ejercicio7(){
        System.out.println("Introduzca tres notas");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if (num1 + num2 + num3 / 5 < 5) {
            System.out.println("evaluación desaprovada");   
        }
        else {
            System.out.println("evaluación aprovada");
        }
    }
/*
Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el número de
horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir de ahí, las restantes
horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total del sueldo.
*/
     public static void ejercicio8(){
        System.out.println("Introduzca tres notas");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if (num1 + num2 + num3 / 5 < 5) {
            System.out.println("evaluación desaprovada");   
        }
        else {
            System.out.println("evaluación aprovada");
        }
    }
}

