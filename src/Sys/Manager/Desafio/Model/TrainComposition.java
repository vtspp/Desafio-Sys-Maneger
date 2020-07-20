package Sys.Manager.Desafio.Model;

import java.util.Stack;

import Sys.Manager.Desafio.Exception.CustonException;

public class TrainComposition {

	private Integer quantity;
	private Stack<Integer> wagon = new Stack<Integer>();
	private Stack<Integer> orderedWagon = new Stack<Integer>();

	public TrainComposition() {
	}

	public TrainComposition(Integer quantity, Stack<Integer> wagon) {
		this.quantity = quantity;
		this.wagon = wagon;
	}
	
	// Retirado o método "set, pois para este exercício, não teria necessidade.
	public Integer getQuantity() {
		return quantity;
	}

	public Stack<Integer> getWagon() {
		return wagon;
	}

	public Stack<Integer> getOrderedWagon() {
		return orderedWagon;
	}

	// Verifica se existe algum vagão e organiza de acordo com o enunciado em orderedWagon
	public Stack<Integer> organizesWagon(Stack<Integer> wagon, Integer quantity) {

		if (!wagon.empty()) {
			for (int i = 0; i < quantity; i++) {

				orderedWagon.add(wagon.lastElement());
				wagon.remove(wagon.lastElement());
			}
		}
		return orderedWagon;
	}

	// Retira o primeiro vagão pelo lado direito
	public void untiedRightSide(Stack<Integer> wagon, Integer quantity) {
		organizesWagon(wagon, quantity).remove(organizesWagon(wagon, quantity).lastElement());
	}

	// Retira o primeiro vagão pelo lado esquerdo
	public void untiedLeftSide(Stack<Integer> wagon, Integer quantity) {
		organizesWagon(wagon, quantity).remove(organizesWagon(wagon, quantity).firstElement());
	}
	
	public static Boolean wordOrNumber (String word) {
		try {
			Integer.parseInt(word);
			return true;
		}
		catch (CustonException e) {
			return false;
			
		}
	}

}
