// localStorage.setItem("usuario","mister");
// localStorage.setItem("senha","1234567");

usuario = document.getElementById("txtUsuario");
senha = document.getElementById("txtSenha");
btnCadastrar = document.getElementById("btnCadastrar");

btnCadastrar.addEventListener("click",salvarUsuario);

function salvarUsuario(){
    localStorage.setItem("usuario",usuario.value);
    localStorage.setItem("senha",senha.value);
}