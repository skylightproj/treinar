package br.com.charles.modelo;

import java.sql.Date;

public class TestaClasses {

	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		agencia.numero = 1;
		
		CartaoDeCredito cdc = new CartaoNacional();
		cdc.numero = 123654;
		cdc.dataDeValidade = new Date(0);
		
		Cliente cl = new Cliente();
		cl.codigoCliente = 1;
		cl.nome = "Charles Hector";
		
		Conta co = new Conta();
		co.numero = 1;
		co.limite = 1000.;
		co.saldo = 2.500;
		
		co.agencia = new Agencia();
		co.agencia.numero = 353535;
		co.numero = 161512;

		cdc.cliente = new Cliente();
		cdc.cliente.nome = "Charles Hector";
						
		cdc.numero = 123654;
		cdc.dataDeValidade = new Date(1);
		
		System.out.println("Nome do cliente: " + cdc.cliente.nome);		
		System.out.println("N�mero do cart�o: " + cdc.numero);
		System.out.println("Data de vencimento do cart�o: " + cdc.dataDeValidade);
		System.out.println("N�mero da Agencia: " + co.agencia.numero);
		System.out.println("N�mero da Conta: " + co.numero);
		
		

	}

}
