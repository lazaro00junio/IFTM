btn=document.getElementById("btnDobrar");
valor=document.getElementById("txtValor");
resultado=document.getElementById("txtResultado");


btn.addEventListener("click",calcularDobro);

function calcularDobro(){
    resultado.value=valor.value*2;
}