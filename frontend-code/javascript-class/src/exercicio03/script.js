const button = document.getElementById("btn-change");
const listElements = document.querySelectorAll("ul li");

button.addEventListener("click", function() {
    listElements.forEach(function(item) {
        item.innerHTML = "item modificado";
        console.log(item);
        
    });
});