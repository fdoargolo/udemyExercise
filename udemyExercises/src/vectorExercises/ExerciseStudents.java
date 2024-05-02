package vectorExercises;

import java.util.Scanner;

public class ExerciseStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão registrados?");
		int quantidade = scanner.nextInt();
		
		Students[] alunos = new Students[quantidade];
		
		for(int i = 0; i<alunos.length; i++) {
			scanner.nextLine();
			System.out.println("Digite o nome, primeira e segunda nota do "+ (i + 1) + "o aluno:");
			String nome = scanner.nextLine();
			double nota1 = scanner.nextDouble();
			double nota2 = scanner.nextDouble();
			alunos[i] = new Students(nome,nota1,nota2);
		}
		
		System.out.println("Alunos aprovados:");
		
		for(int i = 0; i<alunos.length; i++) {	
			if(Students.media(alunos[i].nota1, alunos[i].nota2)>= 6 ) {
				System.out.println(alunos[i].name);
			}
		}
		
		
		scanner.close();
	}

}
