const calcular = () => {
  let formulario = document.getElementById("formulario");
  let n1 = parseFloat(formulario.nota1.value);
  let n2 = parseFloat(formulario.nota2.value);
  let n3 = parseFloat(formulario.nota3.value);

  let exibirMedia = document.getElementById('exibirMedia');
  let exibirSituacao = document.getElementById('exibirSituacao');
 
  if (n1 < 0 || n2 < 0 || n3 < 0) {
    exibirMedia.innerText = "As notas não podem ser negativas.";
    exibirMedia.style.color = "rgb(49, 49, 49)";
    exibirSituacao.innerText = "";
    return false;
  }

    if (n1 > 10 || n2 > 10 || n3 > 10) {
    exibirMedia.innerText = "As notas não podem ser maiores que 10.";
    exibirMedia.style.color = "rgb(49, 49, 49)";
    exibirSituacao.innerText = "";
    return false;
  }

  if (isNaN(n1) || isNaN(n2) || isNaN(n3)) {
    exibirMedia.innerText = "Por favor, preencha todas as notas.";
    exibirMedia.style.color = "rgb(49, 49, 49)";
    exibirSituacao.innerText = "";
    return false;
  }

  const media = (n1 + n2 + n3) / 3;

  if (media >= 7) {
    situacao = "Aprovado";
    corFonte = 'rgb(216, 87, 255)';
  } else if (media >= 5) {
    situacao = "Recuperação";
    corFonte = 'rgb(255, 153, 58)';
  } else {
    situacao = "Reprovado";
    corFonte = 'rgb(211, 55, 55)';
  }

  exibirMedia.innerText = `Média: ${media.toFixed(2)}`;
  exibirSituacao.innerText = `Situação: ${situacao}`;

  exibirMedia.style.color = corFonte;
  exibirSituacao.style.color = corFonte;

  return false;
}