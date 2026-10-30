let nomeCompleto=prompt("Insira o seu nome completo: ");
let tamanhoFonte=14;
let intervalo=setInterval(imprimirNome,500);
    
    
function imprimirNome(){
    document.getElementById("nomeCorpo").innerHTML = `<p style="font-size: ${tamanhoFonte}px">${nomeCompleto}</p>`;
    tamanhoFonte=tamanhoFonte+2;
    if(tamanhoFonte>40){
        clearInterval(intervalo);
    }
}