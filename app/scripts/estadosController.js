

function separarPorEstado(estabelecimentos)
{
	var mapa = new Map();
	var estados = [];

	for(var i = 0; i < estabelecimentos.length; ++i)
	{
		var uf = estabelecimentos[i].uf;

		if(estados.includes(uf))
		{
			mapa.get(uf).push(estabelecimentos[i]);
		}
		else
		{
			estados.push(uf);
			mapa.set(uf, []);
			mapa.get(uf).push(estabelecimentos[i]);
			
		}
	}


	return mapa;
}

app.controller("estadosEstabelecimentoController", function($scope, $http, Estabelecimentos)
  {		
		$scope.titulo ="Todos os cadastros nacionais de estabelecimentos por estado";
		
		$http.get("http://localhost:9000/api/getAll").then(function(response)
	 	{
	 		Estabelecimentos.estabelecimentos = response.data;
	 	});

		$scope.mapa = separarPorEstado(Estabelecimentos.estabelecimentos);
		$scope.mapaArray = Array.from($scope.mapa);


		$scope.labels = [];
		$scope.data = [];
  		
  		for(var i = 0; i < $scope.mapaArray.length; ++i)
  		{

  			$scope.labels.push($scope.mapaArray[i][0]);
  			$scope.data.push($scope.mapaArray[i][1].length);

  		}


  });






