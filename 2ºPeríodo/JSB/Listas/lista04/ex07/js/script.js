user = { info : []};

campoUsername=document.getElementById("campoUsername");
campoSenha=document.getElementById("campoSenha");

document.getElementById("btnCadastrar").addEventListener("click", cadastrarUsuario);

function cadastrarUsuario(){
    usr={usuario:campoUsername.value.trim(),senha:campoSenha.value.trim()};
    user.info[user.info.length]=usr;
    localStorage.setItem("usuarios",JSON.stringify(user));
}