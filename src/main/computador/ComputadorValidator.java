package computador;

public class ComputadorValidator {

    public static void validar(String cpu, String fonte) {

        if (cpu == null || cpu.isEmpty()) {
            throw new IllegalArgumentException("CPU é obrigatória!");
        }

        if (fonte == null || fonte.isEmpty()) {
            throw new IllegalArgumentException("Fonte é obrigatória!");
        }
    }
}