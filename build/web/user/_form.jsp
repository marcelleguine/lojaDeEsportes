<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="form-usuario" class="form-horizontal" method="post" action="/lojaDeEsportes/UserServlet">
    <c:if test="${!empty requestScope['user']}" >
    <jsp:useBean id="user"
             type="model.UserBean"
             scope="request" />
    </c:if>
  <div id="usuario-box-login" class="control-group">
    <label class="control-label" for="login-usuario">Login*</label>
    <div class="controls">
      <input type="text" id="login-usuario" name="login-usuario" placeholder="Login" 
             value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="login" /></c:if>">
      <span style="display:none" class="help-inline">Login precisa ter ao menos 3 caracteres</span>
    </div>
  </div>
    
  <div id="usuario-box-password" class="control-group">
    <label class="control-label" for="password-usuario">Senha*</label>
    <div class="controls">
      <input type="password" id="password-usuario" name="password-usuario" placeholder="Senha"
             value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="password" /></c:if>">
      <span style="display:none" class="help-inline">Senha precisa ter ao menos 3 caracteres</span>
    </div>
  </div>
    
  <div id="usuario-box-password-confirm" class="control-group">
    <label class="control-label" for="password-confirm">Confirmação da Senha*</label>
    <div class="controls">
      <input type="password" id="password-confirm" name="password-confirm" placeholder="Confirmação da Senha"
             value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="password" /></c:if>">
      <span style="display:none" class="help-inline">Confirmação da senha precisa ser idêntica a senha.</span>
    </div>
  </div>
    
  <div id="usuario-box-nome" class="control-group">
    <label class="control-label" for="name">Nome*</label>
    <div class="controls">
      <input type="text" id="nome-usuario" name="nome-usuario" placeholder="Nome" 
             value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="name" /></c:if>">
      <span style="display:none" class="help-inline">Nome precisa ter ao menos 3 caracteres</span>
    </div>
  </div>

  <div id="usuario-box-cpf" class="control-group">
    <label class="control-label" for="cpf">CPF*</label>
    <div class="controls">
      <input type="number" id="cpf" name="cpf" placeholder="___ . ___ . ___ - __"
             value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="cpf" /></c:if>"> <!-- criar máscara -->
      <span style="display:none" class="help-inline">CPF inválido</span>
    </div>
  </div>
    
   <div id="usuario-box-salario" class="control-group">
    <label class="control-label" for="salary">Salário*</label>
    <div class="controls">
        <input type="text" id="salario" name="salario" placeholder="R$" 
               value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="salary" /></c:if>"> <!-- criar máscara -->
      <span style="display:none" class="help-inline">Campo obrigatório</span>
    </div>
  </div>
  
  <div id="usuario-box-data" class="control-group">
    <label class="control-label" for="data-nascimento">Data de nascimento</label>
    <div class="controls">
        <input type="date" id="data-nascimento" name="data-nascimento" placeholder="__/__/__" 
               value="<c:if test="${!empty requestScope['user']['date']}" ><jsp:getProperty name="user"
                 property="date" /></c:if>"> <!-- criar máscara -->
      <span style="display:none" class="help-inline">Data inválida</span>
    </div>
  </div>
  
  <div id="usuario-box-email" class="control-group">
    <label class="control-label" for="email">E-mail</label>
    <div class="controls">
        <input type="text" id="email" name="email" placeholder="email@email.com" 
               value="<c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="email" /></c:if>"> <!-- criar máscara -->
      <span style="display:none" class="help-inline">E-mail inválido</span>
    </div>
  </div>
    
    <input id="user_id" name="user_id" type="hidden" 
             value="<c:if test="${empty requestScope['user']}" >0</c:if><c:if test="${!empty requestScope['user']}" ><jsp:getProperty name="user"
                 property="id" /></c:if>" >
  
  <br>
  
  <div class="control-group">
    <div class="controls">
    	<a class="btn btn-inverse" href="/lojaDeEsportes/ViewUsersServlet">Voltar</a>
      <button type="submit" class="btn btn-success">Salvar</button> 
    </div>
  </div>
</form>