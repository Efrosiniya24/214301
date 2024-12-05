fun main() {
    val stack = Stack<Int>()
    val queue = Queue<Int>()

    while (true) {
        println(
            """
        Меню:
        1. Стек
        2. Очередь
        3. Выход
    """.trimIndent()
        )

        var operation = readlnOrNull()?.toIntOrNull()
        when (operation){
            1-> steckOperations(stack)
            2-> quequeOperations(queue)
            else -> return
        }
    }
}

fun steckOperations(stack: Stack<Int>){
    while (true){
        println(
            """
        Меню:
        1. Добавить элемент в стек
        2. Удалить элемент из стека
        3. Просмотреть верхний элемент стека
        4. Просмотреть стек
        5. Выход
    """.trimIndent()
        )
        var operation = readlnOrNull()?.toIntOrNull()
        when (operation){
            1-> {
                println("Введите элемент для добавления:")
                var element = readlnOrNull()?.toIntOrNull()
                stack.push(element!!)
            }
            2-> {
                println("Удаление элемента из стека")
                stack.pop()
            }
            3-> {
                var element = stack.peek()
                println("Просмотр верхнего элемента стека $element")
            }
            4-> stack.printStack()
            else -> return
        }
    }
}

fun quequeOperations(queue: Queue<Int>) {
    while (true){
        println(
            """
        Меню:
        1. Добавить элемент в очередь
        2. Удалить элемент из очереди
        3. Просмотреть первый элемент очереди
        4. Просмотреть очередь
        5. Выход
    """.trimIndent()
        )
        var operation = readlnOrNull()?.toIntOrNull()
        when (operation){
            1-> {
                println("Введите элемент для добавления:")
                var element = readlnOrNull()?.toIntOrNull()
                queue.enqueue(element!!)
            }
            2-> {
                var element = queue.dequeue()
                println("Удаление первого элемента $element из очереди")
            }
            3-> {
                var element = queue.peekQueue()
                println("Просмотр верхнего элемента очереди $element")
            }
            4-> queue.printQueue()
            else -> return
        }
    }
}