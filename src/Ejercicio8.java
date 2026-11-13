import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int falta = cualFalta(numeros);
        System.out.println("Falta el numero " + falta);

    }
    public static int cualFalta(int[] numeros){
        boolean falta = false;
        int cual_falta = -1;
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i+1] - 1){
                falta = false;
            }else {
                falta = true;
                cual_falta = numeros[i] + 1;
            }
        }
        return cual_falta;
    }

}
