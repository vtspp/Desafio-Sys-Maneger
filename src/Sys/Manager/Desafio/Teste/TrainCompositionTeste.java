package Sys.Manager.Desafio.Teste;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

import Sys.Manager.Desafio.Model.TrainComposition;

/* 
   Teste Unit�rio com Junity
   
   @autor Victor Pinho
   Resolvi fazer uso da classe "Scanner" e com isso poupar a necessidade
   de escrever o m�todo "add" repetitivas vezes. Com isso, h� possibilidade
   de inserir mais elementos, ao inv�s de apenas 2 como no enunciado.
   
   */

public class TrainCompositionTeste {

	private Stack<Integer> wagon = new Stack<Integer>();
	private Stack<Integer> orderedWagon = new Stack<Integer>();
	private Integer quantity;
	private TrainComposition tc;
	private Scanner sc = new Scanner(System.in);

	@Test
	public void testOrganizesWagon() {

		/* MONTAGEM DO CEN�RIO */
		tc = new TrainComposition();

		System.out.print("Infome a quantidade de vag�es: ");
		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			System.out.print("N�mero do vag�o " + (i + 1) + ": ");
			wagon.add(sc.nextInt());
		}

		/* EXECUS�O E INVERS�O */
		for (int i = quantity - 1; i >= 0; i--) {
			orderedWagon.add(wagon.get(i));
		}

		/* VERIFICA��O */
		assertEquals(orderedWagon, tc.organizesWagon(wagon, quantity));
	}


}
