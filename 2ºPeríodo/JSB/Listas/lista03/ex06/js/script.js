campoValor1 = document.getElementById("valor1");
campoValor2 = document.getElementById("valor2");
resultado = document.getElementById("resultado");

document.getElementById("soma").addEventListener("click", function () { calcular(1) });
document.getElementById("subtracao").addEventListener("click", function () { calcular(2) });
document.getElementById("multiplicacao").addEventListener("click", function () { calcular(3) });
document.getElementById("divisao").addEventListener("click", function () { calcular(4) });

function calcular(n) {
    valor1 = parseFloat(campoValor1.value.trim());
    valor2 = parseFloat(campoValor2.value.trim());
    if ((!isNaN(valor1) && !isNaN(valor2)) && (valor1 != "" && valor1 != "")) {
        switch (n) {
            case 1:
                resultado.value = valor1 + valor2;
                break;
            case 2:
                resultado.value = valor1 - valor2;
                break;
            case 3:
                resultado.value = valor1 * valor2;
                break;
            case 4:
                if(valor1!=0 && valor2!=0){
                    resultado.value=valor1/valor2;
                }else{
                    alert("Você foi permanentemente banido desta calculadora. \nMotivo: tentativa de divisão por 0.");
                    resultado.value="Não é possível dividir por 0.";
                }
                break;
        }
    } else {
        resultado.value="Operação inválida.";
    }
}