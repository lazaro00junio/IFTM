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

    let padraoDataNasc = /^(0[1-9]|[12][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/(\d{2}|\d{4})$/;
    let padraoCPF = /^\d{3}\.\d{3}\.\d{3}-\d{2}$/;
    let padraoMatricula = /^(iftm|IFTM)-\d{3}\/\d{3}-\w{2}$/;
    let padraoCodDisc1 = /^MT-\d{2}\.\d{3}-IFTM$/i;
    let padraoCodDisc2 = /^MT-\d{2}\.\d{3}-[Ii][Ff][Tt][Mm]$/;
    let padraoCodDisc3 = /^M\s?T-\d{2}\.\d{3}-I\s?F\s?T\s?M$/i;

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
    }
}