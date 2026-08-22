texto=prompt("Digite um texto: ").split(" ");
ultimaPalavra=texto[texto.length-1];
primeiraPalavra=texto[0];
primeiraUltima=`${primeiraPalavra} ${ultimaPalavra}`;
document.write(`<p>${primeiraUltima}</p>`);