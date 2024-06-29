package br.co.alura.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        }else if( classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momeno!");
        }else {
            System.out.println("coloque na sua lisa para assitir depois!");
        }
    }
}
