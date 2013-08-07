<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<form id="form-produto" class="form-horizontal" method="post" action="/lojaDeEsportes/ProductServlet">
    <c:if test="${!empty requestScope['product']}" >
    <jsp:useBean id="product"
             type="model.ProductBean"
             scope="request" />
    </c:if>
  <div id="produto-box-nome" class="control-group">
    <label class="control-label" for="name">Nome*</label>
    <div class="controls">
        <input type="text" id="nome-produto" name="nome-produto" placeholder="Nome" 
               value="<c:if test="${!empty requestScope['product']}" ><jsp:getProperty name="product"
                 property="name" /></c:if>">
      <span style="display:none" class="help-inline">Nome precisa ter ao menos 2 caracteres</span>
    </div>
  </div>

  <div id="produto-box-preco" class="control-group">
    <label class="control-label" for="preco">Preço*</label>
    <div class="controls">
      <input type="text" id="preco" name="preco" placeholder="Preço" 
             value="<c:if test="${!empty requestScope['product']}" ><jsp:getProperty name="product"
                 property="price" /></c:if>">
      <span style="display:none" class="help-inline">Campo obrigatório</span>
    </div>
  </div>
      
      <input id="product_id" name="product_id" type="hidden" 
             value="<c:if test="${empty requestScope['product']}" >0</c:if><c:if test="${!empty requestScope['product']}" ><jsp:getProperty name="product"
                 property="id" /></c:if>" >

  <br>
  
  <div class="control-group">
    <div class="controls">
      <a class="btn btn-inverse" href="/lojaDeEsportes/ViewProductsServlet">Voltar</a>
      <button type="submit" class="btn btn-success">Salvar</button> 
    </div>
  </div>
</form>