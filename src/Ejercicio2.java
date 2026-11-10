import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        long dias = diasHastaNochevieja(dia, mes);

        System.out.println("Quedan " + dias + " dias para noche vieja.");
    }

    public static long diasHastaNochevieja(int dia, int mes) {
        LocalDate fecha = LocalDate.of(2026, mes, dia);
        LocalDate nochevieja = LocalDate.of(2026, 12, 31);

        long dias_restantes = ChronoUnit.DAYS.between(fecha, nochevieja);

        return dias_restantes;
    }
}