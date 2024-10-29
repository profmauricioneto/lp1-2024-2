let tempCelsius = [13, 26, 32, 41, 45, 56, 57, 39, 90, 10];

function celsiusToFah(grauCelsius) {
    return (grauCelsius * 9/5) + 32;
}

function highTemp(temp) {
    return temp > 90;
}

function showResult(item) {
    console.log(`Fahrenheit: ${item} `);
}

function converterCelsiusParaFahrenheit(tempCelsius) {
    tempCelsius.map(celsiusToFah).filter(highTemp).forEach(showResult);
}

converterCelsiusParaFahrenheit(tempCelsius);

