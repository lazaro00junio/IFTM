document.getElementById("btnPlay").addEventListener("click",play);

document.getElementById("btnPause").addEventListener("click",pause);

let cronometro1;

function play(){
    cronometro1=setInterval(ola,0.1);
}

function pause(){
    clearInterval(cronometro1);
}

function ola(){
    document.getElementById("num").innerHTML=Math.random()*1000;
};
