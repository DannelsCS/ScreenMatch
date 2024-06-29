package br.com.alura.screenmatch.modelos;

import br.co.alura.screenmatch.calculo.Classificavel;

public class Episodeos implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualisacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualisacoes() {
        return totalVisualisacoes;
    }

    public void setTotalVisualisacoes(int totalVisualisacoes) {
        this.totalVisualisacoes = totalVisualisacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualisacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
