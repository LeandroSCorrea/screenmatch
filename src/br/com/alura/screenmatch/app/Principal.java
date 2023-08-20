package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		
		Filme filme = new Filme();
		filme.setNome("O poderoso chefão");
		filme.setAnoDeLancamento(1970);
		filme.setDuracaoEmMinutos(180);
		filme.setIncluidoNoPlano(true);
		filme.exibeFichaTecnica();
		filme.setTotalDeAvaliacoes(80);
		filme.pegaMedia();
		filtro.filtra(filme);
		

		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2017);
		lost.setIncluidoNoPlano(true);
		lost.setAtiva(true);
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		lost.exibeFichaTecnica();
		//filtro.filtra(lost);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(100);
		filtro.filtra(episodio);
	}
}
