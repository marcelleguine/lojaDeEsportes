<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<c:if test="${!empty sessionScope['logged_user']}">

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
          <a class="brand" href="/lojaDeEsportes/ViewSalesServlet">Loja de Esportes</a>
          <div class="nav-collapse collapse">
              <!-- Instanciando um Bean para poder escrever o nome do usuário logado. -->
                <jsp:useBean id="logged_user" type="model.UserBean" scope="session" /> 
            <p class="navbar-text pull-right">
                <a href="#" class="navbar-link"><jsp:getProperty name="logged_user" property="login" /></a>
              <a href="/lojaDeEsportes/LogoutServlet" class="navbar-link">sair</a>
            </p>
            <ul class="nav">
              <li class="ce"><a href="/lojaDeEsportes/ViewSalesServlet">Vendas</a></li>
              <li><a href="/lojaDeEsportes/ViewPurchasesServlet" id="report" role="button">Compras</a></li>
              <li class="dropdown">
                <a href="#" id="products" role="button" class="dropdown-toggle" data-toggle="dropdown">Produtos<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu" aria-labelledby="products">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/LoadPurchaseServlet">Comprar</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/product/new.jsp">Cadastrar</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/ViewProductsServlet">Visualizar</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" id="users" role="button" class="dropdown-toggle" data-toggle="dropdown">Funcionários<b class="caret"></b></a>
                <ul class="dropdown-menu" role="menu" aria-labelledby="users">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/user/new.jsp">Cadastrar</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="/lojaDeEsportes/ViewUsersServlet">Visualizar</a></li>
                </ul>
              </li>
            </ul>
          </div><!--end nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container-fluid">
        <c:if test="${!empty requestScope['userMessage']}">
            <jsp:useBean id="userMessage"
                        type="model.MessageBean"
                        scope="request" />
            <div class="row-fluid">
                <span id="user_messages" class="<jsp:getProperty name="userMessage" property="success" />">
                    <jsp:getProperty name="userMessage" property="message" />
                </span>
            </div>
        </c:if>
</c:if>

<c:if test="${empty sessionScope['logged_user']}">
    <script type="text/javascript">
        window.location="/lojaDeEsportes/login.jsp";
    </script>
</c:if>
            