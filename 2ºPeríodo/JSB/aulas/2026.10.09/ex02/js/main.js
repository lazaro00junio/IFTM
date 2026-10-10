import calc from "./calculadora.js";

    let val1=parseFloat(document.getElementById("txtValor1").value);
    let val2=parseFloat(document.getElementById("txtValor2").value);
    let txtResultado=document.getElementById("txtResultado");


document.getElementById("btnSomar").addEventListener("clcik", function(){
    txtResultado.value=calc.somar(val1,val2);
})

document.getElementById("btnSubtrair").addEventListener("clcik", function(){
    txtResultado.value=calc.subtrair(val1,val2);
})

document.getElementById("btnDividir").addEventListener("clcik", function(){
    txtResultado.value=calc.dividir(val1,val2);
})

document.getElementById("btnMultiplicar").addEventListener("clcik", function(){
    txtResultado.value=calc.multiplicar(val1, val2);
})