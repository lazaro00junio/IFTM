campoUsername = document.getElementById("campoUsername");
campoSenha = document.getElementById("campoSenha");

document.getElementById("btnCadastrar").addEventListener("click", login);

function login() {
    user = localStorage.getItem("usuarios");
    if (user != null) {
        user = JSON.parse(user);
        username = campoUsername.value.trim();
        senha = campoSenha.value.trim();
        unico = true;

        for (i = 0; i < user.info.length; i++) {
            if (username == user.info[i].usuario && senha == user.info[i].senha) {
                unico = false;
                break;
            }
        }

        if (unico) {
            alert("Usuário inexistente.");
        } else {
            alert("Usuário já existente.");
        }
    } else {
        alert("Não há usuários cadastrados!");
    }
}