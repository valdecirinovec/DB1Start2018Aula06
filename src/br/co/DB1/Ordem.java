package br.co.DB1;

import java.util.ArrayList;
import java.util.Collections;


public class Ordem {
	static ArrayList<String> Nome = new ArrayList<String>();
	public static void main(String[] agrs) {
	exercicio3();
	}
	public static ArrayList<String> exercicio3(){
		ArrayList<String> Nome = new ArrayList<String>();
		Nome.add("José");
		Nome.add("Ricardo");
		Nome.add("Rafael");
		Nome.add("Amanda");
		Nome.add("Andre");
		Nome.add("Bruno");
		Nome.add("Claudio");
		System.out.println(Nome);
		Collections.sort(Nome);
		System.out.printf("Quantidade de Item:",Nome);
		System.out.println(Nome.size());
		System.out.println(Nome);
		return Nome;
	}
}


