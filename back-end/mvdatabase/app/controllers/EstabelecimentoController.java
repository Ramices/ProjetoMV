package controllers;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;

import entity.EstabelecimentoNacional;
import interceptor.ApiInterceptor;
import play.libs.Json;
import play.mvc.*;
import services.EstabelecimentoService;

@play.mvc.With({ ApiInterceptor.class })
public class EstabelecimentoController extends Controller {

	 
    public Result index() 
    {
    	
        return ok(Json.toJson("Bom dia"));
    }
    
    
    public Result getAll()
    {
    	try
    	{
        return ok(Json.toJson(EstabelecimentoService.getService().getAll()));
    	}
    	catch(SQLException | ClassNotFoundException e)
    	{
    		return ok(Json.toJson(new ArrayList<EstabelecimentoNacional>()));
    	}
    }
    
    private EstabelecimentoNacional extrairEstabelecimento(JsonNode json)
    {
    	String CNES = json.findPath("CNES").textValue();
    	String IBGE = json.findPath("IBGE").textValue();
    	String Nome = json.findPath("Nome").textValue();
    	String tipoUnidade = json.findPath("tipoUnidade").textValue();
    	String tipoGestao = json.findPath("tipoGestao").textValue();
    	String logradouro = json.findPath("logradouro").textValue();
    	String endereco = json.findPath("endereco").textValue();
    	String bairro = json.findPath("bairro").textValue();
    	String CEP = json.findPath("CEP").textValue();
    	String UF = json.findPath("UF").textValue();
    	String municipio = json.findPath("municipio").textValue();
    	String telefone = json.findPath("telefone").textValue();
    	
    	
    	return new EstabelecimentoNacional(CNES, IBGE, Nome,  tipoUnidade, tipoGestao, logradouro, endereco, bairro, CEP, UF, municipio, telefone);
    	
    }
    
    public Result addEstabelecimento()
    {
    	JsonNode json = request().body().asJson();
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().addEstabelecimento(extrairEstabelecimento(json))));
    	}
    	catch(Exception e)
    	{
    		return ok(Json.toJson(false));
      	  
    	}
    }
    
    public Result updateEstabelecimento()
    {
    	JsonNode json = request().body().asJson();
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().updateEstabelecimento(extrairEstabelecimento(json))));
    	}
    	catch(Exception e)
    	{
    		
    		return ok(Json.toJson(false));
    	}
    }
    
    public Result removerEstabelecimento(String CNES)
    {
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().removeEstabelecimento(CNES)));
    	}
    	catch(Exception e)
    	{
    		return ok(Json.toJson(false));
    	}
    }
    
    public Result getCNES(String CNES)
    {
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().getCNES(CNES)));
    	}
    	catch(Exception e)
    	{
    		return ok(Json.toJson(new EstabelecimentoNacional()));
    	}
    }
    
    public Result getIBGE(String IBGE)
    {
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().getIBGE(IBGE)));
    	}
    	catch(Exception e)
    	{
    		return ok(Json.toJson(new EstabelecimentoNacional()));
    	}
    }
    
    public Result getUF(String UF)
    {
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().getUF(UF)));
    	}
    	catch(Exception e)
    	{
    		return ok(Json.toJson(new ArrayList<EstabelecimentoNacional>()));
    	}
    }
    
    public Result getTipo(String tipo)
    {
    	
    	try
    	{
    		return ok(Json.toJson(EstabelecimentoService.getService().getTipo(tipo)));
    	}
    	catch(Exception e)
    	{
    		return ok(Json.toJson(new ArrayList<EstabelecimentoNacional>()));
    	}
    }

}
