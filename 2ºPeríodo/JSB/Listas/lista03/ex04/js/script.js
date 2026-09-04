notaCampo1=document.getElementById("nota1");
notaCampo2=document.getElementById("nota2");
btnResultado=document.getElementById("resultado");


btnResultado.addEventListener("click", mostrarResultado);

function mostrarResultado(){
    nota1=notaCampo1.value.trim();
    nota2=notaCampo2.value.trim();
    if((!isNaN(nota1) && !isNaN(nota2)) && (nota1>=0 && nota1<=50)&& (nota2>=0 
        && nota2<=50) && (nota1!="" && nota2!="")){
        total=parseFloat(nota1)+parseFloat(nota2);
        if(total>=60){    
            alert("Você foi aprovado!");
        }else{
            alert(`Voce foi reprovado, faltaram ${60-total} pontos`);
        }
    }else{  
        alert("Input inválido.");
    }

}