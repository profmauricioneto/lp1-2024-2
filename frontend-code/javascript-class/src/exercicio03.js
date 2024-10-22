const prompt = require('prompt-sync')();

// let value = prompt('Digite o valor inteiro: ');

let myarray = [1, 4, -7, -3, 0, 65];

for (let i = 0; i < myarray.length; i++) {
    if(myarray[i] >= 0) {
        console.log(`${myarray[i]}: sinal +`);
    } else {
        console.log(`${myarray[i]}: sinal -`);
    }
}
