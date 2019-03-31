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
    templateUrl:"pages/estadosEstabelecimentosGrafico.html"
    })
});
