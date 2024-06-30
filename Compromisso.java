public class Compromisso {
    private String titulo;
    private String data;

    public Compromisso(String titulo, String data) {
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Data: " + data);
    }
}
