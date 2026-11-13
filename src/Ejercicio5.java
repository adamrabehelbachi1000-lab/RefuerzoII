import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
    }
    public static double mediana(int[] numeros){
        Arrays.sort(numeros);
        if (numeros.length % 2 != 0) {
            return numeros[numeros.length / 2];
        } else {
            int posicion1 = numeros.length / 2 - 1;
            int posicion2 = numeros.length / 2;
            return (numeros[posicion1] + numeros[posicion2]) / 2.0;
        }
    }
}
