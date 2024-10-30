const prompt = require("prompt-sync")();

let estoque = [];

function addProduto() {
  let produto = {};
  produto.nome = prompt("Nome do Produto: ");
  produto.preco = parseFloat(prompt("Preço do Produto: "));
  produto.quantidade = parseInt(prompt("Quantidade do Produto: "));

  estoque.push(produto);
}

function verificarEstoque(nomeProduto) {

  estoque.forEach((item) => {
    if (item.nome === nomeProduto) {
      console.log("Produto Encontrado no Estoque.");
      console.log(`Quantidade em estoque: ${item.quantidade}`);
    }
  })

  // for (let i = 0; i < estoque.length; i++) {
  //   if (estoque[i].nome == nomeProduto) {
  //     console.log("Produto Encontrado no Estoque.");
  //     console.log(`Quantidade em estoque: ${estoque[i].quantidade}`);
  //   }
  // }
}

function main() {
    let option;
  do {
    console.log("1. Add Produto\n2. Verificar o Estoque: ");
    option = parseInt(prompt("Opção: "));

    switch (option) {
      case 0:
        console.log("Saindo do sistema!");
        break;
      case 1:
        addProduto();
        break;
      case 2:
        let nomeProduto = prompt("Nome do produto: ");
        verificarEstoque(nomeProduto);
        break;
      default:
        console.log("Nenhuma opção valida.");
    }
  } while (option != 0);
}

main();