# ProjetoMV

O projeto consiste em uma SPA ( Single Page Application) que exiba as informações dos Cadastros Nacionais de Estabelecimentos de Saude.
Disponível no [Github](https://github.com/Ramices/ProjetoMV)


### Pré Requisitos

1. MySQL
2. MySQL WorkBrench, Oracle Developer ou algum similar
3. JDK 8
4. SBT 1.2.8
5. XAMPP
6. Visual Code, Sublime ou equivalente ( opcional)
7. Eclipse ( opcional)



### Instalando

Quando tudo estiver instalado, seguir o passo a passo abaixo:

1. Extrair o projetoMV.rar ou clonar do repositorio
2. Ir no local em que o XAMPP está instalado e copiar a pasta projetoMV para /xampp/htdocs/ ( por  exemplo o caminho que eu uso é: C:\Users\Ramices\xampp\htdocs
3. Abrir o Workbrench ou equivalente. Executar o script 'criar_banco.sql' disponível em projetoMV/back-end/
4. Abrir o CMD. Digitar cd caminhoDoProjetoNoXampp/projetoMV/back-end/mvdatabase
5. Opcionalmente, se houver algum desejo de editar o código no eclipse, digitar sbt eclipse
6. Digitar sbt run e esperar. O sbt irá baixar as dependências necessárias no projeto, compila-lo e executá-lo. Isso pode demorar um pouco na primeira vez que é executado
7. Ir em ProjetoMV/back-end/mvdatabase/app/services/EstabelecimentoService.java e trocar o usuário e senha pelo seu usuário e senha do MySQL
8. Digitar em algum navegador localhost:9000 (Se tudo for bem executado, deve aparecer um pequeno "Bom dia" no navegador, indicando que o back-end está funcionando)
9. Abrir o Xampp e clicar o botão 'start' ao lado do nome Apache
10. Digitar no navegador localhost/projetoMV/main.html


A aplicação deve estar funcionando totalmente agora. Dependendo do computador, a página pode demorar alguns segundos para carregar os dados

## Problemas rodando o back

Se por qualquer motivo não conseguirem rodar o back-end, o passo a  passo abaixo irá permitir executar a aplicação com dados locais:

Ir nos seguintes arquivos (projetoMV/app/scripts/):
mainController.JS
estadosController.js
tiposController.js

Substituir o seguinte código:

$http.get("http://localhost:9000/api/getAll").then(function(response)
	 	{
	 		Estabelecimentos.estabelecimentos = response.data;
	 		$scope.estabelecimentos = Estabelecimentos.estabelecimentos;
	 	});

Por:

$scope.estabelecimentos = Estabelecimentos.estabelecimentos;


Ir em factory.js (projetoMV/app/scripts/

Haverá um trecho de código comentado com alguns CNES extraídos da base de dados. Copiar e colar em:

return { estabelecimentos: [  COLE AQUI OS OBJETOS COMENTADOS  ]  };

## Informações adicionais:

O projeto está dividido em duas partes:

O Fron-End cuja o código fonte está no diretório ProjetoMV/app está divido em quatro partes:
1. image-> Que contém a imagem usado na nav-bar
2. scripts-> Que contémm os scripts dos frameworks utilizados, bem como os controladores, rotas e a factory do projeto.
3. styles-> Contém o bootstrap e 1 estilo que foi utilizado na página
4. pages-> As views utilizadas junto com as rotas.

O front-end foi desenvolvido em angularJS, com bootstrap, angular-chart e Char.js

Já o back-end, localizado no diretório ProjetoMV\back-end  tem três partes:
1. O script utilizado para criar e popular o banco de dados com alguns exemplos
2. Os próprios dados das CNES extraídas das fontes oficiais (DadosAbertos.txt) que não é utilizado diretamente na apliciação, mas foi utilizado para extrair dados. Como a máquina utilizada no desenvolvimento não é moderna, o desempenho tende a ser baixo. Por isso, foi evitado um volume muito grande de dados.
3. O código fonte do back-end  que foi desenvolvido em play-framework está no diretório ProjetoMV\back-end\mvdatabase. Para acessar as classes utilizadas, ir no diretório: ProjetoMV\back-end\mvdatabase\app. Para acessar as rotas que podem ser utilizadas (tanto as que foram utilizadas nos projeto quanto alguns que não foram integrados, mas podem ser acessados via Postman), ir em: ProjetoMV\back-end\mvdatabase\conf\routes

## Autor

* **Ramicés Moisés do Nascimento** - Ramices(https://github.com/Ramices)

