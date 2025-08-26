const numeroGerado = Math.floor(Math.random() * 100) + 1;

let tentativas = 0;
const acao = (event, valor) => {

    if (event.key === 'Enter') {
        tentativas++;
        let retorno = document.getElementById('retorno');
        let valorConvertido = parseInt(valor);
        let diferenca = numeroGerado > valorConvertido ? numeroGerado - valorConvertido : valorConvertido - numeroGerado;

        if(diferenca == 0){
            if(tentativas == 1){
                retorno.innerHTML = `Acertou de primeira!`;
            }else if(tentativas == 2){
                retorno.innerHTML = `Quase foi de primeira!`;
            }else{
                retorno.innerHTML = `Acertou! Foram realizadas <strong>${tentativas}</strong> tentativas.`;
            }
        }else if(diferenca <= 5){
            retorno.innerText = 'Quase!';
            retorno.style.color = 'rgb(49, 49, 49)';
        }else if(diferenca <= 10){
            retorno.innerText = 'Perto!';
            retorno.style.color = 'rgb(49, 49, 49)';
        }else if(diferenca <= 20){
            retorno.innerText = 'Longe!';
            retorno.style.color = 'rgb(49, 49, 49)';
        }else{
            retorno.innerText = 'Muito longe!';
            retorno.style.color = 'rgb(49, 49, 49)';
        }
    }
}