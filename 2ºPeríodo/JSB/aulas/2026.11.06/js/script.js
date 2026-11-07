let erros=0,acertos=0,total=0,nums;

document.getElementById("btnPlay").addEventListener("click",function(){
    nums=setInterval(gerar,document.getElementById("dificuldade").value);
});

document.getElementById("btnPause").addEventListener("click",function(){
    clearInterval(nums);
});

document.getElementById("nroAleatorio").addEventListener("click", function(e){
    if(e.target.innerHTML%2==0){
        alert("Boa");
        document.getElementById("acertos").innerHTML=acertos+=1;
    }else{
        document.getElementById("erros").innerHTML=erros+=1;
    }
});
function gerar() {
    let nro = parseInt(Math.random()*100)+1;
    document.getElementById("nroAleatorio").innerHTML = nro;
    if(nro % 2 ==0 ){
        document.getElementById("total").innerHTML=total+=1;
    }
}