texto=prompt("Digite um texto : ","aaaaa aaaaa aaaaaa").split(" ");
c1=prompt("Digite uma inicial de qualquer palavra do seu texto.","a").toUpperCase;
c2=prompt("Digite qualquer letra: ","b");
textoNovo=[];
for(i=0;i<texto.length;i++){
    if(texto[i].charAt(0).toUpperCase()==c1)
        textoNovo[i]=texto[i].replace(c1,c2);
}
textoNovo.join(" ");
alert(textoNovo);