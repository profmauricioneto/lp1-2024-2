let valores = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let incrementValue = function(num) {
    return num+1;
}

let resultado = valores.map(incrementValue);

console.log(resultado);
console.log(valores);
