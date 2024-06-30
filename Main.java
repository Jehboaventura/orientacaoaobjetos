public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Compromisso compromisso1 = new Compromisso("Reunião de Projeto", "2024-06-30");
        Compromisso compromisso2 = new Compromisso("Enviar relatório", "2024-06-25");
        Compromisso compromisso3 = new Compromisso("Aniversário", "2024-07-01");

        agenda.adicionarCompromisso(compromisso1);
        agenda.adicionarCompromisso(compromisso2);
        agenda.adicionarCompromisso(compromisso3);

        System.out.println("Compromissos na Agenda:");
        agenda.exibirCompromissos();
    }
}
