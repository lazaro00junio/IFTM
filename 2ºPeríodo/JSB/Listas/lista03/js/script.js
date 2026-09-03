nome=document.getElementById("nome");
exibir=document.getElementById("exibir");

exibir.addEventListener("click",aletar);

function alertar(){
    alert(nome.value);
}