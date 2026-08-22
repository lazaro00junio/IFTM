texto=prompt("Insira um texto").trim(" ");
palidromo=false;
for(i=0;i<texto.length;i++){
    if(texto[i]==texto[(texto.length-1)-i]){
        palidromo=true;
    }else{
        palidromo=false;
        break;
    }
}
if(palidromo){
    alert("O texto informado é palíndromo");
}else{
    alert("O texto informado não é palíndromo");
}