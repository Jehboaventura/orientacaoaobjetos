// Classe base Evento
public class Evento {
    protected String titulo;
    protected String data;
    protected String hora;

    public Evento(String titulo, String data, String hora) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Evento: " + titulo + " em " + data + " às " + hora;
    }
}

// Subclasse EventoRecorrente
public class EventoRecorrente extends Evento {
    private String frequencia;

    public EventoRecorrente(String titulo, String data, String hora, String frequencia) {
        super(titulo, data, hora);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return super.toString() + " (Recorrente: " + frequencia + ")";
    }
}

// Interface Notificavel
public interface Notificavel {
    void enviarNotificacao();
}


//Definição das Classes e Herança