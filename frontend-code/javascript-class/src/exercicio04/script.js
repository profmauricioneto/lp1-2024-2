function changeTitle() {
    // let title = document.getElementById("title");

    let title = document.querySelector("h2#title");
    console.log(title);
    title.innerHTML = "Meu Novo Título";
    title.style.color = "red";

    let divs = document.getElementsByTagName("div");
    console.log(divs);
    for (i = 0; i < divs.length; i++) {
        divs[i].style.height = "200px";
        divs[i].style.width = "200px";
        divs[i].style.backgroundColor = "lightblue";
    }

    let jsClass = document.getElementsByClassName("caracteristicas");
    for(i = 0; i < jsClass.length; i++) {
        // jsClass[i].style.display = "block";
        jsClass[i].className = "";
    }
}