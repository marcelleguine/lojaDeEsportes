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
        <tr>
          <td>José Bento da Silva</td>
          <td>883.914.814-09</td>
          <td>R$ 2.200,00</td>
          <td>jose@email.com</td>
          <td>18/03/1987</td>
          <td>
            <a class="btn btn-info" href="show.jsp"><i class="icon-eye-open icon-white"></i></a>
            <a class="btn btn-warning" href="edit.jsp"><i class="icon-pencil icon-white"></i></a>
            <a class="btn btn-danger" href="#"><i class="icon-trash icon-white"></i></a>
          </td>
        </tr>
        <tr>
          <td>Juliana Bergler Júnior</td>
          <td>511.368.096-60</td>
          <td>R$ 1.350,00</td>
          <td>juliana@email.com</td>
          <td>04/10/1983</td>
          <td>
            <a class="btn btn-info" href="show.jsp"><i class="icon-eye-open icon-white"></i></a>
            <a class="btn btn-warning" href="edit.jsp"><i class="icon-pencil icon-white"></i></a>
            <a class="btn btn-danger" href="#"><i class="icon-trash icon-white"></i></a>
          </td>
        </tr>
        <tr>
          <td>Rafaela Bittencourt</td>
          <td>291.847.481-92</td>
          <td>R$ 5.000,00</td>
          <td>rafaela@email.com</td>
          <td>23/06/1977</td>
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