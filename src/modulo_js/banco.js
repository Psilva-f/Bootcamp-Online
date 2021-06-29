function sum(a, b) {
    return a + b;
  }
  //função anonima
  const sum2 = function (a, b) {
    return a + b;
  };
  
  // arrow function
  const sum3 = (a, b) => {
    return a + b;
  };
  // arrow function reduzida
  const sum4 = (a, b) => a + b;
  
  console.log(sum(1, 5));
  console.log(sum2(1, 7));
  console.log(sum3(1, 9));
  console.log(sum4(1, 11));
  
  // template literals
  const name = 'Daniel';
  const surName = 'Oliveira';
  const text1 = 'Meu nome é ' + name + ' ' + surName;
  const text2 = `Meu nome é ${name} ${surName}`;
  console.log(text1);
  console.log(text2);