function verificarAno() {
  let ano = parseInt(document.getElementById('ano').value);
  let retorno = document.getElementById('retorno');

  if (!ano || ano <= 0) {
    retorno.innerHTML = "Por favor, insira um ano válido.";
    retorno.style.color = 'rgb(49, 49, 49)';
    return;
  }

  let bissexto = false;

  if ((ano % 4 === 0 && ano % 100 !== 0) || (ano % 400 === 0)) {
    bissexto = true;
  }

  if (bissexto) {
    retorno.innerHTML = `O ano de <strong>${ano}</strong> é bissexto.`;
  } else {
    retorno.innerHTML = `O ano de <strong>${ano}</strong> não é bissexto.`;
  }
  retorno.style.color = 'rgb(49, 49, 49)';
}