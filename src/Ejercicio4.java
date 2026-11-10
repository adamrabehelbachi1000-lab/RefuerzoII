import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int moda_numero = moda(numeros);
        System.out.println("El numero mas repetido del conjunto de numeros es: " +  moda_numero);
    }
    public static int moda(int[] numeros){
       int max_repetidos = 0;
       int repeticiones = 0;
       int moda = 0;
        for(int i = 0; i < numeros.length; i++){
            repeticiones = 0;
            for(int j = 0 ; j < numeros.length; j++){
                if (numeros[j] == numeros[i]){
                    repeticiones++;
                }

            }
            if (repeticiones > max_repetidos){
                max_repetidos = repeticiones;
                moda = numeros[i];
            }
        }
        return moda;
    }
}
