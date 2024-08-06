package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme armageddon = new Filme("Armageddon", 1998);
        armageddon.avalia(8);

        Filme batman = new Filme("Batman", 1998);
        armageddon.avalia(7);

        Serie greysAnatomy = new Serie("Grey's Anatomy", 2000);
        armageddon.avalia(6);

        Filme aOrigem = new Filme("A Origem", 2010);
        armageddon.avalia(9);

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(armageddon);
        lista.add(batman);
        lista.add(aOrigem);
        lista.add(greysAnatomy);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
}
