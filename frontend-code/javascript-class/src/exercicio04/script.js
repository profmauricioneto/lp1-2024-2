function changeTitle() {
    let title = document.getElementById("title");
    console.log(title);
    title.innerHTML = "Meu Novo Título";
    title.style.color = "red";


    let text = document.getElementById("text-content");
    console.log(text);
    text.style.height = "400px";
    text.style.width = "400px"
    text.style.backgroundColor = "lightgray"
}