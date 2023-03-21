


	import java.util.Scanner;

	public class Fibonacci {
	
	public static void main(String[] args) {
	
		Scanner sc1 = new Scanner (System.in);
		System.out.print("Informe o valor inicial de Fibonacci");
		int valor1 = sc1.nextInt();
		sc1.close();
		
		Scanner sc2 = new Scanner (System.in);
		System.out.print("Informe o valor final de Fibonacci");	
		int valor2 = sc2.nextInt();
		sc2.close();
	{
		int num1 = 1, num2 = 0;
		
		System.out.println(num2);
		System.out.println(num1);
		
		for(int i=0; i=(valor1%valor2);i++){
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.println(num1);
			
		}
	}
			
	}
		
	}
	


				

	


	
