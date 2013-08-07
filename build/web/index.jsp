<%@ include file="_header.jsp" %>

<h1>Vendas de produtos</h1>
<div class="row-fluid">        
  <div class="span12">
      <form class="form-inline" action="/lojaDeEsportes/SaleServlet">
      <fieldset id="form-sell">
          <select class="input-xlarge" id="prod-name" name="prod-name">
              <option value="-1">- Selecione um produto -</option>
              <c:forEach var="productBean" items="${requestScope['products']}" >
                <option value="<c:out value="${productBean.id}"/>"><c:out value="${productBean.name}"/></option>
              </c:forEach>
          </select>
          <input class="input-small" type="text" id="price" name="price" placeholder="preço unitário"> <!-- criar máscara R$ 00,00 -->
          <select class="input-small" name="quantidade">
            <option>1</option>"
            <option>2</option>
            <option>3</option>
          </select>
          <button type="submit" class="btn btn-success">Realizar Venda</button>
      </fieldset>
    </form>
  </div><!--end span-->
</div>
<div id="table-sell" class="row-fluid">   
  <div class="span12">
    <c:if test="${!empty requestScope['sales']}">
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Nome do Funcionário</th>
          <th>Nome do Produto</th>
          <th>Preço Unitário</th>
          <th>Quantidade</th>
          <th>Preço Total</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="saleBean" items="${requestScope['sales']}" >
            <tr>
              <td><c:out value="${saleBean.userName}"/></td>
              <td><c:out value="${saleBean.productName}"/></td>
              <td>R$ <c:out value="${saleBean.unitPrice}"/></td>
              <td><c:out value="${saleBean.qnt}"/></td>
              <td>R$ <c:out value="${saleBean.totalPrice}"/></td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
    </c:if>
    <c:if test="${empty requestScope['sales']}">
        Não há nenhum venda cadastrada. Cadastre vendas no formulário acima.
    </c:if>
  </div><!--end span-->
</div><!--end row--> 

<%@ include file="_footer.jsp" %>