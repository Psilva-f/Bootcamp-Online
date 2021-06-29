var carros = ['Gol', 'Palio', 'Uno', 'Sandeiro'];
//pop remove o ultimo elemento da array e retorno o elemento removido
var carro = carros.pop();
//for (var i = 0; i < carros.length; i++)
//console.log(carro);
//console.log(carros);

//push insere o elemento no fim do array e retorna seu novo tamanho
var x = carros.push('Ford Ka');
/*console.log(carros);
console.log(x);*/
//shift remove o primeiro elemento do array e retorna ele e atualiza os outros indices
carro = carros.shift();
//console.log(carro);
//console.log(carros);

//unshift adiciona um elemento no inicio do
//array, atualiza os outros indices e retorna o novo tamanho do array
carros.unshift('Onix');
console.log(carros);
//atualizar elemento do indice informado
carros[2] = 'novo Uno';
console.log(carros);

//delete remove elemento do indice informado, deixando undefined no lugar
/*delete carros[2];
console.log(carros);*/

/*primeiro parametro:: Posicao inicial
segundo parametro: quantos elemento serao removidos a partir da posicao inicial
terceiro e demais parametro: elementos que serao inseridos a partir da posicao inicial*/
carros.splice(2, 0, 'Gol', 'Creta');
console.log(carros);
//numero do elemento que sera removido e a quantidade que sera removido
carros.splice(2, 1);
console.log(carros);

//concat concatena uma array em outro e retorna o novo array criado
var carrosAntigos = ['Brasilia', 'Monza', 'Fusca'];
var todosCarros = carros.concat(carrosAntigos);
console.log(todosCarros);
//splice cria um novo array se alterar o array original
//primeiro parametro: posicao inicial
//segundo parametro (opcional): posicao final (nao incluido)
var novoArray = todosCarros.slice(1);
console.log(novoArray);
