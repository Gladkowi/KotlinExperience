fun main(args: Array<String>) {
    var srr = args.joinToString().split(" ").sorted()

    var count = 1
    var p = 0

    class Person constructor(word: String, count: Int) {
        val word: String = word
        val count: Int = count
    }

    var numbers: MutableList<Person> = mutableListOf()

    for (i in 0..srr.size - 2){
        if(srr[i] != srr[i + 1]){
            numbers.add(Person(srr[i], count))
            p++
            count = 1
        } else {
            count++
        }
        if(i == srr.size - 2){
            numbers.add(Person(srr[i + 1], count))
            p++
        }
    }


    for (i1 in 0 until numbers.size) {
        for (o in 0 until numbers.size - 1) {
            if(numbers[o].count == numbers[o + 1].count)
            {
                if (numbers[o].word > numbers[o + 1].word)
                {
                    val peremen = numbers[o + 1]
                    numbers[o + 1] = numbers[o]
                    numbers[o] = peremen
                }
            } else {
                if (numbers[o].count < numbers[o + 1].count)
                {
                    val peremen = numbers[o + 1]
                    numbers[o + 1] = numbers[o]
                    numbers[o] = peremen
                }
            }
        }
    }

    for (entry in numbers) {
        println(entry.word + " " + entry.count)
    }
}