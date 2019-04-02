
app.controller("mainController", function($scope,  $http, Estabelecimentos)
{	
	$scope.titulo = "Todos os cadastros nacionais de estabelecimentos de  saúde";
	$scope.estabelecimentos = [];
	$scope.nome = "";

	$http.get("http://localhost:9000/api/getAll").then(function(response)
	 	{
	 		Estabelecimentos.estabelecimentos = response.data;
	 		$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
	 	});


});



