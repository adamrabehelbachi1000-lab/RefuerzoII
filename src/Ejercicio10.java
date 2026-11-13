import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos compartimientos hay: ");
        int compartimientos = sc.nextInt();

        System.out.println("Introduce cual es la capacidad del compartimiento mas grande: ");
        int maxLitros = sc.nextInt();

        System.out.println("Introduce la diferencia de litros: ");
        int diferencia = sc.nextInt();

        int litros = litros(compartimientos, maxLitros, diferencia);
        System.out.println("El resultado es: " + litros);
    }
    public static int litros(int compartimentos, int maxLitros, int diferencia){
        int litros_acuario = maxLitros;
        for (int i = 0; i < compartimentos - 1; i++){
            maxLitros = maxLitros - diferencia;
            litros_acuario = litros_acuario + maxLitros;
        }
        return litros_acuario;
    }
}
