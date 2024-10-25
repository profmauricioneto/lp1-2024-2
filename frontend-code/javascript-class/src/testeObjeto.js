let user = {};
console.log(user);

user.name = "mauricio";
user.age = 34;
user.isProfessor = true;

console.log(user);

for (x in user) {
    console.log(`${x} = ${user[x]}`);
}