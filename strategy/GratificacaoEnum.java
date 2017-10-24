package br.padrao.strategy;

public enum GratificacaoEnum implements GratificacaoStrategy{

	DBA{
		public double calcularGratificacao(Funcionario funcionario) {
	        if (funcionario.getNivel() >= 2) {
	            return funcionario.getSalarioBase() * 1.30;
	        }
	        return funcionario.getSalarioBase() * 1.20;
	  }
	},
	DESENVOLVEDOR{
		public double calcularGratificacao(Funcionario funcionario) {
	        if (funcionario.getNivel() >= 2) {
	            return funcionario.getSalarioBase() * 1.25;
	        }
	        return funcionario.getSalarioBase() * 1.15;
	  }
	},
	GERENTE{
		public double calcularGratificacao(Funcionario funcionario) {
	          if (funcionario.getNivel() >= 2) {
	              return funcionario.getSalarioBase() * 1.45;
	          }
	          return funcionario.getSalarioBase() * 1.30;
	    }
	},
	LIDER{
		public double calcularGratificacao(Funcionario funcionario) {
	          if (funcionario.getNivel() >= 2) {
	              return funcionario.getSalarioBase() * 1.35;
	          }
	          return funcionario.getSalarioBase() * 1.25;
	    }
	}
}
