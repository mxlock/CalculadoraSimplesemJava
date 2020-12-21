package fundamentos;
import java.util.Scanner;

public class DesafioCalculadoraSimples {
	public static void main(String[] args) {
		// Ler um numero
		//Ler segundo numero
		//Escolher opera��o ( + , - , % , / ou *)
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escreva o primeiro n�mero: ");
		double num1 = entrada.nextInt();
		
		System.out.println("Escreva o segundo n�mero: ");
		double num2 = entrada.nextInt();
		
		System.out.println("Escolha uma opera��o mat�matica: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		//Se o valor for soma, a variavel op far� a soma de num1 e num2, caso contr�rio retornar valor 0.
		
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f" , num1, op, num2,resultado);
		
		
	}	
}
