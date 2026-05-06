package computador;

public class Main {

    public static void main(String[] args) {

        Computador pcGamer = new ComputadorBuilder()
                .setCpu("Ryzen 7 5800X")
                .setGpu("RTX 4070")
                .setRam(32)
                .setArmazenamento(1000)
                .setFonte("750W")
                .setWifi(true)
                .build();

        Computador pcBasico = new ComputadorBuilder()
                .setCpu("Intel i3")
                .setRam(8)
                .setArmazenamento(256)
                .setFonte("400W")
                .build();

        System.out.println("=== PC Gamer ===");
        System.out.println(pcGamer);

        System.out.println("\n=== PC Básico ===");
        System.out.println(pcBasico);
    }
}