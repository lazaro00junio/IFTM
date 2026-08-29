p = document.getElementById("p");
p.addEventListener("click",mudarCor);
p.addEventListener("mouseout",restaurarCor);

function mudarCor() {
    p.style.color="red";
    p.style.backgroundColor="blue";
}

function restaurarCor(){
    p.style.color="";
    p.style.backgroundColor=""; 
}