class Queue<T> {
    private val queue = mutableListOf<T>()

    private fun processQueue(operation: (MutableList<T>) -> T?):T? {
        return operation(queue)
    }

    fun enqueue(element: T) {
        processQueue {
            it.add(element)
        null
        }
    }

    fun dequeue(): T? {
        return if (queue.isNotEmpty()) {
            val firstElement = queue.first()
            processQueue { it.removeAt(0) }
            firstElement
        } else null
    }

    fun peekQueue(): T? {
        return processQueue { it.firstOrNull() }
    }

    fun printQueue() {
        println("Очередь: $queue")
    }
}
