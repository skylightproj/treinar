package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	public static Float taxaRendimento;
	public Integer diaBaseDeposito;

	static {
		taxaRendimento = Float.valueOf(19);
	}

	public static Float getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public ContaPoupanca(Integer numeroConta) {
		super(numeroConta);
	}
	
	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void captalizar() {
		depositar(saldo * (taxaRendimento / 100));
	}

}
