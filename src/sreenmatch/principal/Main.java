import sreenmatch.calculos.CalculadoraDeTempo;
import sreenmatch.calculos.FiltroRecomendacao;
import sreenmatch.modelos.Episodio;
import sreenmatch.modelos.Filme;
import sreenmatch.modelos.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do filme em minutos é: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie breakingBad = new Serie("Breaking Bad", 2008);
        breakingBad.setTemporadas(5);
        breakingBad.setEpsodios(13);
        breakingBad.setMinutosPorEpisodios(45);
        System.out.println("Tempo para maratonar por completo: " + breakingBad.getDuracaoEmMinutos() + " min");

        Filme outroFilme = new Filme("Interestellar", 2014);
        meuFilme.setDuracaoEmMinutos(210);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(breakingBad);
        episodio.setTotalVisualizacoes(1);
        filtro.filtra(episodio);

        Filme bomFilme = new Filme("Inception", 2011);
        bomFilme.setDuracaoEmMinutos(200);
        bomFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(bomFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size() + " filmes");
        System.out.println(listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);


    }
}