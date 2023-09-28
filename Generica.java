package POO2;

public class Generica {
	public static void main(String[] args) {
		//Criamos um objeto da classe VeiculoX
		VeiculoX x = new VeiculoX ();
		VeiculoY y = new VeiculoY ();
		x.velocidade = 10;
		y.velocidade = 20;
		mostraVelocidade(x);
		mostraVelocidade(y);
	}
	public static void mostraVelocidade (Veiculo veic) {
		System.out.println(veic.velocidade);
	}
}
