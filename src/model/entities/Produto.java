package model.entities;

public class Produto {
	
	private String nome;
	private Double precoCompra;
	private Double precoVenda;
	private Integer codProduto;
	
	public Produto() {
	}
	
	public Produto(String nome, Double precoCompra, Double precoVenda, Integer codProduto) {
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.codProduto = codProduto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codProduto == null) ? 0 : codProduto.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codProduto == null) {
			if (other.codProduto != null)
				return false;
		} else if (!codProduto.equals(other.codProduto))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + ", codProduto="
				+ codProduto + "]";
	}
	
	
}
