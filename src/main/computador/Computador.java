package computador;

public class Computador {

    private String cpu;
    private String gpu;
    private int ram;
    private int armazenamento;
    private String fonte;
    private boolean temWifi;

    public Computador(String cpu, String gpu, int ram, int armazenamento, String fonte, boolean temWifi) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
        this.temWifi = temWifi;
    }

    public String getCpu() { return cpu; }
    public String getGpu() { return gpu; }
    public int getRam() { return ram; }
    public int getArmazenamento() { return armazenamento; }
    public String getFonte() { return fonte; }
    public boolean isTemWifi() { return temWifi; }

    @Override
    public String toString() {
        return "Computador {" +
                "\n CPU: " + cpu +
                "\n GPU: " + gpu +
                "\n RAM: " + ram + "GB" +
                "\n Armazenamento: " + armazenamento + "GB" +
                "\n Fonte: " + fonte +
                "\n Wi-Fi: " + (temWifi ? "Sim" : "Não") +
                "\n}";
    }
}