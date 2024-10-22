const prompt = require('prompt-sync')();

function calculadora(valor1, valor2, operacao) {
    let resultado = 0;
    switch(operacao) {
        case '+':{
            resultado = valor1 + valor2;
            break;
        }
        case '-': {
            resultado = valor1 - valor2;
            break;
        }
        case '*': {
            resultado = valor1 * valor2;
            break;
        }
        case '/':{
            try {
                resultado = valor1/valor2;
            } catch(error) {
                console.log(error);
            }
            break;
        }
        default:
            console.log('Operacao não selecionada.');
    }
    return resultado;
}
let valor1 = parseFloat(prompt('Digite o primeiro valor: '));
let valor2 = parseFloat(prompt('Digite o segundo valor: '));
let operacao = prompt('Digite a operacao: ');

console.log(calculadora(valor1, valor2, operacao));