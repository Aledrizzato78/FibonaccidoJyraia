		//entrada no scaner
		//verificar se o numero de entrada é fibo
		//se for vc pega esse numero e calcula o anterior
		//se não for vc calcula os dois anteriores
		//de forma que vc tenha dois numeros fibo iniciais para o for



	import java.util.Scanner;

	public class Fibonacci {
	
	public static void main(String[] args) {
	
		Scanner sc1 = new Scanner (System.in);
		System.out.print("Informe o valor inicial de Fibonacci");
		int valor1 = sc1.nextInt();
		sc1.close();
		
			
		int num1 = valor1 , num2 = num1-1;

				
		for (int i=0; i<10; i++) {
			
			num1 = num1 + num2;
			num2 = num1 - num2;
			
			{	
		
			int nums [] = {num1};
			int z = valor1;
			for (int x:nums) {
				z = z + x;
			}
			System.out.println(" a sequencia Fibo é" +" "+ z);
			}
		  }
		}
	
	}
	
			
	
		
	
	


				

	


	
