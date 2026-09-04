nomeCampo=document.getElementById("nome");
exibir=document.getElementById("exibir");

exibir.addEventListener("click",alertar);


function alertar(){
    nome=nomeCampo.value.trim();
    if(nome!= null && nome!="")
        alert(nome);
    else 
        alert("Nome inválido, my brother.");
}