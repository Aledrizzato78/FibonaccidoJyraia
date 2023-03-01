package atividadesModulo2;


public class SerieHarmonica {

	public static void main(String[] args) {
		
		int x = 1;
		int z = 5;
		int multiplicacao = x*z;
		System.out.println("X="+multiplicacao);
		
				
		int vetor[] = {1,2,3,4,5};
		int total = 0;
		for (int d: vetor)
		total = total + d;
		
		System.out.println("Y=" + total);
			
						
		float divisao = (float) multiplicacao/total;
		System.out.printf("Divisao =%.3f",divisao);
		
	
	}

}
