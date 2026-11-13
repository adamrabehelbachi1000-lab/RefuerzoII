import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        boolean esHyperpar = esHyperpar(numero);
        if (esHyperpar) {
            System.out.println("El numero " + numero + " es Hyperpar");
        }else  {
            System.out.println("El numero " + numero + " no es Hyperpar");
        }

    }
    public static boolean esHyperpar(int numero){
        String digitos = String.valueOf(numero);
        boolean hyperpar = false;
        for(int i = 0; i < digitos.length(); i++){
            int digito = Character.getNumericValue(digitos.charAt(i));
            if(digito % 2 == 0){
                hyperpar = true;
            }else {
                hyperpar = false;
                break;
            }
        }
        return hyperpar;
    }

}
