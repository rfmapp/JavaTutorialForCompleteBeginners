package coreJava;

/**
 * Arrays Multi-Dimensionais.
 * @author rafael
 *
 */

public class App12MultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		// Um array multidimensional é basicamente um array de arrays.
		// Declaramos assim.
		int[][] grid = {
				{10, 20}, 
				{2, 4, 6}, 
				{1, 3, 5}
		};
		
		// Buscando o valor de um elemento. Primeiro indicamos o índice do array 
		// interno e depois o índice do elemento.
		// Para obter o valor 20, por exemplo.
		System.out.println(grid[0][1]);
		
		// Para saber o tamanho do array multi-dimensional.
		System.out.println(grid.length);
		
		// Para saber o tamanho de determinado array interno.
		System.out.println(grid[0].length);
		
		// Linha em branco.
		System.out.println();
		
		//Para um loop que mostre os valores de cada elemento de cada array interno.
		// Usamos dois "for". O primeiro corre pelos arrays externos.
		for (int externo = 0; externo < grid.length; externo++){
			// O segundo corre pelos arrays internos.
			for (int interno = 0; interno < grid[externo].length; interno++){
				// Exibe os elementos de cada array interno em linha.
				// O "\t" é como se fosse um "tab" entre cada elemento.
				System.out.print(grid[externo][interno] + "\t");
			}
			// Exibimos uma linha em branco entre cada array interno.
			System.out.println();
		}
	}

}
