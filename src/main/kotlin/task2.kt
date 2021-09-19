fun main(args: Array<String>) {
    args.joinToString().split(" ").sorted().forEach {
        println(it)
    }
}