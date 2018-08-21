package br.co.DB1;

import java.util.ArrayList;
import java.util.Collections;

public class Cidade {
	static ArrayList<String> Nome = new ArrayList<String>();
	public static void main(String[] agrs) {
	exercicio6();
	}
	public static ArrayList<String> exercicio6(){
		ArrayList<String> Nome = new ArrayList<String>();
		Nome.add("Londrina");
		Nome.add("Cambé");
		Nome.add("Sertanopolis");
		System.out.println(Nome);
		Collections.sort(Nome);
		System.out.printf("Quantidade de Item:",Nome);
		System.out.println(Nome.size());
		Nome.remove("Cambé");
		System.out.println(Nome);
		System.out.printf("Quantidade de Item:",Nome);
		System.out.println(Nome.size());
		return Nome;
	}
}

