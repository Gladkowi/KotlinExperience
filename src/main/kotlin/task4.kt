fun main(args: Array<String>) {
    var srr = args.joinToString().split(" ").sorted()
    var count = 1
    for (i in 0..srr.size - 2){
        if(srr[i] != srr[i + 1]){
            println(srr[i] + " " + count)
            count = 1
        } else {
            count++
        }
        if(i == srr.size - 2){
            println(srr[i+1] + " " + count)
        }
    }
}