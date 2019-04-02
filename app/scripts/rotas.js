app.config(function($routeProvider){
  $routeProvider
  .when("/", {
  	controller: "mainController",
    templateUrl:"app/pages/todosEstabelecimentos.html"
      
    })
  .when("/todosEstabelecimentos", {
  	  controller: "mainController",
      templateUrl:"app/pages/todosEstabelecimentos.html"
    })
  .when("/tiposEstabelecimentos", {
  	controller: "tipoEstabelecimentoController",
    templateUrl:"app/pages/tiposEstabelecimentos.html"
    })
    .when("/estadosEstabelecimentos", {
  	controller: "estadosEstabelecimentoController",
    templateUrl:"app/pages/estadosEstabelecimentos.html"
    })
    .when("/tiposEstabelecimentosGrafico", {
  	controller: "tipoEstabelecimentoController",
    templateUrl:"app/pages/tiposEstabelecimentosGrafico.html"
    })
    .when("/estadosEstabelecimentosGrafico", {
  	controller: "estadosEstabelecimentoController",
    templateUrl:"app/pages/estadosEstabelecimentosGrafico.html"
    })

});
