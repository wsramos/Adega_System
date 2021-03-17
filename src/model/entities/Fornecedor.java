package model.entities;

public class Fornecedor {
	
	private String nome, uf, cidade, endereco, telefone, telefone2, celular, celular2;
	private Integer id;
	
	public Fornecedor() {
	}
	
	public Fornecedor(Integer id, String nome, String uf, String cidade, String endereco, String telefone, String telefone2,
			String celular, String celular2) {
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.cidade = cidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.celular = celular;
		this.celular2 = celular2;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
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
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + ", uf=" + uf + ", cidade=" + cidade + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", telefone2=" + telefone2 + ", celular=" + celular + ", celular2="
				+ celular2 + ", id=" + id + "]";
	}
	
	
}
