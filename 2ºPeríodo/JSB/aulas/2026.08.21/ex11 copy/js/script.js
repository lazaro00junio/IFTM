nomeCompleto=prompt("Insira seu nome completo: ");
nomeVetor=nomeCompleto.split(" ");
acronimo=" ";
for(i=0; i<nomeVetor.length;i++){
    // alert(i);
    acronimo+=nomeVetor[i].at(0);
}
alert(acronimo);