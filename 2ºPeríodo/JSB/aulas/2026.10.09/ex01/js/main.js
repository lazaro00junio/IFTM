import { verificarLogin } from "./login.js";
import calc from "./calculadora.js";

alert(calc.somar(10,20));

document.getElementById("btnValidar").addEventListener("click", function() {
    verificarLogin(document.getElementById("txtNome").value.trim())
});
