package entity;

import java.io.Serializable;

public class EstabelecimentoNacional implements Serializable
{
		
		private static final long serialVersionUID = 1L;
		private String CNES;
		private String IBGE;
	  	private String Nome;
	  	private String tipoUnidade;
	  	private String tipoGestao;
	  	private String logradouro;
	  	private String endereco;
	  	private String bairro;
	  	private String CEP;
	  	private String UF;
	  	private String municipio;
	  	private String telefone;
	  	
	  	public EstabelecimentoNacional()
	  	{
	  		this.CNES = "";
	  		this.IBGE = "";
	  		this.Nome = "";
	  		this.tipoUnidade = "";
	  		this.tipoGestao = "";
	  		this.logradouro = "";
	  		this.endereco = "";
	  		this.bairro = "";
		  	this.CEP = "";
		  	this.UF = "";
		  	this.municipio = "";
		  	this.telefone = "";
		  		
	  	}
 		
	  	
	  	public EstabelecimentoNacional(String CNES, String IBGE, String Nome, String tipoUnidade, String tipoGestao, String logradouro, String endereco, String bairro, String CEP, String UF, String municipio, String telefone)
	  	{
	  		this.CNES = CNES;
	  		this.IBGE = IBGE;
	  		this.Nome = Nome;
	  		this.tipoUnidade = tipoUnidade;
	  		this.tipoGestao = tipoGestao;
	  		this.logradouro = logradouro;
	  		this.endereco = endereco;
	  		this.bairro = bairro;
		  	this.CEP = CEP;
		  	this.UF = UF;
		  	this.municipio = municipio;
		  	this.telefone = telefone;
		  		
	  	}
 		
	  	public String getCNES() 
	  	{
			return CNES;
		}
	  	
		public void setCNES(String cNES) 
		{
			CNES = cNES;
		}
		
		public String getIBGE() 
		{
			return IBGE;
		}
		
		public void setIBGE(String iBGE) 
		{
			IBGE = iBGE;
		}
		
		public String getNome()
		{
			return Nome;
		}
		
		public void setNome(String nome) 
		{
			Nome = nome;
		}
		
		public String getTipoUnidade() 
		{
			return tipoUnidade;
		}
		
		public void setTipoUnidade(String tipoUnidade) 
		{
			this.tipoUnidade = tipoUnidade;
		}
		
		public String getTipoGestao() 
		{
			return tipoGestao;
		}
		
		public void setTipoGestao(String tipoGestao) 
		{
			this.tipoGestao = tipoGestao;
		}
		
		public String getLogradouro() 
		{
			return logradouro;
		}
		
		public void setLogradouro(String logradouro) 
		{
			this.logradouro = logradouro;
		}
		
		public String getEndereco() 
		{
			return endereco;
		}
		
		public void setEndereco(String endereco) 
		{
			this.endereco = endereco;
		}
		
		public String getBairro() 
		{
			return bairro;
		}
		
		public void setBairro(String bairro) 
		{
			this.bairro = bairro;
		}
		
		public String getCEP() 
		{
			return CEP;
		}
		
		public void setCEP(String cEP) 
		{
			CEP = cEP;
		}
		
		public String getUF() 
		{
			return UF;
		}
		
		public void setUF(String uF) 
		{
			UF = uF;
		}
		
		public String getMunicipio() 
		{
			return municipio;
		}
		
		public void setMunicipio(String municipio) 
		{
			this.municipio = municipio;
		}
		
		public String getTelefone() 
		{
			return telefone;
		}
	
		public void setTelefone(String telefone) 
		{
			this.telefone = telefone;
		}
		
		@Override
		public boolean equals(Object obj)
		{
			return CNES.equalsIgnoreCase(((EstabelecimentoNacional)obj).getCNES());
		}
		
		

	}