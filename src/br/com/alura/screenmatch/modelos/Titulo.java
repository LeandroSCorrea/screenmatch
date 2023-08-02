package br.com.alura.screenmatch.modelos;

public class Titulo {
	private String nome;
	private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	
	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	
	public boolean isInluidoNoPlano() {
		return incluidoNoPlano;
	}
	
	public int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
	
    public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    
    public void exibeFichaTecnica() {
    	System.out.println("------------- Dados de saída ---------------");
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("------------------*--------------------------");
    }
}