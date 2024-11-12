let usuario = {
    nome: "Mauricio",
    idade: 34,
    professor: true,
    linguagens: ["javascript", "python", "java"]
};

let object_json = JSON.stringify(usuario);
console.log(typeof object_json);
console.log(object_json);

let usuario_object = JSON.parse(object_json);
console.log(typeof usuario_object);
console.log(usuario_object);
