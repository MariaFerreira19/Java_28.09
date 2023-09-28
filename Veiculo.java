package POO2;
public class Veiculo {
	//Esta classe possui duas variáveis de instância: nome e velocidade.
	//Esta classe será a classe base, também conhecida como "superclasse" ou "classe pai".
	String nome;
	float velocidade;
	public void acelera() {
		if(velocidade <= 10) {
			velocidade++;
		}
	}
	public void freia() {
		if(velocidade > 0) {
			velocidade--;
		}
	}
}
