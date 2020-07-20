import java.util.Scanner;
import java.util.Stack;

import Sys.Manager.Desafio.Exception.CustonException;
import Sys.Manager.Desafio.Model.TrainComposition;

public class ProgramTrainComposition {

	public static void main(String[] args) {

		Integer quantity = null;
		Stack<Integer> wagon = new Stack<Integer>();

		TrainComposition trainComposition = new TrainComposition(quantity, wagon);

		Scanner sc = new Scanner(System.in);

		System.out.print("Infome a quantidade de vag�es: ");
		String teste = sc.next();

		if (TrainComposition.wordOrNumber(teste) == true) {
			quantity = Integer.parseInt(teste);

		}
		if (quantity >= 2) {
			for (int i = 0; i < quantity; i++) {
				System.out.print("N�mero do vag�o " + (i + 1) + ": ");
				wagon.add(sc.nextInt());
			}
		}

		else {
			sc.close();
			throw new CustonException("N�mero inv�lido ou menor que 2 !!!");
		}

		trainComposition.organizesWagon(wagon, quantity);

		System.out.println("Primeiro vag�o removido pelo lado direito: "
				+ trainComposition.organizesWagon(wagon, quantity).lastElement());
		trainComposition.untiedRightSide(wagon, quantity);
		System.out.println("Primeiro vag�o removido pelo lado esquerdo: "
				+ trainComposition.organizesWagon(wagon, quantity).firstElement());
		trainComposition.untiedLeftSide(wagon, quantity);
		sc.close();
	}

}
