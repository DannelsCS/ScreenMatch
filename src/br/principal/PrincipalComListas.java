package br.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("Rei leão",1970);
        meuFilme.avalia(9);
        Movie outroFilme = new Movie("Avatar",2023);
        outroFilme.avalia(6);
        var filmePaulo = new Movie("Dogville",2003);
        filmePaulo.avalia(10);
        Serie lost = new Serie("lost",2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(filmePaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Title item: lista){
            System.out.println(item.getNome());
            if (item instanceof Movie filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        List<String> buscaPorArtista =new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Adam Driver");
        buscaPorArtista.add("Adam Levine");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: \n" + buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados:\n" + lista);

        lista.sort(Comparator.comparing(Title::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);

    }
}
