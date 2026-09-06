btn=document.getElementById("btnDobrar");
valor=document.getElementById("txtValor");
resultado=document.getElementById("txtResultado");


btn.addEventListener("click",calcularDobro);

function calcularDobro(){
    if(valor.value.trim()!="" && !isNaN(valor.value)){
        resultado.value=valor.value*2;
    
    }else{
        alert("Entrada inválida.");
    }
}