import java.util.Scanner;

import Sys.Manager.Desafio.Exception.CustonException;
import Sys.Manager.Desafio.Model.Numbers;
import Sys.Manager.Desafio.Model.TrainComposition;

public class ProgramArrayNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do Array: ");
		String tamanho = sc.next();
		
		if (TrainComposition.wordOrNumber(tamanho) == true) {
			int tam = Integer.parseInt(tamanho);
			int[] array = new int[tam];
			
			for (int i = 0; i < tam; i++ ) {
				System.out.print("Elemento " + (i+1) + " : ");
				array[i] = sc.nextInt();
			}
			
		System.out.print("Informe o valor para verificar: ");
		int lessThan = sc.nextInt();
		
		Numbers numbers = new Numbers(array, lessThan);

		System.out.print("Quantidade de elementos menores: " + numbers.countNumbers(array, lessThan));
		
		}
		else {
			sc.close();
			throw new CustonException("Valor informado é inválido.");
		}
		sc.close();

	}

}
