
app.controller("mainController", function($scope,  $http, Estabelecimentos)
{	
	$scope.titulo = "Todos os cadastros nacionais de estabelecimentos";
	$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
	$http.get("http://localhost:9000/").then(function(response)
	 	{


	 	});
		
});



