
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {

    @Test
    void ascendente() {
        assertEquals("Ascendente", Ejercicio1.orden(new int[]{5, 6, 7, 7, 8}));
    }

    @Test
    void descendente() {
        assertEquals("Descendente", Ejercicio1.orden(new int[]{9, 7, 5, 4, 3}));
    }

    @Test
    void iguales() {
        assertEquals("Iguales", Ejercicio1.orden(new int[]{4, 4, 4, 4}));
    }

    @Test
    void desordenado() {
        assertEquals("Desordenado", Ejercicio1.orden(new int[]{2, 5, 3, 8}));
    }
}
