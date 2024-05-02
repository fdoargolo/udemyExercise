package vectorExercises;

import java.util.Scanner;

public class ExerciseEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = scanner.nextInt();
		
		int[] numeros = new int[n];
		int pares = 0, count = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			
			System.out.print("Digite um numero:");
			numeros[i] = scanner.nextInt();
			
			if(numeros[i]%2 == 0) {
				pares += numeros[i];
				count++;
			}
		}
		
		System.out.println("MEDIA DOS PARES: " + pares/count);
		
		scanner.close();

	}

}
