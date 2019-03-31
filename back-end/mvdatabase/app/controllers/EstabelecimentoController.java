package controllers;

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
        return ok(Json.toJson(EstabelecimentoService.getService().getAll()));
    }
    
    public Result addEstabelecimento()
    {
    	JsonNode json = request().body().asJson();
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
    	
    	
    	EstabelecimentoNacional estabelecimento = new EstabelecimentoNacional(CNES, IBGE, Nome,  tipoUnidade, tipoGestao, logradouro, endereco, bairro, CEP, UF, municipio, telefone);
    	
    	return ok(Json.toJson(EstabelecimentoService.getService().addEstabelecimento(estabelecimento)));
    	
    }
    
    public Result updateEstabelecimento()
    {
    	JsonNode json = request().body().asJson();
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
    	
    	
    	EstabelecimentoNacional estabelecimento = new EstabelecimentoNacional(CNES, IBGE, Nome,  tipoUnidade, tipoGestao, logradouro, endereco, bairro, CEP, UF, municipio, telefone);
    	
    	return ok(Json.toJson(EstabelecimentoService.getService().updateEstabelecimento(estabelecimento)));
    	
    }
    
    public Result removerEstabelecimento(String CNES)
    {
    	
    	
    	EstabelecimentoNacional estabelecimento = new EstabelecimentoNacional();
    	estabelecimento.setCNES(CNES);
    	
    	return ok(Json.toJson(EstabelecimentoService.getService().removeEstabelecimento(estabelecimento)));
    	
    }

}
