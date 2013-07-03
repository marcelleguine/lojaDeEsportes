<form class="form-horizontal">
  <div class="control-group">
    <label class="control-label" for="name">Nome</label>
    <div class="controls">
      <input type="text" id="name" placeholder="Nome" required>
    </div>
  </div>

  <div class="control-group">
    <label class="control-label" for="cpf">CPF</label>
    <div class="controls">
      <input type="number" id="cpf" placeholder="___ . ___ . ___ - __" required> <!-- criar máscara -->
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label" for="data-nascimento">Data de nascimento</label>
    <div class="controls">
      <input type="date" id="data-nascimento" placeholder="__/__/__"> <!-- criar máscara -->
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label" for="email">E-mail</label>
    <div class="controls">
      <input type="email" id="email" placeholder="email@email.com"> <!-- criar máscara -->
    </div>
  </div>

  <div class="control-group">
    <label class="control-label" for="salary">Salário</label>
    <div class="controls">
      <input type="text" id="salary" placeholder="R$" required> <!-- criar máscara -->
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