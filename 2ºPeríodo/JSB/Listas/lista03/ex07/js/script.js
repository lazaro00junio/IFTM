loginCampo = document.getElementById("login");
senhaCampo = document.getElementById("senha");
confirmarSenhaCampo = document.getElementById("confirmarSenha");

document.getElementById("entrar").addEventListener("click", autentificar);
document.getElementById("limpar").addEventListener("click", limpar);

function autentificar() {
    login = loginCampo.value.trim();
    senha = senhaCampo.value.trim();
    confirmarSenha = confirmarSenhaCampo.value.trim();
    if (login != "") {
        if (senha == "" && confirmarSenha == "") {
            alert("Nenhum dos campos de senha podem estar vazios.");
        } else if (senha == "") {
            alert("O campo \"Senha\" não pode estar vazio!");
        } else if (confirmarSenha == "") {
            alert("O campo \"Confirmar Senha\" não pode estar vazio!");
        } else if (senha != confirmarSenha) {
            alert("As senhas não são iguais");
            senhaCampo.value = "";
            confirmarSenhaCampo.value = "";
        } else {
            alert("Login efetuado com sucesso! Agora é só esperar o nosso time desenvolver a próxima página.");
        }
    } else {
        alert("O campo \"Login\" não pode estar vazio.");
    }
}

function limpar() {
    loginCampo.value = "";
    senhaCampo.value = "";
    confirmarSenhaCampo.value = "";
}