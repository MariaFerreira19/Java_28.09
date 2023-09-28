package POO2;
//O Java admite herança multipla, ou seja, herdar caracteristicas
//de mais de uma classe.
public class VeiculoY extends VeiculoX
{
	boolean turbo;
	public void ligaTurbo( ) {
		turbo = true;
	}
	public void desligaTurbo()
	{
		turbo = false;
	}
	//Isto faz com que as classes VeiculoX e VeiculoY sejam chamadas de classes
	//GENÉRICAS  
}
