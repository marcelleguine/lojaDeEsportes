<%@ include file="../_header.jsp" %>

<h1>Comprar produtos</h1>

<form class="form-horizontal">
	<div class="row">
		<div class="span4">
			<div class="control-group">
		    <label class="control-label" for="name">Nome</label>
		    <div class="controls">
		      <input type="text" id="name" placeholder="Nome" required>
		    </div>
		  </div>
		</div>

		<div class="span3">
			<div class="control-group">
		    <label class="control-label" for="number">Quantidade</label>
		    <div class="controls">
		      <input type="text" id="number" placeholder="Quantidade" required>
		    </div>
		  </div>
		</div>

		<div class="span4">
			<div class="control-group">
		    <div class="controls">
		      <a class="btn" href="">Adicionar novo produto</a>
		    </div>
		  </div>
		</div>
	</div>
  
  <br>

  <div class="control-group">
    <div class="controls">
      <a class="btn btn-inverse" href="">Voltar</a>
      <button type="submit" class="btn btn-success">Realizar pedido</button> 
    </div>
  </div>
</form>

<%@ include file="../_footer.jsp" %>