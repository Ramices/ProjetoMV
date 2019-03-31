
app.controller("mainController", function($scope, Estabelecimentos)
{	
	$scope.titulo = "Todos os cadastros nacionais de estabelecimentos";
	$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
		
});



