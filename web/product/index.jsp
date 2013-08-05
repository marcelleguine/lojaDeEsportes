<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp" %>

<h1>Visualizar produtos</h1>
<div id="table-sell" class="row-fluid">   
    <div class="span12">
                       
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Nome</th>
          <th>Preço</th>
          <th>Quantidade</th>
          <th>Opções</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="productBean" items="${requestScope['products']}" >
            <tr>
                <td><c:out value="${productBean.name}"/></td>
              <td>R$ <c:out value="${productBean.price}"/></td>
              <td><c:out value="${productBean.qnt}"/></td>
              <td>
                <a class="btn btn-info" href="ShowProductServlet?product_id=<c:out value="${productBean.id}"/>"><i class="icon-eye-open icon-white"></i></a>
                <a class="btn btn-warning" href="EditProductServlet?product_id=<c:out value="${productBean.id}"/>"><i class="icon-pencil icon-white"></i></a>
                <a class="btn btn-danger" href="DeleteProductServlet?product_id=<c:out value="${productBean.id}"/>"><i class="icon-trash icon-white"></i></a>
              </td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
  </div><!--end span-->
</div><!--end row-->

<%@ include file="../_footer.jsp" %>