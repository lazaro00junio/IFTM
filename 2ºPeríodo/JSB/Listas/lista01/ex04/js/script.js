primeiroBimestre=parseInt(prompt("Digite a nota que você tirou no 1º bimestre:"));
segundoBimestre=parseInt(prompt("Digite a nota que você tirou no 1º bimestre:"));
if(primeiroBimestre+segundoBimestre>=60)
    alert("Parabéns! Você foi aprovado.")
else
    alert(`Você foi reprovado.\nInfelizmente, ficaram faltando ${60-(primeiroBimestre+segundoBimestre)} pontos para a sua aprovação`)