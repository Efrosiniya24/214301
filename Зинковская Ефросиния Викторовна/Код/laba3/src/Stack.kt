class Stack<T> {
    private val stack = mutableListOf<T>()

    private fun processStack(operation: (MutableList<T>) -> T?): T? {
        return operation(stack)
    }

    fun push(element: T) {
        processStack {
            it.add(element)
            null
        }
    }

    fun pop(): T? {
        return if (stack.isNotEmpty()) {
            processStack {
                it.removeAt(it.size - 1)
                stack.lastOrNull()
            }
        } else null
    }

    fun peek(): T? {
        return processStack { it.lastOrNull() }
    }

    fun printStack() {
        println("Стек: ${stack.reversed()}")
    }
}

