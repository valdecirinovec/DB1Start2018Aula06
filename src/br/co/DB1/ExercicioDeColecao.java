package br.co.DB1;

import java.util.ArrayList;

public class ExercicioDeColecao {
	static ArrayList<String> Cor = new ArrayList<String>();
	public static void main(String[] args) {
		exercicio1();
	}
	public static ArrayList<String> exercicio1() {
		ArrayList<String> Cor = new ArrayList<>();
		Cor.add("vermelho");
		Cor.add("verde");
		Cor.add("Preto");
		Cor.add("Azul");
		System.out.println(Cor);
		return Cor;
	}
}