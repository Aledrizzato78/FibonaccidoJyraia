package atividadesModulo2;

public class Matriz4x4 {

	public static void main(String[] args) {

		int[] vetor = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

		int cont = 0;

		int matriz[][] = new int[4][4];

		
		int lin = 0;
		int col = 0;
		
		for (col  = 0; col <matriz.length; col++) {
			for (lin = 0; lin <matriz.length; lin++) {
				matriz[lin][col] = vetor [cont];
				cont++;
				}
					
		}
		for (col  = 0; col <matriz.length; col++) {
			for (lin = 0; lin <matriz.length; lin++) {
				System.out.print(matriz [lin][col] + "\t");
				System.out.println(",");
			}
		}
	}
}
