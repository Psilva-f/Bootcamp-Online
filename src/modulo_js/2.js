/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

//Parte 1 - encontrar a sequencia de Fibonacci ate 4000000
//Parte 2 - percorrer a lista encontrada e encontrar os pares
//Parte 3 - somar os numeros pares (incorporado na parte 2)

var array = [1, 2];
var valor = 3;
var i = 3;

//Parte 1
while (valor <= 4000000) {
    array.push(valor);    
    valor = array[i - 1] + array[i - 2];
    i++;
}

//Parte 2
//var pares = [];
var soma = 0;
for (var j = 0; j < array.length; j++) {
    if (array[j] % 2 === 0) {
        soma += array[j];
        //pares.push(array[j]);
    }    
}

//Parte 3 - incorporada na parte 2
/*var soma = 0;
for (var k = 0; k < pares.length; k++) {
    soma = soma + pares[k];
}*/

console.log(soma);