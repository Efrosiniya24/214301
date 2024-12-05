fun main() {
    println("Укажите количество строк массива:")
    var arrayX = readlnOrNull()?.toIntOrNull() ?:2
    println("Укажите количество столбцов массива:")
    var arrayY = readlnOrNull()?.toIntOrNull() ?:2

    var array = Array(arrayX) {IntArray(arrayY)}

    for (i in 0..<arrayX){
        for (j in 0..<arrayY){
            print("Введите элемент [$i,$j]: ")
            array[i][j] = readlnOrNull()?.toIntOrNull() ?: 1
        }
    }

    println("Получившийся массив:")
    for (i in 0..<arrayX){
        for (j in 0..<arrayY){
            print(array[i][j])
        }
        println()
    }

    println("Выберите условие:" +
            "\n1.Выбрать СТРОКИ, СУММА эементов которых БОЛЬШЕ введенного числа" +
            "\n2.Выбрать СТОЛБЦЫ, СУММА которых МЕНЬШЕ введенного числа" +
            "\n3.Выбрать СТРОКИ, все элементы которых ЧЕТНЫЕ" +
            "\n4.Выбрать СТОЛБЦЫ, все элементы которых ЧЕТНЫЕ" +
            "\n5.Выбрать СТРОКИ, все элементы которых НЕЧЕТНЫЕ" +
            "\n6.Выбрать СТОЛБЦЫ, все элементы которых НЕЧЕТНЫЕ" +
            "\n7.Выбрать СТРОКИ, среднее арифметическое эементов которых БОЛЬШЕ введенного числа" +
            "\n8.Выбрать СТОЛБЦЫ, среднее арифметическое эементов которых БОЛЬШЕ введенного числа")
    var operation = readlnOrNull()?.toIntOrNull()
    when (operation){
        1->fun1(array, arrayX, arrayY)
        2->fun2(array, arrayX, arrayY)
        3->fun3(array, arrayX, arrayY)
        4->fun4(array, arrayX, arrayY)
        5->fun5(array, arrayX, arrayY)
        6->fun6(array, arrayX, arrayY)
        7->fun7(array, arrayX, arrayY)
        8->fun8(array, arrayX, arrayY)
    }
}

fun fun1(array:Array<IntArray>, arrayX:Int , arrayY:Int) {
    print("Введите число: ")
    var t = true
    var number = readlnOrNull()?.toIntOrNull()
    for(i in 0..<arrayX){
        var sum = 0
        for(j in 0..<arrayY){
            sum+=array[i][j]
        }
        if(sum > number!!){
            println(array[i].joinToString (","))
            t = false
        }
    }
    if(t) println("Таких строк нет")
}
fun fun2 (array:Array<IntArray>, arrayX:Int , arrayY:Int) {
    print("Введите число: ")
    var t  = true
    var number = readlnOrNull()?.toIntOrNull()
    for(j in 0..<arrayY){
        var sum = 0
        for(i in 0..<arrayX){
            sum+=array[i][j]
        }
        if(sum < number!!) {
            t = false
            for (i in 0..<arrayY) {
                print("${array[i][j]} ")
            }
        }
        println()
    }
    if(t) println("Таких столбцов нет")
}
fun fun3(array:Array<IntArray>, arrayX:Int, arrayY:Int) {
    var t= true
    for(i in 0..<arrayX){
        var isTrue = true
        for(j in 0..<arrayY){
            if(array[i][j] % 2 != 0) isTrue = false
        }
        if(isTrue) {
            t = false
            println(array[i].joinToString(","))
        }
    }
    if(t) println("Таких строк нет")
}

fun fun4(array:Array<IntArray>, arrayX:Int, arrayY:Int) {
    var t  = true
    for(j in 0..<arrayY){
        var isTrue = true
        for(i in 0..<arrayX){
            if(array[i][j] % 2 != 0) isTrue = false
        }
        if(isTrue) {
            t = false
            for (i in 0..<arrayY) {
                print("${array[i][j]} ")
            }
        }
        println()
    }
    if(t) println("Таких столбцов нет")
}

fun fun5(array:Array<IntArray>, arrayX:Int, arrayY:Int) {
    var t = true
    for(i in 0..<arrayX){
        var isTrue = true
        for(j in 0..<arrayY){
            if(array[i][j] % 2 == 0) isTrue = false
        }
        if(isTrue) {
            t = false
            println(array[i].joinToString(","))
        }
    }
    if(t) println("Таких строк нет")
}


fun fun6(array:Array<IntArray>, arrayX:Int, arrayY:Int) {
    var t = true
    for(j in 0..<arrayY){
        var isTrue = true
        for(i in 0..<arrayX){
            if(array[i][j] % 2 == 0) isTrue = false
        }
        if(isTrue) {
            t = false
            for (i in 0..<arrayY) {
                print("${array[i][j]} ")
            }
        }
        println()
    }
    if(t) println("Таких столбцов нет")
}

fun fun7(array:Array<IntArray>, arrayX:Int, arrayY:Int) {
    var t = true
    print("Введите число: ")
    var number = readlnOrNull()?.toIntOrNull()
    for(i in 0..<arrayX){
        var sum = 0
        for(j in 0..<arrayY){
            sum+=array[i][j]
        }
        if(sum/arrayX > number!!) {
            t = false
            println(array[i].joinToString(","))
        }
    }
    if(t) println("Таких строк нет")
}

fun fun8(array:Array<IntArray>, arrayX:Int, arrayY:Int) {
    var t = true
    print("Введите число: ")
    var number = readlnOrNull()?.toIntOrNull()
    for(j in 0..<arrayY){
        var sum = 0
        for(i in 0..<arrayX){
            sum+=array[i][j]
        }
        if(sum/arrayY > number!!) {
            t = false
            for (i in 0..<arrayY) {
                print("${array[i][j]} ")
            }
        }
        println()
    }
    if(t) println("Таких столбцов нет")
}
