import java.util.ArrayList;
import java.util.List;

class Evento {
    private String nome;
    private String data;
    private String hora;

    public Evento(String nome, String data, String hora) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Evento: " + nome + "\nData: " + data + "\nHora: " + hora;
    }
}

class Agenda {
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(String nome, String data, String hora) {
        Evento evento = new Evento(nome, data, hora);
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }
}

public class AplicativoAgenda1 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarEvento("Reunião de trabalho", "2023-10-15", "14:00");
        agenda.adicionarEvento("Aniversário", "2023-11-20", "18:30");

        List<Evento> eventos = agenda.listarEventos();

        for (Evento evento : eventos) {
            System.out.println(evento);
            System.out.println("---------------------------");
        }
    }
}
