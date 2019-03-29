


var app = angular.module('mv', ['ngRoute']);

app.config(function($routeProvider){
  $routeProvider
  .when("/", {
  	controller: "mainController",
    templateUrl:"pages/todosEstabelecimentos.html"
      
    })
  .when("/todosEstabelecimentos", {
      templateUrl:"pages/todosEstabelecimentos.html",
      controller: "mainController"
    })
  .when("/tiposEstabelecimentos", {
  	controller: "tipoEstabelecimentoController",
    templateUrl:"pages/tiposEstabelecimentos.html"
    })
    .when("/estadosEstabelecimentos", {
  	controller: "estadosEstabelecimentoController",
    templateUrl:"pages/estadosEstabelecimentos.html"
    })
});


app.factory('Estabelecimentos', function(){
  return { estabelecimentos: [{
			co_cnes: "57432",
			co_ibge: "15678",
			no_fantasia: "Hospital Sao Joaquim",
			ds_tipo_unidade: "Casa de Saude",
			tp_gestao: "Gestao hospitalar",
			no_logradouro: "Travessa Pastor Lindonio",
			nu_endereco: "Bela Vista",
			no_bairro: "Bela Vista",
			co_cep: "55608502",
			uf: "PE",
			municipio: "Recife",
			nu_telefone: "35231016"

    	},
    	{
			co_cnes: "57432",
			co_ibge: "15678",
			no_fantasia: "Hospital Sao Joaquim",
			ds_tipo_unidade: "Casa de Saude",
			tp_gestao: "Gestao hospitalar",
			no_logradouro: "Travessa Pastor Lindonio",
			nu_endereco: "Bela Vista",
			no_bairro: "Bela Vista",
			co_cep: "55608502",
			uf: "MG",
			municipio: "Recife",
			nu_telefone: "35231016"

    	},
    	{
			co_cnes: "57432",
			co_ibge: "15678",
			no_fantasia: "Hospital Sao Joaquim",
			ds_tipo_unidade: "Casa de Saude",
			tp_gestao: "Gestao hospitalar",
			no_logradouro: "Travessa Pastor Lindonio",
			nu_endereco: "Bela Vista",
			no_bairro: "Bela Vista",
			co_cep: "55608502",
			uf: "PB",
			municipio: "Recife",
			nu_telefone: "35231016"

    	}
    ] };
});


app.controller("mainController", function($scope, Estabelecimentos)
{		
	$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
	$scope.titulo = "Todos os cadastros nacionais de estabelecimentos";
});

app.controller("estadosEstabelecimentoController", function($scope, Estabelecimentos)
  {		
		$scope.titulo ="Todos os cadastros nacionais de estabelecimentos por estado";
		$scope.estabelecimentos = Estabelecimentos.estabelecimentos;

  });

app.controller("tipoEstabelecimentoController", function($scope, Estabelecimentos)
  {		
  		$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
  		$scope.titulo ="Todos os cadastros nacionais de estabelecimentos por tipo";
  });