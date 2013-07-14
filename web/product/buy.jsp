<%@ include file="../_header.jsp" %>

<h1>Comprar produtos</h1>

<form id="form-compra" class="form-horizontal">
    <div class="row">
        <div class="span4">
            <div id="produto-box-nome" class="control-group">
                <label class="control-label" for="nome-produto">Nome</label>
                <div class="controls">
                    <input type="text" id="nome-produto" placeholder="Nome">
                    <span style="display:none" class="help-inline">Nome precisa ter ao menos 2 caracteres</span>
                </div>
            </div>
        </div>

        <div class="span3">
            <div id="produto-box-qtd" class="control-group">
                <label class="control-label" for="quantidade">Quantidade</label>
                <div class="controls">
                    <input type="text" id="quantidade" placeholder="Quantidade">
                    <span style="display:none" class="help-inline">Quantidade inválida</span>
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