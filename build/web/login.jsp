<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Loja de Esportes</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Loja de esportes">
    <meta name="author" content="Lucas Nadalutti, Marcelle Guine, Pedro Yusim">

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/favicon.png">
  </head>

  <body id="login">
    <div class="container">
      <form class="form-signin" action="LoginServlet">
        <h2>Loja de Esportes</h2>
        <input name="login" type="text" class="input-block-level" placeholder="email" required>
        <input name="password" type="password" class="input-block-level" placeholder="senha" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me">Lembrar usuário
        </label>
        <button class="btn btn-success" type="submit">Login</button>
      </form>
    </div> <!-- end container -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>