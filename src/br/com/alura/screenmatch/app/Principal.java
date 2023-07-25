package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		filme.setNome("O poderoso chefão");
		filme.setAnoDeLancamento(1970);
		filme.setDuracaoEmMinutos(180);
		filme.setIncluidoNoPlano(true);
		filme.exibeFichaTecnica();

		Serie serie = new Serie();
		serie.setNome("La Casa de Papel");
		serie.setAnoDeLancamento(2017);
		serie.setIncluidoNoPlano(true);
		serie.setAtiva(true);
		serie.setTemporadas(5);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(45);
		serie.exibeFichaTecnica();

	}
}
