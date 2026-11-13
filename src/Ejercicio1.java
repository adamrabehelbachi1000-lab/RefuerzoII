import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros: ");
        int[] numeros = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        String modo_orden = orden(numeros);
        System.out.println(modo_orden);
    }
    public static String orden(int[] numeros){
        boolean ascendente = false;
        boolean descendente = false;
        boolean iguales = false;
        boolean desordenado = false;
        String orden = "";

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] <= numeros[i + 1]) {
                ascendente = true;
            }else {
                ascendente = false;
                break;
            }
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] >= numeros[i + 1]) {
                descendente = true;
            } else {
                descendente = false;
                break;
            }
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1] ) {
                iguales = true;
            }else {
                iguales = false;
                break;
            }
        }
        if (iguales){
            orden = "Iguales";
        }else if (descendente){
            orden = "Descendente";
        }else if (ascendente){
            orden = "Ascendente";
        }else{
            orden = "Desordenado";
        }
        return orden;
    }
}
