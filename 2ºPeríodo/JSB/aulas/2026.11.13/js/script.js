document.getElementById("btnValidar").addEventListener("click", function () {
    validar();
});

function validar(){
    //padrao valida se há pelo um número em qualquer lugar do texto
    //let padrao = /\d/;

    //padrao valida se há pelo um número no início do texto
    //let padrao = /^\d/;

    //padrao valida se há pelo um número no FINAL do texto
    //let padrao = /\d$/;
    
    //padrão para validar CPF
    let padrao = /^\d{3}\.\d{3}\.\d{3}-\d{2}$/;

    //let padrao = /^(IFTM|IF)-\d{3}$/i;

    //padrao para validar telefone
    //let padrao = /^\(\d{2,3}\)\s\d{4,5}-\d{4}$/;

    //let padrao = /^\d{1,}((\+|-|\*|\/)\d{1,}){1,}$/;

    //simbolos especiais
    //let padrao = /^\W{2,5}$/;

    //alfanumericos
    //let padrao = /^\w{2,5}$/;

    //let padrao = /^\d?$/; // /^\d{0,1}$/

    //let padrao = /^\d*$/; // /^\d{0,}$/



    let texto = document.getElementById("texto").value;
    if (padrao.test(texto))
        alert("Válido!");
    else
        alert("Inválido");
}
