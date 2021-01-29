package exercicios.abstracao;

public class Prateleira {
	
	Estoque estoque;
	
	public void getPrateleira() {
		System.out.println("================================================");
		System.out.println("prateleira");
		estoque.getPrateleira();
	}
	
	public void setPrateleira(Estoque estoque) {
		this.estoque = estoque;
	}
	
}
