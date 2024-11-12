const prompt = require("prompt-sync")();
const fs = require('fs');
let tarefas = [];

function addTarefa() {
    let tarefa = {};
    tarefa.titulo = prompt("Titulo: ");
    tarefa.descricao = prompt("Descricao: ");
    tarefa.concluida = false;
    tarefas.push(tarefa);
};

function tornarConcluida(titulo) {
    tarefas.forEach((item) => {
        if (item.titulo == titulo) {
            item.concluida = true;
        }
    })
}

function addInFileJSON(tarefas) {
    fs.writeFileSync("data.json", tornarJSON(), "utf-8", (err) => {
        if (err) {
            console.log(err);
        }
        console.log("Armazenado!");
        
    })
}

function tornarJSON() {
    return JSON.stringify(tarefas);
}

function obterTarefasConcluida(tarefas) {
    let tarefasObjeto = JSON.parse(tarefas);
    let tarefasConcluidas = tarefasObjeto.filter((item) => {
        return item.concluida === true;
    });
    return tarefasConcluidas;
}

function mostrarTudo() {
    console.log(tarefas);
}


function main() {
    let option;
    console.log("1-addTarefa\n2-Tornar Concluida\n3-Verificar Concluida\n4-Mostrar Tudo\n0-sair\n");
    do {
        option = parseInt(prompt("Resp: "));
        switch(option) {
            case 1: {
                addTarefa();
                break;
            }
            case 2: {
                let titulo = prompt("Titulo: ");
                tornarConcluida(titulo);
                break;
            }
            case 3: {
                let resultado = obterTarefasConcluida(tornarJSON());
                resultado.forEach((item) => {
                    console.log(item.titulo);
                });
                break;
            }
            case 4: {
                mostrarTudo();
                break;
            }
            case 5: {
                addInFileJSON(tarefas);
                break;
            }
            case 0: {
                console.log("Saindo do sistema");
                break;
            }
            default: {
                console.log("Nenhuma das opções foram escolhidas.");
            }
        }
    }while(option != 0);
}

main();