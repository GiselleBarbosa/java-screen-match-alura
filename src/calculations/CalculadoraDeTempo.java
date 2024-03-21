package calculations;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Filme filme) {
        tempoTotal += filme.getDuracaoEmMinutos();
    }
    public void incluir(Serie serie) {
        tempoTotal += serie.getDuracaoEmMinutos();
    }
}
