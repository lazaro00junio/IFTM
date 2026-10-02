c = 0;
username = document.getElementById("username");
usuario = document.getElementById("usuario");
btnEntrar = document.getElementById("btnEntrar");
btnInciar = document.getElementById("btnIniciar");
gato01 = document.getElementById("gato01");
gato02 = document.getElementById("gato02");
gato03 = document.getElementById("gato03");
gato04 = document.getElementById("gato04");
gato05 = document.getElementById("gato05");


if (btnEntrar) {
    btnEntrar.addEventListener("click", verificarUsr);
}

if (usuario) {
    usuario.innerHTML = localStorage.getItem("username");
}

if (btnInciar) {
    btnInciar.addEventListener("click", function () { window.location.href = "../felino.html" });
}

if (gato01) {
    gato01.addEventListener("click", function () { gatos(1) });
    gato02.addEventListener("click", function () { gatos(2) });
    gato03.addEventListener("mouseover", function () { gatos(3) });
    gato03.addEventListener("mouseout", function () { gatos(3.5) });
    gato04.addEventListener("mousemove", function () { gatos(4) });
    gato04.addEventListener("mouseout", function () { gatos(4.5) });
    gato05.addEventListener();
}

function verificarUsr() {
    usr = username.value.trim().split(' ')
    if (usr.length >= 2) {
        window.location.href = "../menu.html";
        localStorage.setItem("username", username.value.trim());
    } else {
        alert("Digite o seu nome completo!");
    }
}

function gatos(g) {
    switch (g) {
        case 1:
            usernameVet = localStorage.getItem("username").split(' ');
            alert(`Oi ${usernameVet[0]}, tudo bem com você?`);
            break;
        case 2:
            document.getElementById("contador").innerHTML = c++;
            break;
        case 3:
            gato03.src = '../img/gato06.gif';
            break;
        case 3.5:
            gato03.src = '../img/gato03.gif';
            break;
        case 4:
            msgGato04.innerHTML = "Ai, pare de fazer cócegas!";
            break;
        case 4.5:
            msgGato04.innerHTML = "lá lá lá...";
            break;

    }

}

