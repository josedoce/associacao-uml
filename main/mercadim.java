package exercicios.main;
import exercicios.abstracao.*;

public class mercadim {
	
	public static void main(String[] args) {
		
		//cadastro de produtos
		Produto produto1 = new Produto("ovos", "10/12/2021", 2.30, 20);
		Produto produto2 = new Produto("uvas", "02/02/2021", 5.20, 21);
		Produto[] itemProduto = new Produto[2];
		itemProduto[0] = produto1;
		itemProduto[1] = produto2;
		
		//compra de produto
		produto1.setCompra(5);
		produto2.setCompra(3);
		
		//estoque
		Estoque estocar = new Estoque();
		estocar.setProdutos(itemProduto);
		//estocar.getProdutos();
		
		//prateleira
		Prateleira prateleira = new Prateleira();
		prateleira.setPrateleira(estocar);
		prateleira.getPrateleira();
		
		//gerencia
		Gerencia gerencia = new Gerencia(estocar, prateleira);
		gerencia.getEstoque();
		gerencia.getPrateleira();
	}
	
}
