<%@ include file="_header.jsp" %>

<h1>Relat�rio de compras</h1>
<div id="table-sell" class="row-fluid">   
  <div class="span12">
      <c:if test="${!empty requestScope['purchases']}">
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Nome do Funcion�rio</th>
          <th>Nome do Produto</th>
          <th>Quantidade</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="purchaseBean" items="${requestScope['purchases']}" >
        <tr>
          <td><c:out value="${purchaseBean.userName}"/></td>
          <td><c:out value="${purchaseBean.productName}"/></td>
          <td><c:out value="${purchaseBean.qnt}"/></td>
        </tr>
        </c:forEach>
      </tbody>
    </table>
    </c:if>
      <c:if test="${empty requestScope['purchases']}">
          N�o h� nenhuma compra cadastrada. Cadastre compras pelo menu de produtos.
      </c:if>
  </div><!--end span-->
</div><!--end row--> 

<%@ include file="_footer.jsp" %>