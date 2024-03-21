import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Armageddon");
        filme.setAnoDeLancamento(1998);
        filme.setDuracaoEmMinutos(151);
        filme.setIncluidoNoPlano(true);

        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(9);

        System.out.println("Média de avaliações do filme: " + filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Grey's Anatomy");
        System.out.println(serie.getNome());
        serie.setTemporadas(19);
        serie.setEpisodiosPorTemporada(24);
        serie.setMinutosPorEpisodio(25);
        serie.setAtiva(true);


        System.out.println("Duração total em minutos da série: " + serie.getDuracaoEmMinutos());
    }

}