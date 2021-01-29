package exercicios.abstracao;

public class Estoque {
	
	private Produto[] produtos;
	
	public void getPrateleira() {
		
		if(this.produtos!=null) {
			for(Produto item : this.produtos) {
				System.out.println("=================================================");
				System.out.println(item.getProduto());
			}
			return;
		}
		System.out.println("item não encontrado");
	}
	
	public void getProdutos() {
		System.out.println("================================================");
		System.out.println("quantidade de produtos no estoque: "+this.produtos.length);
		if(this.produtos!=null) {
			for(Produto item : this.produtos) {
				System.out.println("=================================================");
				System.out.println(item.getProduto());
			}
			return;
		}
		System.out.println("item não encontrado");
	}
	
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
}
