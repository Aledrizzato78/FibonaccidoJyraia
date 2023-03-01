package atividadesModulo2;

public class MetodoSerieHarmonica {

	public float calculoSerieHarmonica(int vetor[]) {

		int x = 1;
		int z = 5;
		int multiplicacao = x * z;
		System.out.println("X=" + multiplicacao);

		int total = 0;
		for (int d : vetor)
			total = total + d;

		System.out.println("Y=" + total);

		float divisao = (float) multiplicacao / total;

		return divisao;

	}
	
}
