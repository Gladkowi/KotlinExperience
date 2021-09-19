fun main(args: Array<String>) {
    var srr = args.joinToString().split(" ").sorted()
    for (i in 0..srr.size - 2){
        if(srr[i] != srr[i + 1] || i == srr.size - 2){
            println(srr[i])
        }
    }
}