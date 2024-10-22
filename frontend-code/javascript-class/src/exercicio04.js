const prompt = require('prompt-sync')();

function valoresPares(min, max) {    
    for(let i = min; i <= max; i++) {
        if (i % 2 == 0) {
            console.log(`${i} é par.`);
        }
    }
}

let minimo = parseInt(prompt('Digite o valor mínimo: '));
let maximo = parseInt(prompt('Digite o valor máximo: '));

valoresPares(minimo, maximo);