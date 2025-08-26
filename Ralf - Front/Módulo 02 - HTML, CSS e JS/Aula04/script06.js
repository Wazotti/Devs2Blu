function calcularIMC() {
  let altura = parseFloat(document.getElementById('altura').value);
  let peso = parseFloat(document.getElementById('peso').value);
  let retorno = document.getElementById('retorno');

  if (!altura || !peso || altura <= 0 || peso <= 0) {
    retorno.innerHTML = "Preencha os campos corretamente.";
    retorno.style.color = 'rgb(216, 87, 255)';
    return;
  }

  let imc = peso / (altura * altura);
  let classificacao = '';

  if (imc < 18.5) {
    classificacao = 'Abaixo do peso';
  } else if (imc < 25) {
    classificacao = 'Peso normal';
  } else if (imc < 30) {
    classificacao = 'Sobrepeso';
  } else if (imc < 35) {
    classificacao = 'Obesidade grau 1';
  } else if (imc < 40) {
    classificacao = 'Obesidade grau 2';
  } else {
    classificacao = 'Obesidade grau 3';
  }

  retorno.innerHTML = `Seu IMC é <strong>${imc.toFixed(2)}</strong> <br/> Classificação: <strong>${classificacao}</strong>`;
  retorno.style.color = 'rgb(49, 49, 49)';
}