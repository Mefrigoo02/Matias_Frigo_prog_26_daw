import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        //ejercicio();
         ejercicio6();  
 }
 //Ejercicio 1: Construye un programa que pida dos números al usuario e indique cuál es mayor o si son iguales.
    
    public static void ejercicio1(){
     System.out.println("introduzca un numero");
     int num1 = sc.nextInt();
     
     System.out.println("Introduzca otro numero");
     int num2 = sc.nextInt();

     if (num1 > num2){
        System.out.println("El numero" + num1 + " es mayor que el numero" + num2);
     }
     else if (num2 > num1){
        System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
     }
     else{
        System.out.printf("los numeros %d y %d son iguales", num1, num2);
     }
    }
 //Ejercicio 2: Construye un programa que pida un número al usuario y nos indique si es par o impar.
    public static void ejercicio2(){
     System.out.println("introduzca un numero");
     int num = sc.nextInt();
     
     if (num % 2 == 0){
        System.out.println(num + " es par" );    
     }
     else {
        System.out.println(num + " es impar");
     }
 }
 
 /*Ejercicio 3: Construye un programa que pida dos números al usuario y muestre el resultado de su
   división. Si el segundo número es 0, debe mostrar un mensaje de error.
 */
    public static void ejercicio3(){
     System.out.println("introduzca dos numeros");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();

     if (num2 == 0){
        System.out.println("error" );    
     }
     else {
         int division = num1 / num2;
         System.out.println("resultado es " + division);
     }
 }
 /*Ejercicio 4: Construye un programa que pida dos números al usuario. Debe calcular el resultado de 
   elevar el primero (base) al segundo (exponente) teniendo en cuenta lo siguiente:
   Si el exponente es cero el resultado es 1
   En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la función que
   calcula la potencia)
*/
    public static void ejercicio4(){
     System.out.println("introduzca dos numeros");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();

     if (num2 == 0){
        System.out.println(" el resultado es 1" );    
     }
     else {
         double exp = Math.pow(num1, num2);
         System.out.println("resultado es " + exp);
     }
 }
/*   Ejercicio 5: Construye un programa que exprese si un triángulo es isósceles, equilátero o escaleno y
si es rectángulo. Para ello debe recibir por teclado 3 valores correspondiente a la medida de sus
lados.
*/

   public static void ejercicio5(){
     System.out.println("introduzca 3 valores");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();

     if (num1 == num2 && num2 == num3 && num1 == num3){
        System.out.println("es equilatero" );    
     }
     else if (num1 == num2 || num2 == num3 || num1 == num3) {
         System.out.println("es isoseles ");
     }
     else {
         System.out.println("es escaleno " );
     }
 }
/* 
Ejercicio 6: Un instituto está organizando un viaje y te piden que construyas un programa que
calcule el coste total del viaje y lo que le supone a cada alumno en función de lo siguiente:
   o Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
   o De 30 a 49 alumnos, deberán pagar 48€ por alumno.
   o De 20 a 29 alumnos, deberán pagar 56€ por alumno.
   o Menos de 20 alumnos, deberán abonar un total de 2000 euros en total.
*/
 public static void ejercicio6(){
     System.out.println("introduzca cantidad de alumnos");
     int num1 = sc.nextInt();
     int precio = 0;

   switch (num1/10) {
      case 0: 
      case 1: 
         precio = 2000;
         break;
      case 2:
         precio = 56*num1;
         break;
      case 3:
      case 4:
         precio = 48 * num1;
         break;
      default:
         precio = 40 * num1;
         break;
   }
    System.out.println("el precio es " + precio);
 }
}
