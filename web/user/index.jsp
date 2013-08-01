<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp" %>

<h1>Visualizar funcionários</h1>
<div id="table-sell" class="row-fluid">   
  <div class="span12">
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Nome</th>
          <th>CPF</th>
          <th>Salário</th>
          <th>Dada de nascimento</th>
          <th>E-mail</th>
          <th>Opções</th>
        </tr>
      </thead>
      <tbody>
          <c:forEach var="user" items="${requestScope['users']}">
            <tr>
              <td><c:out value="${user.name}"/></td>
              <td><c:out value="${user.cpf}"/></td>
              <td>R$ <c:out value="${user.salary}"/></td>
              <td><c:out value="${user.date}"/></td>
              <td><c:out value="${user.email}"/></td>
              <td>
                <a class="btn btn-info" href="user/show.jsp"><i class="icon-eye-open icon-white"></i></a>
                <a class="btn btn-warning" href="user/edit.jsp"><i class="icon-pencil icon-white"></i></a>
                <a class="btn btn-danger" href="DeleteUserServlet?user_id=<c:out value="${user.id}"/>"><i class="icon-trash icon-white"></i></a>
              </td>
            </tr>
          </c:forEach>
      </tbody>
    </table>
  </div><!--end span-->
</div><!--end row-->

<%@ include file="../_footer.jsp" %>