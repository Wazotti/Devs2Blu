// Vetor
let produtos = [];

// Requisição para obter todos os produtos
fetch('http://localhost:3000/produtos')
.then(retorno => retorno.json())
.then(p => {
    produtos=p;
    renderizarTabela();
});

// Função para gerar a tabela
let renderizarTabela = () => {
    // Selecionar elemento <tbody>
    let tabela = document.getElementById('tabela');

    // Laço de repetição
    for(let indice=0; indice<produtos.length; indice++){
        // Criar linha de tabela <tr>
        let linha = tabela.insertRow(-1);

        // Criar colunas <td>
        let colunaId         = linha.insertCell(0);
        let colunaNome       = linha.insertCell(1);
        let colunaMarca      = linha.insertCell(2);
        let colunaValor      = linha.insertCell(3);
        let colunaSelecionar = linha.insertCell(4);

        // Informar o valor de cada coluna
        colunaId.innerText = produtos[indice].id;
        colunaNome.innerText = produtos[indice].nome;
        colunaMarca.innerText = produtos[indice].marca;
        colunaValor.innerText = produtos[indice].valor;
        colunaSelecionar.innerHTML = `<button onclick='selecionar(${indice})' class='btn btn-primary'>Selecionar</button>`;
    }

}

// Função para cadastrar produtos
const cadastrar = () => {
    // Obter os inputs
    let nome = document.getElementById('nome');
    let marca = document.getElementById('marca');
    let valor = document.getElementById('valor');

    // Criar objeto produto
    let obj = {
        'nome': nome.value,
        'marca': marca.value,
        'valor': parseFloat(valor.value)
    }
    // Requisição
    fetch(
        'http://localhost:3000/produtos',
        {
            method:'Post',
            body:JSON.stringify(obj),
            headers:{'Content-Type':'application/json'}
        }
    ).then(res => res.json())
    .then(p => {
        // Armazenar o produto no vetor
        produtos.push(p);

        // Gerar o índice do produto no vetor
        let indice = produtos.length - 1;

        // Selecionar elemento <tbody>
        let tabela = document.getElementById('tabela');

        // Criar linha de tabela <tr>
        let linha = tabela.insertRow(-1);

        // Criar colunas <td>
        let colunaId         = linha.insertCell(0);
        let colunaNome       = linha.insertCell(1);
        let colunaMarca      = linha.insertCell(2);
        let colunaValor      = linha.insertCell(3);
        let colunaSelecionar = linha.insertCell(4);

        // Informar o valor de cada coluna
        colunaId.innerText         = p.id;
        colunaNome.innerText       = p.nome;
        colunaMarca.innerText      = p.marca;
        colunaValor.innerText      = p.valor;
        colunaSelecionar.innerHTML = `<button onclick='selecionar(${indice})' class='btn btn-primary'>Selecionar</button>`;

        // Limpar os inputs
        nome.value = '';
        marca.value = '';
        valor.value = '';

        // Focus
        nome.focus();
    });
}

// Função para selecionar produto especifico
const selecionar = (indice) => {
    // Selecionar todos os elementos do formulário
    let id = document.getElementById('id');
    let nome = document.getElementById('nome');
    let marca = document.getElementById('marca');
    let valor = document.getElementById('valor');
    let btnCadastrar = document.getElementById('btnCadastrar');
    let btnAlterar = document.getElementById('btnAlterar');
    let btnRemover = document.getElementById('btnRemover');
    let btnCancelar = document.getElementById('btnCancelar');

    // Obter objeto produto
    let obj = produtos[indice];

    // Preencher inputs (text)
    id.value = obj.id;
    nome.value = obj.nome;
    marca.value = obj.marca;
    valor.value = obj.valor;

    // Visibilidade dos botões
    btnCadastrar.style.display = 'none';
    btnAlterar.style.display = 'inline-block';
    btnRemover.style.display = 'inline-block';
    btnCancelar.style.display = 'inline-block';
}

// Função para selecionar produto especifico
const cancelar = () => {
    // Selecionar todos os elementos do formulário
    let id = document.getElementById('id');
    let nome = document.getElementById('nome');
    let marca = document.getElementById('marca');
    let valor = document.getElementById('valor');
    let btnCadastrar = document.getElementById('btnCadastrar');
    let btnAlterar = document.getElementById('btnAlterar');
    let btnRemover = document.getElementById('btnRemover');
    let btnCancelar = document.getElementById('btnCancelar');

    // Preencher inputs (text)
    id.value = '';
    nome.value = '';
    marca.value = '';
    valor.value = '';

    // Visibilidade dos botões
    btnCadastrar.style.display = 'inline-block';
    btnAlterar.style.display = 'none';
    btnRemover.style.display = 'none';
    btnCancelar.style.display = 'none';
}

// Função para cadastrar produtos
const alterar = () => {
    // Obter os inputs
    let id = document.getElementById('id');
    let nome = document.getElementById('nome');
    let marca = document.getElementById('marca');
    let valor = document.getElementById('valor');

    // Criar objeto produto
    let obj = {
        'nome': nome.value,
        'marca': marca.value,
        'valor': parseFloat(valor.value)
    }
    // Requisição
    fetch(
        `http://localhost:3000/produtos/${id.value}`,
        {
            method:'Put',
            body:JSON.stringify(obj),
            headers:{'Content-Type':'application/json'}
        }
    ).then(res => res.json())
    .then(p => {
        // Localizar o produto no vetor
        let indice = produtos.findIndex(pessoa => pessoa.id == p.id);

        // Alterar objeto no vetor
        produtos[indice] = p;

        // Rederenizar a tabela
        renderizarTabela() => {
            // Selecionar elemento <tbody>
            let tabela = document.getElementById('tabela');

            // Limpar a tabela
            tabela.innerHTML = '';

            // Recriar a tabela
            for(let indice=0; indice<produtos.length; indice++){
                // Criar linha de tabela <tr>
                let linha = tabela.insertRow(-1);

                // Criar colunas <td>
                let colunaId         = linha.insertCell(0);
                let colunaNome       = linha.insertCell(1);
                let colunaMarca      = linha.insertCell(2);
                let colunaValor      = linha.insertCell(3);
                let colunaSelecionar = linha.insertCell(4);

                // Informar o valor de cada coluna
                colunaId.innerText = produtos[indice].id;
                colunaNome.innerText = produtos[indice].nome;
                colunaMarca.innerText = produtos[indice].marca;
                colunaValor.innerText = produtos[indice].valor;
                colunaSelecionar.innerHTML = `<button onclick='selecionar(${indice})' class='btn btn-primary'>Selecionar</button>`;
            }
        }

        // Limpar os inputs
        nome.value = '';
        marca.value = '';
        valor.value = '';

        // Focus
        nome.focus();
    });
}