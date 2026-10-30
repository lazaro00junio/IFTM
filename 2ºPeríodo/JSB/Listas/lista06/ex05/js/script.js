let n=parseInt(prompt("Quantos nomes você deseja inserir: "));
let nomes=[];
let pos=0;
for(let i=0;i<n;i++){
    nomes[i]=prompt(`Insira o nome nº${i+1}:`);
}

let intervalo=setInterval(imprimirNome,1000);

function imprimirNome(){
    if(pos==n-1){
        clearInterval(intervalo);
    }
    document.getElementById("nomesCorpo").innerHTML+=`<p>${nomes[pos]}</p> <br>`;
    pos++;
}