package model.entities;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Venda {
	
	private Integer idVenda;
	private Date dataVenda;
	private String idVendedor;
	private String meioPagamento;
	private Double totalVenda;
	private Map<Produto, Integer> produtos = new TreeMap<>();
	private Map<Produto, Integer> produtosCancelados = new TreeMap<>();
	
	public Venda() {
	}
	
	public Venda(Integer idVenda, Date dataVenda, String idVendedor, String meioPagamento, Double totalVenda,
			Map<Produto, Integer> produtos, Map<Produto, Integer> produtosCancelados) {
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.idVendedor = idVendedor;
		this.meioPagamento = meioPagamento;
		this.totalVenda = totalVenda;
		this.produtos = produtos;
		this.produtosCancelados = produtosCancelados;
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(String idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getMeioPagamento() {
		return meioPagamento;
	}

	public void setMeioPagamento(String meioPagamento) {
		this.meioPagamento = meioPagamento;
	}
	
	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}
	
	public void insereProduto(Produto p, int quantidade) {
		if(!produtos.containsKey(p)) {
			this.produtos.put(p, quantidade);
		}
		else if(produtos.containsKey(p)) {
			this.produtos.put(p, produtos.get(p) + quantidade);
		}
	}
		
	public void removeProduto(Produto p, int quantidade) {
		if(!produtosCancelados.containsKey(p)) {
			this.produtosCancelados.put(p, quantidade);
		}
		
		this.produtos.remove(p);
	}
	
	public Map<Produto, Integer> getProdutosCancelados() {
		return produtosCancelados;
	}
	
	public Double subTotal() {
		for(Produto p : produtos.keySet()) {
			this.totalVenda += p.getPrecoVenda() * produtos.get(p);
		}
		
		return totalVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVenda == null) ? 0 : idVenda.hashCode());
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
		Venda other = (Venda) obj;
		if (idVenda == null) {
			if (other.idVenda != null)
				return false;
		} else if (!idVenda.equals(other.idVenda))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", dataVenda=" + dataVenda + ", idVendedor=" + idVendedor
				+ ", meioPagamento=" + meioPagamento + ", totalVenda=" + totalVenda + ", produtos=" + produtos
				+ ", produtosCancelados=" + produtosCancelados + "]";
	}
	
}


