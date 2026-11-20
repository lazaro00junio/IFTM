for (let i = 1; i <= 12; i++) {
    document.getElementById('btnValidar' + i).addEventListener('click', function () {
        validar(i)
    })
}

function validar(n) {
    let dataNascimento = document.getElementById("campoDataNasc").value;
    let CPF = document.getElementById("campoCPF").value;
    let matricula = document.getElementById("campoMatricula").value;
    let codDisc1 = document.getElementById("campoCodDisc1").value;
    let codDisc2 = document.getElementById("campoCodDisc2").value;
    let codDisc3 = document.getElementById("campoCodDisc3").value;
    let nomeCampus = document.getElementById("campoNomeCampus").value;
    let telefone1 = document.getElementById("campoTelefone1").value;
    let telefone2 = document.getElementById("campoTelefone2").value;
    let altura = document.getElementById("campoAltura").value;
    let faturamento = document.getElementById("campoFaturamento").value;
    let cronometro = document.getElementById("campoCronometro").value;

    let padraoDataNasc = /^(0[1-9]|[12][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/(\d{2}|\d{4})$/;
    let padraoCPF = /^\d{3}\.\d{3}\.\d{3}-\d{2}$/;
    let padraoMatricula = /^(iftm|IFTM)-\d{3}\/\d{3}-\w{2}$/;
    let padraoCodDisc1 = /^MT-\d{2}\.\d{3}-IFTM$/i;
    let padraoCodDisc2 = /^MT-\d{2}\.\d{3}-[Ii][Ff][Tt][Mm]$/;
    let padraoCodDisc3 = /^M\s?T-\d{2}\.\d{3}-I\s?F\s?T\s?M$/i;
    let padraoNomeCampus = /^IFTM\scampus\sUberlândia(\sCentro)?$/;
    let padraoTelefone1 = /^\+\d{2}\(\d{2}\)\d{5}-\d{4}$/;
    let padraoTelefone2 = /^\(\d{2,3}\)\s?\d{4,5}-\d{4}$/;
    let padraoAltura = /^(1[.,][3-9]|2[.,][0-4]\d?|2[.,]50?)$/;
    let padraoFaturamento = /^R\$\d{1,3}(\.\d{3}){0,3},\d{1,2}$/;
    let padraoCronometro = /^([01][0-9]|2[0-3])(:[0-5][0-9]){2}:([0-9][0-9])$/;

    switch (n) {
        case 1:
            if (padraoDataNasc.test(dataNascimento))
                alert("Data de nascimento válida!");
            else
                alert("Data de nascimento inválida.");
            break;
        case 2:
            if (padraoCPF.test(CPF))
                alert("CPF válido!")
            else
                alert("CPF inválido.")
            break;
        case 3:
            if (padraoMatricula.test(matricula))
                alert("Número de matrícula válido!");
            else
                alert("Número de matrícula inválido!");
            break;
        case 4:
            if (padraoCodDisc1.test(codDisc1))
                alert("Código de disciplina válido!");
            else
                alert("Código de disciplina inválido!");
            break;
        case 5:
            if (padraoCodDisc2.test(codDisc2))
                alert("Código de disciplina válido!");
            else
                alert("Código de disciplina inválido!");
            break;
        case 6:
            if (padraoCodDisc3.test(codDisc3))
                alert("Código de disciplina válido!");
            else
                alert("Código de disciplina inválido!");
            break;
        case 7:
            if (padraoNomeCampus.test(nomeCampus))
                alert("Nome válido!");
            else
                alert("Nome inválido!");
            break;
        case 8:
            if (padraoTelefone1.test(telefone1))
                alert("Telefone válido");
            else
                alert("Telefone inválido");
            break;
        case 9:
            if (padraoTelefone2.test(telefone2))
                alert("Telefone válido");
            else
                alert("Telefone inválido");
            break;
        case 10:
            if(padraoAltura.test(altura))
                alert("Altura válida!");
            else
                alert("Altura inválida");
            break;
        case 11:
            if(padraoFaturamento.test(faturamento))
                alert("Valor válido");
            else
                alert("Valor inválido");
            break;
        case 12:
            if(padraoCronometro.test(cronometro))
                alert("Formato válido");
            else
                alert("Formato inválido");
            break;
    }
}