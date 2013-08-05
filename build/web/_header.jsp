<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <title>Loja de Esportes</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Loja de esportes">
    <meta name="author" content="Lucas Nadalutti, Marcelle Guine, Pedro Yusim">

    <!-- Le styles -->
    <link href="/lojaDeEsportes/css/bootstrap.css" rel="stylesheet">
    <link href="/lojaDeEsportes/css/style.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/favicon.png">
  </head>

  <body>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="/lojaDeEsportes/index.jsp">Loja de Esportes</a>
          <div class="nav-collapse collapse">
            <p class="navbar-text pull-right">
              <a href="#" class="navbar-link">marcelleguine</a>
            </p>
            <ul class="nav">
              <li class="active"><a href="/lojaDeEsportes/index.jsp">Venda</a></li>
              <li class="dropdown">
                <a href="#" id="products" role="button" class="dropdown-toggle" data-toggle="dropdown">Produtos<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu" aria-labelledby="products">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/product/buy.jsp">Comprar</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/CreateProductServlet">Cadastrar</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/ViewProductsServlet">Visualizar</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" id="users" role="button" class="dropdown-toggle" data-toggle="dropdown">Funcionários<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu" aria-labelledby="users">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/user/new.jsp">Cadrastrar</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/ViewUsersServlet">Visualizar</a></li>
                </ul>
              </li>
              <li><a href="/lojaDeEsportes/report.jsp" id="report" role="button">Relatórios</a></li>
            </ul>
          </div><!--end nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container-fluid">