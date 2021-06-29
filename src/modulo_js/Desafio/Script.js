var fs = require('fs');
var funcionarios = null;
//funcao para abrir arquivo
fs.readFile('funcionarios.json', 'utf-8', function (err, data) {
  if (err) {
    console.log(err);
  } else {
    funcionarios = JSON.parse(data).funcionarios;
    //maior salario
    console.log('Maior salário:' + JSON.stringify(maiorSalario()));
    console.log('Maior salário:' + JSON.stringify(maiorSalario('Produção')));
    console.log(
      'Maior salário:' + JSON.stringify(maiorSalario('Administrativo'))
    );
    console.log('Maior salário:' + JSON.stringify(maiorSalario('Comercial')));
    console.log('----------------------------------------------------');
    //menor salario
    console.log('Menor salário:' + JSON.stringify(menorSalario()));
    console.log('Menor salário:' + JSON.stringify(menorSalario('Produção')));
    console.log(
      'Menor salário:' + JSON.stringify(menorSalario('Administrativo'))
    );
    console.log('Menor salário:' + JSON.stringify(menorSalario('Comercial')));

    console.log(
      '--------------------------Media Total-------------------------'
    );
    console.log('Media salarial: ' + JSON.stringify(media()));
    console.log(
      '--------------------------Media por SETOR-------------------------'
    );
    console.log(
      'Media salarial - COMERCIAL: ' + JSON.stringify(mediaSetor('Comercial'))
    );
    console.log(
      'Media salarial - PRODUÇÃO: ' + JSON.stringify(mediaSetor('Produção'))
    );
    console.log(
      'Media salarial - ADMINISTRATIVO: ' +
        JSON.stringify(mediaSetor('Administrativo'))
    );
  }
});
// function maiorSalario() {
//   var funcMaiorSalario = funcionarios[0];
//   for (var i = 1; i < funcionarios.length; i++) {
//     if (funcionarios[i].salario > funcMaiorSalario.salario) {
//       funcMaiorSalario = funcionarios[i];
//     }
//   }
//   return funcMaiorSalario;
// }

function maiorSalario(setor) {
  var funcMaiorSalario = null;
  for (var i = 1; i < funcionarios.length; i++) {
    if (setor && funcionarios[i].setor !== setor) {
      continue;
    }
    if (funcMaiorSalario === null) {
      funcMaiorSalario = funcionarios[i];
      continue;
    }
    if (funcionarios[i].salario > funcMaiorSalario.salario) {
      funcMaiorSalario = funcionarios[i];
    }
  }
  return funcMaiorSalario;
}
// function maiorSalario() {
//   var funcMaiorSalario = funcionarios[0];
//   for (var i = 1; i < funcionarios.length; i++) {
//     if (funcionarios[i].salario > funcMaiorSalario.salario) {
//       funcMaiorSalario = funcionarios[i];
//     }
//   }
//   return funcMaiorSalario;
// }

function menorSalario(setor) {
  var funcMenorSalario = null;
  for (var i = 1; i < funcionarios.length; i++) {
    if (setor && funcionarios[i].setor !== setor) {
      continue;
    }
    if (funcMenorSalario === null) {
      funcMenorSalario = funcionarios[i];
      continue;
    }
    if (funcionarios[i].salario < funcMenorSalario.salario) {
      funcMenorSalario = funcionarios[i];
    }
  }
  return funcMenorSalario;
}

function media() {
  var total = 0;
  for (var i = 0; i < funcionarios.length; i++) {
    total += funcionarios[i].salario;
  }
  return total / funcionarios.length;
}

function mediaSetor(setor) {
  var total = 0;
  var quantidade = 0;
  for (var i = 0; i < funcionarios.length; i++) {
    if (setor && funcionarios[i].setor !== setor) {
      continue;
    }
    total += funcionarios[i].salario;
    quantidade++;
  }
  return total / quantidade;
}
