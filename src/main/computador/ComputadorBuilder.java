package computador;

public class ComputadorBuilder {

    private String cpu;
    private String gpu;
    private int ram;
    private int armazenamento;
    private String fonte;
    private boolean temWifi;

    public ComputadorBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputadorBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputadorBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputadorBuilder setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder setFonte(String fonte) {
        this.fonte = fonte;
        return this;
    }

    public ComputadorBuilder setWifi(boolean temWifi) {
        this.temWifi = temWifi;
        return this;
    }

    public Computador build() {
        ComputadorValidator.validar(cpu, fonte);
        return new Computador(cpu, gpu, ram, armazenamento, fonte, temWifi);
    }
}