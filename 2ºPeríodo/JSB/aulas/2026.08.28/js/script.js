btn = document.getElementById("btnTestar");

btn.addEventListener("click",function () {exibirMsg("Eu....eu....e-e-eu...fui clicado.")});
btn.addEventListener("mouseout",function () {exibirMsg("Até mais!")});
btn.addEventListener("mousemove",function () {exibirMsg("Pare com isso!")});

function exibirMsg(msg,n) {
    if(n>0){
        alert(msg);

    }
}
// function despedida(){
//     alert("Até mais");
// }

// function nome(){
//     alert("Para com isso ai");
// }