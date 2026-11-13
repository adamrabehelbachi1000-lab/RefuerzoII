import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String digitos = sc.next();
        String suma_total = sumaDigitos(digitos);
    }
    public static String sumaDigitos(String digitos) {
        int suma = 0;
        String resultado = "";
        for (int i = 0; i < digitos.length(); i++) {
            int numero = Integer.parseInt("" + digitos.charAt(i));
            suma = suma + numero;
            resultado = resultado + numero;

            if (i < digitos.length() - 1) {
                resultado = resultado + " + ";
            }
        }
        resultado = resultado + " = " + suma;
        return resultado;
    }
}
