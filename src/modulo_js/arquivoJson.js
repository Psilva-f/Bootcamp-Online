var fs = require('fs');
var carros = ['Gol', 'Palio', 'Uno', 'Celta'];
var concessionaria = '{nome: "Concessionária XYZ",' + carros + '}';

fs.watchFile(nomeaquivo, JSON.stringify(concessionaria), function (err) {
  if (err) {
    console.log(err);
  }
});
