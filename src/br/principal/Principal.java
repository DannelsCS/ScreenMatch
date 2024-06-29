package br.principal;

import br.co.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.co.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodeos;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("Rei leão",1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("lost",2000);
        lost.setTemporadas(10);
        lost.setEpisodeosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Movie outroFilme = new Movie("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodeos episodeos = new Episodeos();
        episodeos.setNumero(1);
        episodeos.setSerie(lost);
        episodeos.setTotalVisualisacoes(300);
        filtro.filtra(episodeos);

        var filmePaulo = new Movie("Dogville",2003);
        filmePaulo.setDuracaoEmMinutos(200);
        filmePaulo.avalia(10);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmePaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());





    }
}
