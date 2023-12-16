fun main() {
    var i = 0;
    do {//executa primeiro e depois verifica a condição de parada
        println("${i}");
        i++;
    }while (i != 10);

    while (i==10){ // verificação no fim
        println("loop while");
        i++;
    }
    println("\n");
    do {
        print("qual o deu nome: ");
        val value = readln();
        println("${value}");
    }while (value == "");
}