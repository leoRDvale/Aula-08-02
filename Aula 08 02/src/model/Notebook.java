package model;

public class Notebook {

    private final String processador;
    private final String memoriaRAM;
    private final String armazenamento;
    private final String placaVideo;
    private final String sistemaOperacional;

    private Notebook(Builder builder) {
        this.processador = builder.processador;
        this.memoriaRAM = builder.memoriaRAM;
        this.armazenamento = builder.armazenamento;
        this.placaVideo = builder.placaVideo;
        this.sistemaOperacional = builder.sistemaOperacional;
    }

    public String getProcessador() { return processador; }
    public String getMemoriaRAM() { return memoriaRAM; }
    public String getArmazenamento() { return armazenamento; }
    public String getPlacaVideo() { return placaVideo; }
    public String getSistemaOperacional() { return sistemaOperacional; }

    @Override
    public String toString() {
        return "Notebook: " +
                "\n Processador='" + processador + '\'' +
                ",\n Memória RAM='" + memoriaRAM + '\'' +
                ",\n Armazenamento='" + armazenamento + '\'' +
                ",\n Placa de Vídeo='" + placaVideo + '\'' +
                ",\n Sistema Operacional='" + sistemaOperacional + '\'' +
                "\n------------";
    }

    public static class Builder {

        private String processador;
        private String memoriaRAM;
        private String armazenamento;
        private String placaVideo;
        private String sistemaOperacional;


        public Builder comProcessador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder comMemoriaRAM(String memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
            return this;
        }

        public Builder comArmazenamento(String armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }

        public Builder comPlacaVideo(String placaVideo) {
            this.placaVideo = placaVideo;
            return this;
        }

        public Builder comSistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
            return this;
        }

        public Notebook build() {
            return new Notebook(this);
        }
    }
}