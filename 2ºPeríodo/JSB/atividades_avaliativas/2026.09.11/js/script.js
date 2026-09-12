campoPrimeiroNome = document.getElementById("primeiro-nome");
campoSobrenome = document.getElementById("sobrenome");
campoCargo = document.getElementById("cargo");

// CampoNomeCracha=document.getElementById("nome-cracha");
// CampoIniciais=document.getElementById("iniciais");

document.getElementById("HTML5").addEventListener("click", function () { preencherCracha(1) });
document.getElementById("CSS3").addEventListener("click", function () { preencherCracha(2) });
document.getElementById("JS").addEventListener("click", function () { preencherCracha(3) });

function preencherCracha(n) {
    primeiroNome = campoPrimeiroNome.value.trim().toUpperCase();
    sobrenome = campoSobrenome.value.trim().toUpperCase();
    sobrenomeVet = sobrenome.split(" ");
    cargoValor = campoCargo.value.trim().toLowerCase();


    if(primeiroNome!="" && sobrenome!="" && (cargoValor=="professor" || cargoValor=="desenvolvedor")){
        document.getElementById("nome-cracha").innerHTML = primeiroNome + " " + sobrenome;

        document.getElementById("iniciais").innerHTML = primeiroNome[0];

        for (i = 0; i < sobrenomeVet.length; i++) {
            document.getElementById("iniciais").innerHTML += sobrenomeVet[i].charAt(0);
        }

        if (n == 1) {
            document.getElementById("minicurso-cracha").innerHTML = "<img src=\"img/logoHTML.webp\">";
        } else if (n == 2) {
            document.getElementById("minicurso-cracha").innerHTML = "<img src=\"img/logoCSS.webp\">";
        } else {
            document.getElementById("minicurso-cracha").innerHTML = "<img src=\"img/logoJS.webp\">";
        }

        if (cargoValor == "professor") {
            document.getElementById("cargoCracha").innerHTML = "<p style=\"color:green;font-weight:bold\">Professor</p>";
        } else if (cargoValor == "desenvolvedor") {
            document.getElementById("cargoCracha").innerHTML = "<p style=\"color:red;font-weight:bold\">Desenvolvedor</p>";
        }

        nSala = parseInt(Math.random() * 10);

        while (nSala == 0) {
            nSala = parseInt(Math.random() * 10);
        }

        document.getElementById("sala").innerHTML = `<p>Sala: ${nSala}</p>`;
    }else{
        alert("Os dados não foram preenchidos devidamente.");
    }
}