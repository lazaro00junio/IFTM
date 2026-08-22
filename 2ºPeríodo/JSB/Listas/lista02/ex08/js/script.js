texto = prompt("Digite um texto: ", "banana, carro, maça, banana, abelha , zebra, urso, gato, coelho, abrobora").split(" ");
alfabeto = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];

for (i = 0; i < alfabeto.length; i++) {
    x = 0;
    for (j = 0; j < texto.length; j++) {
        if (texto[j].at(0).toLowerCase() == alfabeto[i]) {

            if (x == 0) {
                document.write(`<p>Palavras iniciadas com a letra ${alfabeto[i]}:</p>`)
                document.write(`<ul>`);
                x++;
            }
            if(texto[j].at(-1)=="," || texto[j].at(-1)=="."|| texto[j].at(-1)=="!" || texto[j].at(-1)=="?"){
                //o método seguinte não foi visto em sala de aula, mas fiquei interessado em aprender como retirar o ultimo caracter de uma string
                document.write(`<li>${texto[j].slice(0,-1)}</li>`);    
            }else{
                document.write(`<li>${texto[j]}</li>`)
            }
        }
        if (j == texto.length - 1 && x==1) {
            document.write(`</ul>`)
        }

    }
}