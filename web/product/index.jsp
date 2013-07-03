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
        <tr>
          <td>Camisa Nike CBF Home s/nº 2013 - Masculina</td>
          <td>R$199,90</td>
          <td>120</td>
          <td>
            <a class="btn btn-info" href="show.jsp"><i class="icon-eye-open icon-white"></i></a>
            <a class="btn btn-warning" href="edit.jsp"><i class="icon-pencil icon-white"></i></a>
            <a class="btn btn-danger" href="#"><i class="icon-trash icon-white"></i></a>
          </td>
        </tr>
        <tr>
          <td>Camisa Nike CBF Home 2013 - Feminina</td>
          <td>R$179,00</td>
          <td>50</td>
          <td>
            <a class="btn btn-info" href="show.jsp"><i class="icon-eye-open icon-white"></i></a>
            <a class="btn btn-warning" href="edit.jsp"><i class="icon-pencil icon-white"></i></a>
            <a class="btn btn-danger" href="#"><i class="icon-trash icon-white"></i></a>
          </td>
        </tr>
        <tr>
          <td>Bermuda Oxer Medley - Masculino</td>
          <td>R$59,90</td>
          <td>304</td>
          <td>
            <a class="btn btn-info" href="show.jsp"><i class="icon-eye-open icon-white"></i></a>
            <a class="btn btn-warning" href="edit.jsp"><i class="icon-pencil icon-white"></i></a>
            <a class="btn btn-danger" href="#"><i class="icon-trash icon-white"></i></a>
          </td>
        </tr>
      </tbody>
    </table>
  </div><!--end span-->
</div><!--end row-->

<%@ include file="../_footer.jsp" %>