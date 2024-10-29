let valores = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let isEven = function(num) {
    return num % 2 === 0; 
}

function selecionarNumerosPares(numeros) {
    let resultado = numeros.filter(isEven);
    return resultado;
}

console.log(selecionarNumerosPares(valores));
console.log(valores);

