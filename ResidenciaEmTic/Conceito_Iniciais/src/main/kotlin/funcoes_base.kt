import java.util.SortedMap

fun imprimir(){//sem paramentros e sem retorno
    println("Imprima ai")
}
fun soma(a:Int, b: Int):Int{//com parametro e com retorno
    return a + b
}
fun soma2(a:Int, b:Int){//com parametro e sem retorno
    println("A resposta é ${a + b}")
}
fun main() {
    var x = 1
    var y = 2
    println(soma(x,y))
    imprimir()
    soma2(x, y)
}