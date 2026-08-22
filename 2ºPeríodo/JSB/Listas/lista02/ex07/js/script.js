texto=prompt("Insira um texto: ","Paranbéns aí, parabéns.").split(" ");
l=prompt("Insira uma letra: ","p").toLowerCase();
palavrasExtraidas=" ";
for(i=0;i<texto.length;i++){
    if(texto[i].at(0).toLowerCase()==l){
        palavrasExtraidas+=texto[i]+" ";
    }
}
document.write(`<p>${palavrasExtraidas}</p>`)