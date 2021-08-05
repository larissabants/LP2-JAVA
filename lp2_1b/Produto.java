package lp2_1b;

public class Produto implements Comparable<CarrinhoCompras> {
	
	private Integer codigo;
	private String nome;
	private Double preco;
	
	public Produto() {
		this.codigo = 0;
		this.nome = "";
		this.preco = 0.0;
	}
	
	public Produto(Integer codigo, String nome, Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int compareTo(CarrinhoCompras o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
