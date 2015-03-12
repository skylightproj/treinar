package br.com.treinar.estudo.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String s = br.readLine(); // primeira linha

			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");;
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
