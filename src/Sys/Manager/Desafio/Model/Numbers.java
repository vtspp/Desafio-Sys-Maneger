package Sys.Manager.Desafio.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
	
	private int[] array;
	private int lessThan;
	
	public Numbers() {}
	
	public Numbers(int[] array, int lessThan) {
		this.array = array;
		this.lessThan = lessThan;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getLessThan() {
		return lessThan;
	}

	public void setLessThan(int lessThan) {
		this.lessThan = lessThan;
	}
	
	public int countNumbers(int[] array, int lessThan) {
		int count = 0;
		List<Integer> vet = new ArrayList<>();
		
		// Array Ordenado
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			// Elementos foram adicionados j� organizados
			vet.add(array[i]);
		}
		
		// Verificando e contando quantos elementos s�o menores que a vari�vel lessThan
		for (Integer integer : vet) {
			if (integer < lessThan) {
				count ++;
			}
		}
		
		return count;

	}

}
