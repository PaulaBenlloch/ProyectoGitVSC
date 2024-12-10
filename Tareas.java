import java.util.Scanner;
public class Tareas {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        int suma;
        suma = a+b;
        System.out.print("La suma de " + a + " + " + b + " es: " + suma);
    }
}
