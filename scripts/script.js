

var app = angular.module('mv', ["ngRoute", "chart.js" ]);

app.config(function($routeProvider){
  $routeProvider
  .when("/", {
  	controller: "mainController",
    templateUrl:"pages/todosEstabelecimentos.html"
      
    })
  .when("/todosEstabelecimentos", {
  	  controller: "mainController",
      templateUrl:"pages/todosEstabelecimentos.html"
    })
  .when("/tiposEstabelecimentos", {
  	controller: "tipoEstabelecimentoController",
    templateUrl:"pages/tiposEstabelecimentos.html"
    })
    .when("/estadosEstabelecimentos", {
  	controller: "estadosEstabelecimentoController",
    templateUrl:"pages/estadosEstabelecimentos.html"
    })
    .when("/tiposEstabelecimentosGrafico", {
  	controller: "tipoEstabelecimentoController",
    templateUrl:"pages/tiposEstabelecimentosGrafico.html"
    })
    .when("/estadosEstabelecimentosGrafico", {
  	controller: "estadosEstabelecimentoController",
    templateUrl:"pages/tiposEstabelecimentosGrafico.html"
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
		$scope.labels = ["Download Sales", "In-Store Sales", "Mail-Order Sales"];
		$scope.data = [300, 500, 100];
  });

app.controller("tipoEstabelecimentoController", function($scope, Estabelecimentos)
  {		
  		$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
  		$scope.titulo ="Todos os cadastros nacionais de estabelecimentos por tipo";
		$scope.labels = ["Download Sales", "In-Store Sales", "Mail-Order Sales"];
		$scope.data = [300, 500, 100];
	
  });

