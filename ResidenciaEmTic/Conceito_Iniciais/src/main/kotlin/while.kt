fun main() {
    var i = 0;
    while (i<10){
       // println(i);
        println("${i}");
        i++;
    }
    println("\n");
    while (i>0){
        println("${i}");
        i--;
    }
    println("\n");
    var str = "curso show";
    var j = 0;
    while (j<str.length){
        println("${j}");
        j++;
    }
    println("\n ${str[0]}");
    println("\n ${str.length}");
}