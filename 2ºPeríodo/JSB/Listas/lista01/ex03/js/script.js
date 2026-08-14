nomeCompleto=prompt("Por favor, digite o seu nome completo:");
if(nomeCompleto==null || nomeCompleto=="")
    alert("Você deveria ter inserdo o seu nome...que pena.");
else{
    idade=parseInt(prompt("Digite a sua idade:"));
    if(idade<18)
        alert(`${nomeCompleto}, você não possui idade para tirar carteira, ainda falta(m) ${18-idade} anos.`);
    else alert(`${nomeCompleto}, você já possui idade para tirar carteira.`);
}