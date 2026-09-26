// user = { info : [
//     {usuario:"Ana",senha:"senha321"},
//     {usuario:"Joao",senha:"213213"}
//     ]};

// localStorage.setItem("usuarios",JSON.stringify(user));

user=localStorage.getItem("usuarios");


if (user==null){
    document.getElementById("users").innerHTML=`Não há nenhum usuário cadastrado`;
}else{
    user=JSON.parse(user);

    for(i=0;i<user.info.length;i++){
        document.getElementById("users").innerHTML+=`<p>Nome: ${user.info[i].usuario} Senha: ${user.info[i].senha}</p>`
    }
}   