campoUsername=document.getElementById("campoUsername");
campoSenha=document.getElementById("campoSenha");

document.getElementById("btnCadastrar").addEventListener("click",cadastrarUsuario);

function cadastrarUsuario(){
    usuario = { info : {nome:campoUsername.value.trim(),senha:campoSenha.value.trim()}};
    localStorage.setItem("usuarios",JSON.stringify(usuario));
}


