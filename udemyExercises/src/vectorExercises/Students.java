package vectorExercises;

public class Students {
	public String name;
	public double nota1;
	public double nota2;
	
	public Students(String name, double nota1, double nota2) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public static double media(double nota1, double nota2) {
		return (nota1 + nota2)/2;
	}
	
	
}
