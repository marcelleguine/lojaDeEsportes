<%@ include file="../_header.jsp" %>

<h1>Comprar produtos</h1>

<form id="form-compra" class="form-horizontal" action="/lojaDeEsportes/PurchaseServlet">
    <div id="produto-box-nome" class="control-group">
        <label class="control-label" for="nome-produto">Nome*</label>
        <div class="controls">
            <select id="nome-produto" name="nome-produto">
                <option value="-1">- Selecione um produto -</option>
                <c:forEach var="productBean" items="${requestScope['products']}" >
                    <option value="<c:out value="${productBean.id}"/>"><c:out value="${productBean.name}"/></option>
                </c:forEach>
            </select>
            <span style="display:none" class="help-inline">Nome precisa ter ao menos 2 caracteres</span>
        </div>
    </div>

    <div id="produto-box-qtd" class="control-group">
        <label class="control-label" for="quantidade">Quantidade*</label>
        <div class="controls">
            <input type="text" id="quantidade" name="quantidade" placeholder="Quantidade">
            <span style="display:none" class="help-inline">Campo obrigatório</span>
        </div>
    </div>

    <br>

    <div class="control-group">
        <div class="controls">
            <a class="btn btn-inverse" href="/lojaDeEsportes/ViewPurchasesServlet">Voltar</a>
            <button type="submit" class="btn btn-success">Realizar pedido</button> 
        </div>
    </div>
</form>

<%@ include file="../_footer.jsp" %>