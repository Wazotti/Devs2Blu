const perguntas = [
    {
        pergunta: "Qual é o nome do protagonista principal de Red Dead Redemption 2?",
        opcoes: ["John Marston", "Dutch van der Linde", "Arthur Morgan", "Sadie Adler"],
        correta: 2
    },
    {
        pergunta: "Qual é o nome da gangue da qual Arthur faz parte?",
        opcoes: ["Van der Linde", "O’Driscoll Boys", "Lemoyne Raiders", "Blackwater Gang"],
        correta: 0
    },
    {
        pergunta: "Em que ano se passa a maior parte do jogo?",
        opcoes: ["1908", "1899", "1885", "1911"],
        correta: 1
    },
    {
        pergunta: "Qual doença Arthur contrai durante o jogo?",
        opcoes: ["Gripe Espanhola", "Câncer", "Tuberculose", "Malária"],
        correta: 2
    },
    {
        pergunta: "Qual cavalo lendário é o mais rápido?",
        opcoes: ["Missouri Fox Trotter", "Hungarian Halfbred", "Arabian Preto", "Kentucky Saddler"],
        correta: 0
    },
    {
        pergunta: "Onde a gangue se esconde após fugir de Valentine?",
        opcoes: ["Guarma", "Horseshoe Overlook", "Saint Denis", "Colter"],
        correta: 1
    },
    {
        pergunta: "Quem trai a gangue no final?",
        opcoes: ["Charles Smith", "Sadie Adler", "Micah Bell", "Hosea Matthews"],
        correta: 2
    },
    {
        pergunta: "Qual desses animais NÃO pode ser caçado?",
        opcoes: ["Jacaré", "Urso", "Tubarão", "Puma"],
        correta: 2
    },
    {
        pergunta: "Quem é o inimigo final do epílogo?",
        opcoes: ["Dutch", "Edgar Ross", "Micah Bell", "Angelo Bronte"],
        correta: 2
    },
    {
        pergunta: "Quem é jogável no epílogo?",
        opcoes: ["Arthur Morgan", "Dutch", "Javier", "John Marston"],
        correta: 3
    }
];

const perguntasSelecionadas = perguntas.sort(() => 0.5 - Math.random()).slice(0, 5);
let indice = 0;
let acertos = 0;

function exibirPergunta() {
    const atual = perguntasSelecionadas[indice];
    document.getElementById('pergunta').innerText = `Pergunta ${indice + 1}: ${atual.pergunta}`;

    const opcoesDiv = document.getElementById('opcoes');
    opcoesDiv.innerHTML = '';

    atual.opcoes.forEach((opcao, i) => {
        const botao = document.createElement('button');
        botao.innerText = opcao;
        botao.className = "w-full bg-gray-200 hover:bg-purple-200 text-left px-4 py-2 rounded-lg";
        botao.onclick = () => verificarResposta(i);
        opcoesDiv.appendChild(botao);
    });
}

function verificarResposta(respostaEscolhida) {
    const pergunta = perguntasSelecionadas[indice];

    if (respostaEscolhida === pergunta.correta) {
        acertos++;
    }

    indice++;

    if (indice < perguntasSelecionadas.length) {
        exibirPergunta();
    } else {
     mostrarResultado();
    }
}

function mostrarResultado() {
    document.getElementById('opcoes').innerHTML = '';
    document.getElementById('pergunta').innerText = '';
    document.getElementById('fim').innerText = "Quiz Finalizado!";
    document.getElementById('fim').style.color = 'rgb(49, 49, 49)';
    document.getElementById('retorno').innerHTML = `Você acertou <strong>${acertos}</strong> de 5 perguntas.`;
    document.getElementById('retorno').style.color = 'rgb(49, 49, 49)';
}
exibirPergunta();