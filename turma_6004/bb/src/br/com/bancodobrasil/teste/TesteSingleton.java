package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.util.BBUtil;

public class TesteSingleton {

	public static void main(String[] args) {
		//n�o � possivel pois o construtor � privado
		//BBUtil b = new BBUtil();
		BBUtil util = BBUtil.getInstance();
		System.out.println(util.nomeBanco);;
		
	}
	
}
