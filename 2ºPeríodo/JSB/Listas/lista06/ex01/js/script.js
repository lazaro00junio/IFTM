document.getElementById("btnTransferir").addEventListener("click", function(){
    intervalo=setInterval(trasferirTexto,2000);
});

function trasferirTexto(){
    if(document.getElementById("txtTexto").value!=""){
        document.getElementById("txtDestino").value=document.getElementById("txtTexto").value;
        document.getElementById("txtTexto").value=null;
    }else{
        alert("O campo não pode estar vazio!")
    }
    clearInterval(intervalo);
}