let idades = [12, 45, 42, 13, 86, 11];

function isChild(age) {
    return age < 18;
}

let result = idades.filter(isChild);

console.log(result);
