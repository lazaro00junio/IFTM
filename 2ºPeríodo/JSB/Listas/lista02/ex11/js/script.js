texto=prompt("Insira um texto qualquer: ");
p1=prompt("Informe a palavra a ser subistituída: ");
while((p1.split(" ").length>1|| p1==null || p1=="")==true){
    p1=prompt("Insira apenas uma palavra: ");
}
p2=prompt("Informe a palavra substituta: ");
if((p2.split(" ").length>1 || p2==null || p2=="")==true){
    p2=prompt("Insira apenas uma palavra: ");
}
alert(texto.replaceAll(p1,p2))