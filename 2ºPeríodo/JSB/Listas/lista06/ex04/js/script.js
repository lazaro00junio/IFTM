let tempo=prompt("Digite um número que representará um tempo em segundos: ");
while(isNaN(tempo)){
    tempo=prompt("Digite um número que representará um tempo em segundos: ");
}

setInterval(redirecionar,1000);

function redirecionar(){
    document.getElementById("tempo").innerHTML=tempo;
    tempo--;
    if(tempo==0)
        window.location.href = "https://www.google.com";
}
