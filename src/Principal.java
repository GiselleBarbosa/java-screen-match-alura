import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import calculations.CalculadoraDeTempo;

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

        Serie greyAnatomy = new Serie();
        greyAnatomy.setNome("Grey's Anatomy");
        greyAnatomy.setAnoDeLancamento(2000);
        greyAnatomy.exibeFichaTecnica();
        greyAnatomy.setTemporadas(19);
        greyAnatomy.setEpisodiosPorTemporada(22);
        greyAnatomy.setMinutosPorEpisodio(25);

        System.out.println("Duração total em minutos da série: " + greyAnatomy.getDuracaoEmMinutos());

        // adicionando novo filme para validacao da calculadora:
        Filme armageddon2 = new Filme();

        armageddon2.setNome("Armageddon 2");
        armageddon2.setAnoDeLancamento(1998);
        armageddon2.setDuracaoEmMinutos(120);
        armageddon2.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(armageddon1);
        calculadora.incluir(armageddon2);
        calculadora.incluir(greyAnatomy);

        System.out.println(calculadora.getTempoTotal());
    }

}