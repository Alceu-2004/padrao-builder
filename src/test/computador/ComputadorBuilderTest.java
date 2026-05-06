package computador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputadorBuilderTest {

    @Test
    void deveCriarComputadorCompleto() {
        Computador pc = new ComputadorBuilder()
                .setCpu("Ryzen 5")
                .setGpu("RTX 3060")
                .setRam(16)
                .setArmazenamento(512)
                .setFonte("600W")
                .setWifi(true)
                .build();

        assertEquals("Ryzen 5", pc.getCpu());
        assertEquals("RTX 3060", pc.getGpu());
        assertEquals(16, pc.getRam());
        assertEquals(512, pc.getArmazenamento());
        assertEquals("600W", pc.getFonte());
        assertTrue(pc.isTemWifi());
    }

    @Test
    void deveCriarComputadorSemGpu() {
        Computador pc = new ComputadorBuilder()
                .setCpu("Intel i5")
                .setRam(8)
                .setArmazenamento(256)
                .setFonte("500W")
                .build();

        assertNull(pc.getGpu());
    }

    @Test
    void deveFalharSemCpu() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new ComputadorBuilder()
                    .setFonte("500W")
                    .build();
        });

        assertEquals("CPU é obrigatória!", exception.getMessage());
    }

    @Test
    void deveFalharSemFonte() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new ComputadorBuilder()
                    .setCpu("Ryzen 5")
                    .build();
        });

        assertEquals("Fonte é obrigatória!", exception.getMessage());
    }

    @Test
    void devePermitirValoresPadrao() {
        Computador pc = new ComputadorBuilder()
                .setCpu("Ryzen 3")
                .setFonte("400W")
                .build();

        assertEquals(0, pc.getRam());
        assertEquals(0, pc.getArmazenamento());
        assertFalse(pc.isTemWifi());
    }

    @Test
    void deveGerarToStringCorretamente() {
        Computador pc = new ComputadorBuilder()
                .setCpu("Ryzen 7")
                .setGpu("RTX 4080")
                .setRam(32)
                .setArmazenamento(2000)
                .setFonte("850W")
                .setWifi(true)
                .build();

        String texto = pc.toString();

        assertTrue(texto.contains("Ryzen 7"));
        assertTrue(texto.contains("RTX 4080"));
        assertTrue(texto.contains("32GB"));
        assertTrue(texto.contains("2000GB"));
        assertTrue(texto.contains("Sim"));
    }

    @Test
    void deveValidarCamposVazios() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new ComputadorBuilder()
                    .setCpu("")
                    .setFonte("")
                    .build();
        });

        assertEquals("CPU é obrigatória!", exception.getMessage());
    }
}