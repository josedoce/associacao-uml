package exercicios.abstracao;

public class Gerencia {
	
	private Estoque estoque;
	private Prateleira prateleira;
	
	public Gerencia(Estoque estoque, Prateleira prateleira) {
		this.estoque = estoque;
		this.prateleira = prateleira;
	}
	
	public Gerencia() {
		
	}
	
	public void getEstoque() {
		this.estoque.getProdutos();
	}
	
	public void getPrateleira() {
		this.prateleira.getPrateleira();
	}
	
}
