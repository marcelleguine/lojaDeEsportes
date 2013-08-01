!function($) {

    $('#form-usuario').on('submit', function() {
        return !!(
            validarNome() *
            validarCpf() *
            validarData() *
            validarEmail() *
            validarSalario()
        );
    });
    
    function validarNome() {
        if ($('#nome-usuario').val().length < 3) {
            $('#usuario-box-nome').addClass("error");
            $('#usuario-box-nome .help-inline').show();
            return false;
        }
        else {
            $('#usuario-box-nome').removeClass("error");
            $('#usuario-box-nome .help-inline').hide();
            return true;
        }
    }
    
    function validarCpf() {
        var cpf = $('#cpf').val().replace(/[^\d]+/g,'');
        var valido = false;
 
        var digitosString = cpf.replace(/[^0-9]/g, '');
        var digitos;
        var a,b,c,d,e,f,g,h,i,j,k;
        var dv1, dv2;
        var soma, resto;
        if (digitosString.length == 11 &&
                !(cpf == "00000000000" || 
                cpf == "11111111111" || 
                cpf == "22222222222" || 
                cpf == "33333333333" || 
                cpf == "44444444444" || 
                cpf == "55555555555" || 
                cpf == "66666666666" || 
                cpf == "77777777777" || 
                cpf == "88888888888" || 
                cpf == "99999999999")) {
                
            digitos = digitosString.split('');
            a = parseInt(digitos[ 0 ]);
            b = parseInt(digitos[ 1 ]);
            c = parseInt(digitos[ 2 ]);
            d = parseInt(digitos[ 3 ]);
            e = parseInt(digitos[ 4 ]);
            f = parseInt(digitos[ 5 ]);
            g = parseInt(digitos[ 6 ]);
            h = parseInt(digitos[ 7 ]);
            i = parseInt(digitos[ 8 ]);
            j = parseInt(digitos[ 9 ]);
            k = parseInt(digitos[ 10 ]);
            soma = a*10 + b*9 + c*8 + d*7 + e*6 + f*5 + g*4 + h*3 + i*2;
            resto = soma % 11;
            dv1 = (11 - resto < 10 ? 11 - resto : 0);
            soma = a*11 + b*10 + c*9 + d*8 + e*7 + f*6 + g*5 + h*4 + i*3 + dv1*2;
            resto = soma % 11;
            dv2 = (11 - resto < 10 ? 11 - resto : 0);
            valido = dv1 == j && dv2 == k;
        }
        
        if (!valido){
            $('#usuario-box-cpf').addClass("error");
            $('#usuario-box-cpf .help-inline').show();
        }
            
        else{
            $('#usuario-box-cpf').removeClass("error");
            $('#usuario-box-cpf .help-inline').hide();
        }
            

        return valido;
    }
    
    function validarSalario() {
        if (!$.isNumeric($('#salario').val())) {
            $('#usuario-box-salario').addClass("error");
            $('#usuario-box-salario .help-inline').show();
            return false;
        }
        else {
            $('#usuario-box-salario').removeClass("error");
            $('#usuario-box-salario .help-inline').hide();
            return true;
        }
    }
    
    function validarData() {
        var valido = true;
        var data = $('#data-nascimento').val();
        if(data == '')
            return valido = true;

        var padraoData = /^\d{4}-((0\d)|(1[012]))-(([012]\d)|3[01])$/; 
        var dtArray = data.match(padraoData); // is format OK?

        if (dtArray == null)
           valido = false;
        else {
            var dtDia = dtArray[5];
            var dtMes = dtArray[3];
            var dtAno = dtArray[1];

            if (dtMes < 1 || dtMes > 12)
                valido = false;
            else if (dtDia < 1 || dtDia > 31)
                valido = false;
            else if ((dtMes == 4 || dtMes == 6 || dtMes == 9 || dtMes == 11) && dtDia == 31)
                valido = false;
            else if (dtMes == 2) {
               var bissexto = (dtAno % 4 == 0 && (dtAno % 100 != 0 || dtAno % 400 == 0));
               if (dtDia > 29 || (dtDia == 29 && !bissexto))
                    valido = false;
            }
        }
        
        if (!valido){
            $('#usuario-box-data').addClass("error");
            $('#usuario-box-data .help-inline').show();
        }
            
        else{
            $('#usuario-box-data').removeClass("error");
            $('#usuario-box-data .help-inline').hide();
        }
            
        
        return valido;
      }
      
      function validarEmail() {
          var email = $('#email').val();
          var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
          
          if (!emailReg.test(email)) {
              $('#usuario-box-email').addClass("error");
              $('#usuario-box-email .help-inline').show();
              return false;
          }
          else {
              $('#usuario-box-email').removeClass("error");
              $('#usuario-box-email .help-inline').hide();
              return true;
          }
      }

}(window.jQuery);