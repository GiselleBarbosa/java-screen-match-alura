import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

public class Principal {

    public static void main(String[] args) {
        Filme armageddon1 = new Filme();

        armageddon1.setNome("Armageddon");
        armageddon1.setAnoDeLancamento(1998);
        armageddon1.setDuracaoEmMinutos(180);
        armageddon1.setIncluidoNoPlano(true);

        armageddon1.exibeFichaTecnica();
        armageddon1.avalia(9);
        armageddon1.avalia(8);
        armageddon1.avalia(9);

        System.out.println("Média de avaliações do armageddon1: " + armageddon1.pegaMedia());

        Serie greysAnatomy = new Serie();
        greysAnatomy.setNome("Grey's Anatomy");
        greysAnatomy.setAnoDeLancamento(2000);
        greysAnatomy.exibeFichaTecnica();
        greysAnatomy.setTemporadas(19);
        greysAnatomy.setEpisodiosPorTemporada(22);
        greysAnatomy.setMinutosPorEpisodio(25);

        System.out.println("Duração total em minutos da série: " + greysAnatomy.getDuracaoEmMinutos());

        // adicionando novo filme para validacao da calculadora:
        Filme armageddon2 = new Filme();

        armageddon2.setNome("Armageddon 2");
        armageddon2.setAnoDeLancamento(1998);
        armageddon2.setDuracaoEmMinutos(120);
        armageddon2.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(armageddon1);
        calculadora.incluir(armageddon2);
        calculadora.incluir(greysAnatomy);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(armageddon2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(greysAnatomy);
        episodio.setTotalVisualizacoes(300);
        filtro.filtrar(episodio);
    }

}