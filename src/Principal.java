import br.com.alura.screenmatch.models.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("Armageddon");
        favorito.setAnoDeLancamento(1998);
        favorito.setDuracaoEmMinutos(151);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
    }

}