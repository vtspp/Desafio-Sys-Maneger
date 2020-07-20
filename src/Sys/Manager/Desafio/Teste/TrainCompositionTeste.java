package Sys.Manager.Desafio.Teste;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

import Sys.Manager.Desafio.Model.TrainComposition;

/* 
   Teste Unitário com Junity
   
   @autor Victor Pinho
   Resolvi fazer uso da classe "Scanner" e com isso poupar a necessidade
   de escrever o método "add" repetitivas vezes. Com isso, há possibilidade
   de inserir mais elementos, ao invés de apenas 2 como no enunciado.
   
   */

public class TrainCompositionTeste {

	private Stack<Integer> wagon = new Stack<Integer>();
	private Stack<Integer> orderedWagon = new Stack<Integer>();
	private Integer quantity;
	private TrainComposition tc;
	private Scanner sc = new Scanner(System.in);

	@Test
	public void testOrganizesWagon() {

		/* MONTAGEM DO CENÁRIO */
		tc = new TrainComposition();

		System.out.print("Infome a quantidade de vagões: ");
		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			System.out.print("Número do vagão " + (i + 1) + ": ");
			wagon.add(sc.nextInt());
		}

		/* EXECUSÃO E INVERSÃO */
		for (int i = quantity - 1; i >= 0; i--) {
			orderedWagon.add(wagon.get(i));
		}

		/* VERIFICAÇÃO */
		assertEquals(orderedWagon, tc.organizesWagon(wagon, quantity));
	}


}
