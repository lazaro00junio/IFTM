nomeCompleto = prompt("Digite o seu nome completo: ").trim();
if (nomeCompleto != null) {
    if (nomeCompleto != " ") {
        document.write(`<p>${nomeCompleto}</p>`);
        document.write(`<p>O seu nome tem ${nomeCompleto.length} caractéres </p>`);
    } else {
        document.write("Nome inválido. Tente novamente.");
    }
}