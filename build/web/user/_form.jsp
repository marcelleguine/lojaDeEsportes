<form id="form-usuario" class="form-horizontal" action="/lojaDeEsportes/userServlet">
  <div id="usuario-box-nome" class="control-group">
    <label class="control-label" for="name">Nome</label>
    <div class="controls">
      <input type="text" id="nome-usuario" placeholder="Nome" required>
      <span display="none" class="help-inline"></span>
    </div>
  </div>

  <div id="usuario-box-cpf" class="control-group">
    <label class="control-label" for="cpf">CPF</label>
    <div class="controls">
      <input type="number" id="cpf" placeholder="___ . ___ . ___ - __" required> <!-- criar máscara -->
      <span display="none" class="help-inline"></span>
    </div>
  </div>
  
  <div id="usuario-box-data" class="control-group">
    <label class="control-label" for="data-nascimento">Data de nascimento</label>
    <div class="controls">
      <input type="date" id="data-nascimento" placeholder="__/__/__"> <!-- criar máscara -->
      <span display="none" class="help-inline"></span>
    </div>
  </div>
  
  <div id="usuario-box-email" class="control-group">
    <label class="control-label" for="email">E-mail</label>
    <div class="controls">
      <input type="email" id="email" placeholder="email@email.com"> <!-- criar máscara -->
      <span display="none" class="help-inline"></span>
    </div>
  </div>

  <div id="usuario-box-salario" class="control-group">
    <label class="control-label" for="salary">Salário</label>
    <div class="controls">
      <input type="text" id="salario" placeholder="R$" required> <!-- criar máscara -->
      <span display="none" class="help-inline"></span>
    </div>
  </div>
  
  <br>
  
  <div class="control-group">
    <div class="controls">
    	<a class="btn btn-inverse" href="">Voltar</a>
      <button type="submit" class="btn btn-success">Salvar</button> 
    </div>
  </div>
</form>