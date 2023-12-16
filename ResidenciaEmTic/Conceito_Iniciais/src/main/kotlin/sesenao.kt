fun main() {
    var idade: Int = 23;
    if (idade >= 18 && idade <= 49) {
        println("adulto");
    } else if (idade >= 1 && idade <= 12) {
        println("criança");
    } else if (idade == 0) {
        println("acabou de nascer");
    }
    else if (idade >=13 && idade <=17) {
        println("adolescente");
    }
    else if (idade >= 50 && idade<=99){
        println("idoso");
    }
    else{
        println("mumia");
    }
}