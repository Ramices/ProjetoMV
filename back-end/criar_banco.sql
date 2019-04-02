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

insert into estabelecimento_nacional values(
	"6579744",
	"291840",
	"INSTITUTO VIVER DR ROBERTO",
	"CLINICA/CENTRO DE ESPECIALIDADE",
	"M",
	"AVENIDA PAULO AFONSO",
	"437",
	" ALTO DA MARAVILHA",
	"48904580",
	"BA",
	"Juazeiro",
	""

);

insert into estabelecimento_nacional values(
	"6591779",
	"260800",
	"SECRETARIA MUNICIPAL DE SAUDE DE JATAUBA",
	"CENTRAL DE GESTAO EM SAUDE",
	"M",
	"PRACA RODOLFO GRAUSSA",
	"S/N",
	" CENTRO",
	"55180000",
	"PE",
	"Jataúba",
	"813746-1151"

);

select * from estabelecimento_nacional;