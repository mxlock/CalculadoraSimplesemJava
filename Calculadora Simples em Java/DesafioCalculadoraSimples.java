package fundamentos;
import java.util.Scanner;

public class DesafioCalculadoraSimples {
	public static void main(String[] args) {
		// Ler um numero
		//Ler segundo numero
		//Escolher operação ( + , - , % , / ou *)
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escreva o primeiro número: ");
		double num1 = entrada.nextInt();
		
		System.out.println("Escreva o segundo número: ");
		double num2 = entrada.nextInt();
		
		System.out.println("Escolha uma operação matématica: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		//Se o valor for soma, a variavel op fará a soma de num1 e num2, caso contrário retornar valor 0.
		
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f" , num1, op, num2,resultado);
		
		
	}	
}
