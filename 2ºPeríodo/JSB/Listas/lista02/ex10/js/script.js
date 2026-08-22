n=parseInt(prompt("Insira um inteiro positivo maior ou igual a 2: "));
while(!(n>=2)){
    n=parseInt(prompt("Muito engraçado. Insira um inteiro positivo maior ou igual a 2: "));
}
document.write(`<table border=1 style="text-align: center; border-collapse: collapse;"> <tr> <th>Base decimal</th> <th>Base binária</th> <th>Base hexadecimal</th> </tr>`);
for(i=0;i<=n;i++){
    document.write(`<tr> <td>${i}</td> <td>${i.toString(2)}</td> <td>${i.toString(16)}</td> </tr>`)
}
document.write("</table>")