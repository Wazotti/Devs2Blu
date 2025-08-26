const acao = (event, valor) => {

    if(event.key === 'Enter'){
        let retorno = document.getElementById('retorno');
        let valorConvertido = parseInt(valor);
        let total = 0;

        for(let indice=valorConvertido-1; indice>0; indice--){
            if(indice == valorConvertido-1){
                total = valorConvertido * indice;
            }else{
                total = total * indice
            }
        }
        retorno.innerHTML = `O fatorial de <strong>${valorConvertido}</strong> é <strong>${total}</strong>`;
        retorno.style.color = 'rgb(49, 49, 49)';
    }
}