<%@ include file="../_header.jsp" %>

<jsp:useBean id="product"
             type="model.ProductBean"
             scope="request" />

<h1>Visualizar <jsp:getProperty name="product"
                 property="name" /></h1>

<div class="form-horizontal">
  <div class="control-group">
    <label class="control-label">Nome</label>
    <div class="controls">
      <span class="value"><jsp:getProperty name="product"
                 property="name" /></span>
    </div>
  </div>

  <div class="control-group">
    <label class="control-label">Preço</label>
    <div class="controls">
      <span class="value">R$ <jsp:getProperty name="product"
                 property="price" /></span>
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label">Quantidade</label>
    <div class="controls">
      <span class="value"><jsp:getProperty name="product"
                 property="qnt" /></span>
    </div>
  </div>

  <br>
  
  <div class="control-group">
    <div class="controls">
    	<a class="btn btn-inverse" href="ViewProductsServlet">Voltar</a>
    	<a class="btn btn-success" href="EditProductServlet?product_id=<jsp:getProperty name="product"
                 property="id" />">Editar</a>
    </div>
  </div>
</div>

<%@ include file="../_footer.jsp" %>