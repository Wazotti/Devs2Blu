const acao = (event, valor) => {

    if(event.key === 'Enter'){
        let retorno = document.getElementById('retorno');
        let valorConvertido = parseInt(valor);
        retorno.innerHTML = '';
        retorno.style.color = 'rgb(49, 49, 49)';

        for(let indice=0; indice<11; indice++){
            retorno.innerHTML += `${valorConvertido} X ${indice} = ${valorConvertido*indice}<br>`;
            retorno.style.color = 'rgb(49, 49, 49)';
        }
    }
}