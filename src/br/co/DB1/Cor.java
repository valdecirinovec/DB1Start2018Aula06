package br.co.DB1;

import java.util.ArrayList;
import java.util.Collections;

public class Cor {
		static ArrayList<String> Nome = new ArrayList<String>();
		public static void main(String[] agrs) {
			exercicio7();
		}
		public static ArrayList<String> exercicio7() {
			ArrayList<String> Nome = new ArrayList<>();
			Nome.add("Preto");
			Nome.add("Vermelho");
			Nome.add("Azul");
			Nome.add("Verde");
			Collections.sort(Nome);
			System.out.printf("Quantidade de Item:",Nome);
			System.out.println(Nome.size());
			Nome.remove("Azul");
			System.out.println(Nome);
			System.out.printf("Quantidade de Item:",Nome);
			System.out.println(Nome.size());
			return Nome;
		}
	}
