<form id="form-produto" class="form-horizontal" method="post" action="/lojaDeEsportes/ProductServlet">
  <div id="produto-box-nome" class="control-group">
    <label class="control-label" for="name">Nome*</label>
    <div class="controls">
      <input type="text" id="nome-produto" name="nome-produto" placeholder="Nome">
      <span style="display:none" class="help-inline">Nome precisa ter ao menos 2 caracteres</span>
    </div>
  </div>

  <div id="produto-box-preco" class="control-group">
    <label class="control-label" for="preco">Preço*</label>
    <div class="controls">
      <input type="text" id="preco" name="preco" placeholder="Preço">
      <span style="display:none" class="help-inline">Campo obrigatório</span>
    </div>
  </div>
  
  <div id="produto-box-qtd" class="control-group">
    <label class="control-label" for="quantidade">Quantidade*</label>
    <div class="controls">
      <input type="text" id="quantidade" name="quantidade" placeholder="Quantidade">
      <span style="display:none" class="help-inline">Campo obrigatório</span>
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