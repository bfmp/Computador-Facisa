package br.padrao.strategy;

public class Funcionario {

	private double salarioBase;
	private GratificacaoEnum cargo;
	protected int nivel;
	

	public Funcionario(GratificacaoEnum cargo, double salarioBase, int nivel) {
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.nivel = nivel;
	}

	public double calcularGratificacao() {
		return cargo.calcularGratificacao(this);
		}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getNivel() {
		return nivel;
	}

	public GratificacaoEnum getCargo() {
		return cargo;
	}
}
