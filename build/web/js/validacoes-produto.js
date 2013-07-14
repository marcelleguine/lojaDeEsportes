!function($) {

    $('#form-produto').on('submit', function() {
        return !!(
            validarNome() *
            validarPreco() *
            validarQtd()
        );
    });
    
    $('#form-compra').on('submit', function() {
        return !!(
            validarNome() *
            validarQtd()
        );
    });
    
    function validarNome() {
        if ($('#nome-produto').val().length < 2) {
            $('#produto-box-nome .help-inline').show();
            return false;
        }
        else {
            $('#produto-box-nome .help-inline').hide();
            return true;
        }
    }
      
    function validarPreco() {
        if (!$.isNumeric($('#preco').val())) {
            $('#produto-box-preco .help-inline').show();
            return false;
        }
        else {
            $('#produto-box-preco .help-inline').hide();
            return true;
        }
    }
    
    function validarQtd() {
        if (!$.isNumeric($('#quantidade').val())) {
            $('#produto-box-qtd .help-inline').show();
            return false;
        }
        else {
            $('#produto-box-qtd .help-inline').hide();
            return true;
        }
    }

}(window.jQuery);