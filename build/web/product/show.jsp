<%@ include file="../_header.jsp" %>

<h1>Visualizar $nome-do-prodto</h1>

<div class="form-horizontal">
  <div class="control-group">
    <label class="control-label">Nome</label>
    <div class="controls">
      <span class="value">Nome do produto</span>
    </div>
  </div>

  <div class="control-group">
    <label class="control-label">Preço</label>
    <div class="controls">
      <span class="value">Preço do produto</span>
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label">Quantidade</label>
    <div class="controls">
      <span class="value">Quantidade do produto</span>
    </div>
  </div>

  <br>
  
  <div class="control-group">
    <div class="controls">
    	<a class="btn btn-inverse" href="index.jsp">Voltar</a>
    	<a class="btn btn-success" href="edit.jsp">Editar</a>
    </div>
  </div>
</div>

<%@ include file="../_footer.jsp" %>