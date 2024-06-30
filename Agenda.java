import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    public void exibirCompromissos() {
        for (Compromisso compromisso : compromissos) {
            compromisso.exibirDetalhes();
            System.out.println("--------------------");
        }
    }
}

//xx
