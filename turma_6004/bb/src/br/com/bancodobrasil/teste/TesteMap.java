package br.com.bancodobrasil.teste;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>(); 
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
	}
}
