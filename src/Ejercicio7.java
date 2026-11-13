import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desde que canal te encuentras ahora: ");
        int desde = sc.nextInt();
        System.out.println("Hasta que canal quieres llegar: ");
        int hasta = sc.nextInt();
        int veces = canales(desde, hasta);
        System.out.println(veces + " veces.");


    }
    public static int canales(int desde, int hasta){
        int distancia = Math.abs(hasta - desde);
        return Math.min(distancia, 99 - distancia);
    }
}
