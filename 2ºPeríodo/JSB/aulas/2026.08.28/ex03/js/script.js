nota1=document.getElementById("nota1");
nota2=document.getElementById("nota2");
btnResultado=document.getElementById("resultado");


btnResultado.addEventListener("click", mostrarResultado);

function mostrarResultado(){
    if((nota1.value>=0 && nota1.value<=50)&& (nota2.value>=0 
        && nota2.value<=50) && (!isNaN(nota1.value) && !isNaN(nota2.value))){
        total=parseFloat(nota1.value)+parseFloat(nota2.value);
        if(total>=60){    
            alert("Você foi aprovado!");
        }else{
            alert(`Voce foi reprovado, faltaram ${60-total}`);
        }
    }else{  
        alert("Input inválido.");
    }

}