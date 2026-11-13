import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el divisor: ");
        int divisor = sc.nextInt();
        int division_factorial = dividirFactoriales(dividendo, divisor);
        System.out.println("El resultado es: " + division_factorial);
    }
    public static int dividirFactoriales(int dividendo, int divisor){
        int resultado = 1;
        for (int i = dividendo; i > divisor; i--){
            resultado = resultado * i;
        }
        return resultado;
    }

}
