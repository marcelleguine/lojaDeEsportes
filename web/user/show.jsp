<%@ include file="../_header.jsp" %>

<h1>Visualizar $nome-do-funcionario</h1>

<div class="form-horizontal">
  <div class="control-group">
    <label class="control-label">Nome</label>
    <div class="controls">
      <span class="value">Nome do funcionario</span>
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label">CPF</label>
    <div class="controls">
      <span class="value">CPF do funcionario</span>
    </div>
  </div>
    
   <div class="control-group">
    <label class="control-label">Salário</label>
    <div class="controls">
      <span class="value">Salário do funcionario</span>
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label">Data de nascimento</label>
    <div class="controls">
      <span class="value">Data de nascimento do funcionario</span>
    </div>
  </div>

  <div class="control-group">
    <label class="control-label">E-mail</label>
    <div class="controls">
      <span class="value">E-mail do funcionario</span>
    </div>
  </div>

  <br>

  <div class="control-group">
    <div class="controls">
    	<a class="btn btn-inverse" href="#">Voltar</a>
    	<a class="btn btn-success" href="edit.jsp">Editar</a>
    </div>
  </div>
</div>

<%@ include file="../_footer.jsp" %>