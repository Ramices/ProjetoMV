create schema if not exists databasemv;
use databasemv;

create table if not exists estabelecimento_nacional(
		CNES VARCHAR(15) PRIMARY KEY,
		IBGE VARCHAR(15),	  	
		Nome VARCHAR(50),	  	
		tipoUnidade VARCHAR(50),
		tipoGestao VARCHAR(10),	  	
		logradouro VARCHAR(50),
		endereco VARCHAR(50),
		bairro VARCHAR(50),
		CEP VARCHAR(15),
		UF VARCHAR(5),
		municipio VARCHAR(50),
		telefone VARCHAR(15)
	  	

);

insert into estabelecimento_nacional values(
	"6577687",
	"292240",
	"SECRETARIA DE SAUDE DE MUTUIPE",
	"CENTRAL DE GESTAO EM SAUDE",
	"M",
	"RUA RUY BARBOSA",
	"S/N",
	"CENTRO",
	"45480000",
	"BA",
	"Mutuípe",
	""

);

select * from estabelecimento_nacional;