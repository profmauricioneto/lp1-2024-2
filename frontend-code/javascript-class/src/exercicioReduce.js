let values = [1,24,31,14,52,16,47,58,19,10];

function encontrarMaiorValor(array) {
    let maiorNumero = array.reduce((acc, current) => acc > current ? acc : current, 0);
    return maiorNumero;
}

console.log(encontrarMaiorValor(values))