
public class Fibonacci {

	public static void main(String[] args) {
		
		
		
		int anterior1 = 0;		
		int anterior2 = 1;
		int calculado = anterior1 + anterior2;
		System.out.print(anterior1+ "," +anterior2+ "," +calculado+ ",");
		
		for (int i=0; i <= 30; i++)
		{
			anterior1 = anterior2;
			anterior2 = calculado;
			calculado = anterior1 + anterior2;
			System.out.print(calculado + ",");
		
		}
		{
			
				for (int cont=0; cont <=30 ; cont++){
				System.out.println("o valor do contador é:"+cont);
			}
			}
	
		}
	}

				

	


	
