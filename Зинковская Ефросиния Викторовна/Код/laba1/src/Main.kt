//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите первую строку: ")
    var firstLine = readlnOrNull()?.replace("[,.!?\\s]".toRegex() ,"")?.uppercase()
    print("Введите вторую строку: ")
    var secondLine = readlnOrNull()?.replace("[,.!?\\s]".toRegex() ,"")?.uppercase()

    var isLineAnagram = firstLine?.toCharArray()?.sortedArray().contentEquals(secondLine?.toCharArray()?.sortedArray())
//    var isLineAnagram = firstLine == secondLine?.reversed()

    if (isLineAnagram)
        println("Строки являются анаграммами")
    else
        println("Строки не являются анаграммами")
}