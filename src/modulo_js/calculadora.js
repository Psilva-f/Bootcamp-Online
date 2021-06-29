console.log(process.argv)

var operacao = process.argv[0]
var num1 = parseInt(process.argv[1])
var num2 = parseInt(process.argv[2])

var resultado = 0
if (operacao === "soma"){
resultado = num1 + num2

}else if (operacao === "subtracao"){
    resultado = num1 - num2
}else if (operacao === "multiplicacao"){
        resultado = num1 * num2
    }else if (operacao === "divisao"){
        resultado = num1 / num2
    }else if (operacao === "resto"){
        resultado = num1 % num2
    }else if (operacao === "porcentagem"){
        resultado = num1 * num2 / 100
    }

    console.log(resultado)
