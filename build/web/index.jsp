<%@ include file="_header.jsp" %>

<h1>Venda de produtos</h1>
<div class="row-fluid">        
  <div class="span12">
    <form class="form-inline">
      <fieldset id="form-sell">
          <input class="input-xlarge" type="text" id="nome" placeholder="nome do produto"> <!-- fazer autocomplete -->
          <input class="input-small" type="text" id="price" placeholder="preço unitário"> <!-- criar máscara R$ 00,00 -->
          <select class="input-small">
            <option>1</option>"
            <option>2</option>
            <option>3</option>
          </select>
          <button type="button" class="btn btn-inverse">Adicionar produto</button>
      </fieldset>
    </form>
  </div><!--end span-->
</div>
<div id="table-sell" class="row-fluid">   
  <div class="span12">
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Nome</th>
          <th>Quantidade</th>
          <th>Preço unitário</th>
          <th>Preço total</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Camisa Nike CBF Home s/nº 2013 - Masculina</td>
          <td>R$199,90</td>
          <td>2</td>
          <td>R$399,80</td>
        </tr>
        <tr>
          <td>Camisa Nike CBF Home 2013 - Feminina</td>
          <td>R$179,00</td>
          <td>1</td>
          <td>R$179,00</td>
        </tr>
        <tr>
          <td>Bermuda Oxer Medley - Masculino</td>
          <td>R$59,90</td>
          <td>3</td>
          <td>R$179,70</td>
        </tr>
      </tbody>
    </table>
    <span id="total">Total: R$758,50</span>
    <button id="btn-end-sell" type="button" class="btn btn-success">Finalizar venda</button>
  </div><!--end span-->
</div><!--end row--> 

<%@ include file="_footer.jsp" %>