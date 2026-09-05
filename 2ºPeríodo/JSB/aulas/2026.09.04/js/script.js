votosCands = [0, 0, 0, 0, 0, 0];

document.getElementById("votosCand1").innerHTML = votosCands[0];
document.getElementById("votosCand2").innerHTML = votosCands[1];
document.getElementById("votosCand3").innerHTML = votosCands[2];
document.getElementById("votosCand4").innerHTML = votosCands[3];
document.getElementById("votosCand5").innerHTML = votosCands[4];
document.getElementById("votosCand6").innerHTML = votosCands[5];

document.getElementById("btnIncrementar1").addEventListener("click", function () { incrementarVoto(1) });
document.getElementById("btnIncrementar2").addEventListener("click", function () { incrementarVoto(2) });
document.getElementById("btnIncrementar3").addEventListener("click", function () { incrementarVoto(3) });
document.getElementById("btnIncrementar4").addEventListener("click", function () { incrementarVoto(4) });
document.getElementById("btnIncrementar5").addEventListener("click", function () { incrementarVoto(5) });
document.getElementById("btnIncrementar6").addEventListener("click", function () { incrementarVoto(6) });

function tocarSomUrna() {
    const AudioContext = window.AudioContext || window.webkitAudioContext;
    if (!AudioContext) return;
    
    const ctx = new AudioContext();
    const osc = ctx.createOscillator();
    const gain = ctx.createGain();

    osc.type = 'sine';
    osc.frequency.setValueAtTime(1300, ctx.currentTime);

    gain.gain.setValueAtTime(0.3, ctx.currentTime);
    gain.gain.exponentialRampToValueAtTime(0.001, ctx.currentTime + 0.35);

    osc.connect(gain);
    gain.connect(ctx.destination);

    osc.start();
    osc.stop(ctx.currentTime + 0.35);
}

function incrementarVoto(n) {
    votosCands[n - 1]++;
    document.getElementById("votosCand" + n).innerHTML = votosCands[n - 1];
    tocarSomUrna();
}