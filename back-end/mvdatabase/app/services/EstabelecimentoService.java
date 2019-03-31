package services;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entity.EstabelecimentoNacional;

public class EstabelecimentoService {

	private static EstabelecimentoService service = null;
	private List<EstabelecimentoNacional> repositorio = read();
	
	
	public static EstabelecimentoService getService()
	{
		if(service == null)
		{
			service = new EstabelecimentoService();
		}
		
		return service;
	}
	
	
	private List<EstabelecimentoNacional> read()
	{
		
		try 
		{
			FileInputStream fis = new FileInputStream(new File("dados.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			repositorio = (List<EstabelecimentoNacional>)ois.readObject();
			
			fis.close();
			ois.close();
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			
		}
		
		return new ArrayList<EstabelecimentoNacional>();
	}
	
	public void save()
	{
		try {
			FileOutputStream fos = new FileOutputStream(new File("dados.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(repositorio);
			
			fos.close();
			oos.close();
			
		} 
		catch (IOException e) 
		{
			
		}
		
	}
	
	public List<EstabelecimentoNacional> getAll()
	{
		return repositorio;
	}
	
	
	public boolean addEstabelecimento(EstabelecimentoNacional estabelecimento)
	{
		if(repositorio.contains(estabelecimento))
		{
			return false;
		}
		
		repositorio.add(estabelecimento);
		save();
		
		return true;
	}
	
	public boolean updateEstabelecimento(EstabelecimentoNacional estabelecimento)
	{
		if(repositorio.contains(estabelecimento))
		{
			repositorio.set(repositorio.indexOf(estabelecimento), estabelecimento);
			save();
			
			return true;
		}
		
		
		return false;
	}
	
	public boolean removeEstabelecimento(EstabelecimentoNacional estabelecimento)
	{
		if(repositorio.contains(estabelecimento))
		{
			repositorio.remove(estabelecimento);
			save();
			
			return true;
		}
		
		
		return false;
	}
	
	
	
	
}
