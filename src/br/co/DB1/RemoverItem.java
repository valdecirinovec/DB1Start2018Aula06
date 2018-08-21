package br.co.DB1;

import java.util.ArrayList;
import java.util.Collections;

public class RemoverItem {
	static ArrayList<String> Nome = new ArrayList<String>();
	public static void main(String[] agrs) {
	exercicio5();
	}
	public static ArrayList<String> exercicio5(){
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
		Nome.remove("José");
		Nome.remove("Bruno");
		System.out.println(Nome);
		System.out.printf("Quantidade de Item:",Nome);
		System.out.println(Nome.size());
		return Nome;
	}
}

