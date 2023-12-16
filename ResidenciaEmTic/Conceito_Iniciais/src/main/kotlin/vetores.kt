fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 2 .. numeros.size-1){
        println("${numeros[i]} ")
    }
    print("\n")
}
fun main() {
    vetor_inteiros()
}