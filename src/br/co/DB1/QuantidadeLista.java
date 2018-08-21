package br.co.DB1;

import java.util.ArrayList;

public class QuantidadeLista {
	static ArrayList<String> Nome = new ArrayList<String>();
	public static void main(String[] agrs) {
		exercicio2();
	}
	public static ArrayList<String> exercicio2(){
		ArrayList<String> Nome = new ArrayList<>();
		Nome.add("Pai");
		Nome.add("Mae");
		Nome.add("Add");
		Nome.add("Irmao");
		Nome.add("Irma");
		Nome.add("Tio");
		Nome.add("Tia");
		System.out.println(Nome);
		System.out.printf("Quantidade de Item:",Nome);
		System.out.println(Nome.size());
		return Nome;
	}
}
