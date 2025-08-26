const calcular = () => {
    const dolar = 5.42;
    const euro = 6.39;
    const libra = 7.40;
    const bitcoin = 585693;

    const valor = parseFloat(document.getElementById('valor').value);
    const tipoMoeda = parseInt(document.getElementById('moeda').value)
    let valorConvertido = document.getElementById('valorConvertido');

    if (isNaN(valor) || valor <= 0) {
        valorConvertido.innerText = 'Digite um valor válido.';
        valorConvertido.style.color = 'rgb(49, 49, 49)';
        return false;
    }

    switch (parseInt(tipoMoeda)) {
        case 1:
            valorConvertido.innerText = `$ ${(valor * dolar).toFixed(2)}`;
            valorConvertido.style.color = 'rgb(49, 49, 49)';
            break;
        case 2:
            valorConvertido.innerText = `€ ${(valor * euro).toFixed(2)}`;
            valorConvertido.style.color = 'rgb(49, 49, 49)';
            break;
        case 3:
            valorConvertido.innerText = `£ ${(valor * libra).toFixed(2)}`;
            valorConvertido.style.color = 'rgb(49, 49, 49)';
            break;
        case 4:
            valorConvertido.innerText = `₿ ${(valor * bitcoin).toFixed(2)}`;
            valorConvertido.style.color = 'rgb(49, 49, 49)';
            break;
        default:
            valorConvertido.innerText = 'Selecione uma moeda válida.';
            valorConvertido.style.color = 'rgb(49, 49, 49)';
            break;
    }
}