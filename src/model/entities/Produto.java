package model.entities;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double precoCompra;
	private Double precoVenda;
	private Integer codProduto;
	
	public Produto() {
	}
	
	public Produto(Integer id, String nome, Double precoCompra, Double precoVenda, Integer codProduto) {
		this.id = id;
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.codProduto = codProduto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda
				+ ", codProduto=" + codProduto + "]";
	}
	
	
}
