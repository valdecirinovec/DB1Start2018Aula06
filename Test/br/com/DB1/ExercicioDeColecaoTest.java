package br.com.DB1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.co.DB1.Cidade;
import br.co.DB1.Cor;
import br.co.DB1.ExercicioDeColecao;
import br.co.DB1.Ordem;
import br.co.DB1.QuantidadeLista;
import br.co.DB1.RemoverItem;

public class ExercicioDeColecaoTest {
	
	@Test 
	public void corTest() { 
		assertTrue(ExercicioDeColecao.exercicio1().get(0).equals("vermelho"));
	}
	@Test
	public void NomeTest() {
		assertTrue(QuantidadeLista.exercicio2().get(0).equals("Pai"));
	}
	@Test
	public void OrdemTest() {
		assertTrue(Ordem.exercicio3().get(0).equals("Amanda"));
	}
	@Test
	public void RemoverTest() {
		assertTrue(RemoverItem.exercicio5().get(0).equals("Amanda"));
	}
	@Test
	public void CidadeTest() {
		assertTrue(Cidade.exercicio6().get(0).equals("Londrina"));
	}
	@Test
	public void CorTest() {
		assertTrue(Cor.exercicio7().get(0).equals("Preto"));
	}
}
