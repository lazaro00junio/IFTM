user = { info: [] };

campoUsername = document.getElementById("campoUsername");
campoSenha = document.getElementById("campoSenha");

document.getElementById("btnCadastrar").addEventListener("click", cadastrarUsuario);

function cadastrarUsuario() {
    username = campoUsername.value.trim();
    unico = true;

    for (i = 0; i < user.info.length; i++) {
        if (username == user.info[i].usuario) {
            unico = false;
            break;
        }
    }

    if (unico) {
        usr = { usuario: username, senha: campoSenha.value.trim() };
        user.info[user.info.length] = usr;
        localStorage.setItem("usuarios", JSON.stringify(user));
    } else {
        alert("Usuário já existente.");
    }

}