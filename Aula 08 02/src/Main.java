import model.Notebook;

public class Main {
    public static void main(String[] args) {

        Notebook notebook = new Notebook.Builder()
                .comProcessador("Intel Core i9")
                .comMemoriaRAM("16GB")
                .comArmazenamento("512 SSD")
                .comPlacaVideo("NVIDIA RTX 5090")
                .comSistemaOperacional("Windows 11")
                .build();

        System.out.println(notebook);
    }
}