		//entrada no scaner
		//verificar se o numero de entrada é fibo
		//se for vc pega esse numero e calcula o anterior
		//se não for vc calcula os dois anteriores
		//de forma que vc tenha dois numeros fibo iniciais para o for



	import java.util.Scanner;

	public class Fibonacci {
	
	public static void main(String[] args) {
	
		
		int n1 = 0, n2 = 1, n3 = 0;
		
		Scanner sc1 = new Scanner (System.in);
		System.out.print("Informe o valor inicial de Fibonacci");
		int valor1 = sc1.nextInt();
		sc1.close();
		
				while(valor1>n3){
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				
			}
				 
				
			if (valor1==0) {
				System.out.println("o numero 0 esta na sequencia fibonacci. \nO proximo numero é :" + n2);
				
			}else if (valor1==n3) {
				System.out.println("o numero" +"  "+ valor1 +"  "+ "esta na sequencia fibonacci. \nO proximo numero da sequencia Fibo é :" + (n1+valor1));
				
			}else {
				System.out.println("este numero não faz parte da sequencia fibonacci");
			
			} int i = ((n1+valor1)+n3); 
				do {  
	               System.out.println("O proximo numero da sequencia Fibo é :" + i);
	               i++;  
	            }while(i<=n1);  
		}
	}
	
	

	
	
	
	
		
	
		
	
	
		

	


	
