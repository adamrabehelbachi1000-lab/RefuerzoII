import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String digitos = sc.next();
        String suma_total = sumaDigitos(digitos);

        for(int i = 0; i < digitos.length(); i++) {
            int numero = Integer.parseInt("" + digitos.charAt(i));
            if (i<digitos.length()-1) {
                System.out.print(numero + " + ");
            }else {
                System.out.print(numero + " = " + suma_total);
            }
        }
    }
    public static String sumaDigitos(String digitos){
        int suma = 0;
        for(int i = 0; i < digitos.length(); i++){
            int numero = Integer.parseInt("" + digitos.charAt(i));
            suma = suma + numero;
        }
        return String.valueOf(suma);
    }
}
