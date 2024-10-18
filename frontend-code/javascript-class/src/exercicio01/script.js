function biggerThan() {
    let result = document.getElementById
    ('result');
    
    let value1 = document.getElementById("first-value").value;
    let value2 = document.getElementById("second-value").value;
    
    if (value1 > value2) {
        result.innerHTML = value1 + "é o maior valor";
    } else if (value1 < value2) {
        result.innerHTML = value2 + "é o maior valor";
    } else {
        result.innerHTML = "valores iguais";
    }
}

