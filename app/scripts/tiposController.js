function separarPorTipo(estabelecimentos)
{
	var mapa = new Map();
	var estados = [];

	for(var i = 0; i < estabelecimentos.length; ++i)
	{
		var tipo = estabelecimentos[i].tipoGestao;

		if(estados.includes(tipo))
		{
			mapa.get(tipo).push(estabelecimentos[i]);
		}
		else
		{
			estados.push(tipo);
			mapa.set(tipo, []);
			mapa.get(tipo).push(estabelecimentos[i]);
			
		}
	}


	return mapa;
}

app.controller("tipoEstabelecimentoController", function($scope, $http, Estabelecimentos)
  {		
  		$scope.titulo ="Todos os cadastros nacionais de estabelecimentos de saúde por tipo";
  		$http.get("http://localhost:9000/api/getAll").then(function(response)
	 	{
	 		Estabelecimentos.estabelecimentos = response.data;
	 		
	 	});

  		$scope.mapa = separarPorTipo(Estabelecimentos.estabelecimentos);
		$scope.mapaArray = Array.from($scope.mapa);

		$scope.labels = [];
		$scope.data = [];
  		
  		for(var i = 0; i < $scope.mapaArray.length; ++i)
  		{

  			$scope.labels.push($scope.mapaArray[i][0]);
  			$scope.data.push($scope.mapaArray[i][1].length);

  		}


	
  });
