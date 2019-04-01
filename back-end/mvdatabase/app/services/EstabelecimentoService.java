package services;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import entity.EstabelecimentoNacional;

public class EstabelecimentoService {

	private static EstabelecimentoService service = null;
	private String url = "jdbc:mysql://localhost:3306/databasemv";
    private String usuario = "root";
    private String senha = "wtaptaji";

	
	public static EstabelecimentoService getService()
	{
		if(service == null)
		{
			service = new EstabelecimentoService();
		}
		
		return service;
	}
	
	
	private EstabelecimentoNacional lerResultado(ResultSet result) throws SQLException
	{
		String CNES = result.getString("CNES");;
    	String IBGE = result.getString("IBGE");;
    	String Nome = result.getString("Nome");
    	String tipoUnidade = result.getString("tipoUnidade");
    	String tipoGestao = result.getString("tipoGestao");
    	String logradouro = result.getString("logradouro");
    	String endereco = result.getString("endereco");
    	String bairro = result.getString("bairro");
    	String CEP = result.getString("CEP");
    	String UF = result.getString("UF");
    	String municipio = result.getString("municipio");
    	String telefone = result.getString("telefone");
    	
    	return new EstabelecimentoNacional(CNES, IBGE, Nome,  tipoUnidade, tipoGestao, logradouro, endereco, bairro, CEP, UF, municipio, telefone);
	
	}
	
	public List<EstabelecimentoNacional> getAll() throws SQLException, ClassNotFoundException
	{
		
		java.sql.Connection conexao = DriverManager.getConnection(url, usuario, senha);
		ResultSet result = conexao.prepareStatement("select * from databasemv.estabelecimento_nacional").executeQuery();
		 
		List<EstabelecimentoNacional> repositorio = new ArrayList<EstabelecimentoNacional>();
	 
		
		while (result.next()) 
		{
			
	    	repositorio.add(lerResultado(result));
	        
		}
		
		conexao.close();
		
		return repositorio;
	}
	
	
	public boolean addEstabelecimento(EstabelecimentoNacional estabelecimento) throws SQLException
	{
		
		java.sql.Connection conexao = DriverManager.getConnection(url, usuario, senha);
		ResultSet result = conexao.prepareStatement("select CNES from databasemv.estabelecimento_nacional where CNES = " + estabelecimento.getCNES()).executeQuery();
		 
		if(!result.next())
		{
			
			conexao.prepareStatement("insert into databasemv.estabelecimento_nacional values (" + "\""+ estabelecimento.getCNES() +"\""+", "+ "\""+estabelecimento.getIBGE() +"\""+", " +"\""+estabelecimento.getNome() +"\""+", " +"\""+estabelecimento.getTipoUnidade() +"\""+", " +"\""+estabelecimento.getTipoGestao() +"\""+", " +"\""+estabelecimento.getLogradouro() +"\""+", " +"\""+estabelecimento.getEndereco() +"\""+", " +"\""+estabelecimento.getBairro() +"\""+", " +"\""+estabelecimento.getCEP() +"\""+", " +"\""+estabelecimento.getUF() +"\""+", " +"\""+estabelecimento.getMunicipio() +"\""+", " +"\""+estabelecimento.getTelefone() +"\""+");"   ).executeUpdate();
			return true;
		}
		
		conexao.close();
	
		return false;
			
		
	}
	
	public boolean updateEstabelecimento(EstabelecimentoNacional estabelecimento) throws SQLException
	{
		java.sql.Connection conexao = DriverManager.getConnection(url, usuario, senha);
		ResultSet result = conexao.prepareStatement("select CNES from databasemv.estabelecimento_nacional where CNES = " + estabelecimento.getCNES()).executeQuery();
		 
		if(result.next())
		{
			
			return true;
		}
		
		conexao.close();
	
		return false;
	
	}
	
	public boolean removeEstabelecimento(String CNES) throws SQLException
	{
		
		java.sql.Connection conexao = DriverManager.getConnection(url, usuario, senha);
		ResultSet result = conexao.prepareStatement("select CNES from databasemv.estabelecimento_nacional where CNES = " + CNES).executeQuery();
		
		
		if(result.next())
		{
			conexao.prepareStatement("delete from databasemv.estabelecimento_nacional where CNES = " + CNES).executeUpdate();
			return true;
		}
		
		conexao.close();
	
		return false;
	
	}
	
	
	
	
}
