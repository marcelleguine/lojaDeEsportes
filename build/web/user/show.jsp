<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp" %>

<jsp:useBean id="user"
             type="model.UserBean"
             scope="request" />

<h1>Visualizar <jsp:getProperty name="user"
                 property="name" /></h1>

<div class="form-horizontal">
  <div class="control-group">
    <label class="control-label">Nome</label>
    <div class="controls">
      <span class="value"><jsp:getProperty name="user"
                 property="name" /></span>
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label">CPF</label>
    <div class="controls">
      <span class="value"><jsp:getProperty name="user"
                 property="cpf" /></span>
    </div>
  </div>
    
   <div class="control-group">
    <label class="control-label">Salário</label>
    <div class="controls">
      <span class="value">R$ <jsp:getProperty name="user"
                 property="salary" /></span>
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label">Data de nascimento</label>
    <div class="controls">
        <span class="value"><c:if test="${!empty requestScope['user']['date']}"><jsp:getProperty name="user"
                 property="date" /></c:if></span>
    </div>
  </div>

  <div class="control-group">
    <label class="control-label">E-mail</label>
    <div class="controls">
      <span class="value"><jsp:getProperty name="user"
                 property="email" /></span>
    </div>
  </div>

  <br>

  <div class="control-group">
    <div class="controls">
    	<a class="btn btn-inverse" href="/lojaDeEsportes/ViewUsersServlet">Voltar</a>
    	<a class="btn btn-success" href="/lojaDeEsportes/EditUserServlet?user_id=<jsp:getProperty name="user"
                 property="id" />">Editar</a>
    </div>
  </div>
</div>

<%@ include file="../_footer.jsp" %>