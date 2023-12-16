fun main() {
    var cargo:String = "Estagiario";
    when(cargo){
        "Presidente" -> println("seu cargo é: ${cargo} e seu salário é: " + 6000f);
        "Gerente" -> println("seu cargo é: ${cargo} e seu salário é: " + 4500f);
        "Coordenador" -> println("seu cargo é: ${cargo} e seu salário é: " + 3000f);
        "Analista" -> println("seu cargo é: ${cargo} e seu salário é: " + 2400f);
        "Estagiário" -> println("seu cargo é: ${cargo} e seu salário é: " + 1600f);
    else -> println("Cargo não identificado"); //tem que ser exatamente igual, até as letras e acentos.
    }
    var média:Float = 10f;
    when(média){
        7.00f -> println("sua nota é: ${média}, você tá na média");
        10.00f -> println("sua nota é: ${média}, pqp belissima !");
        6.00f -> println("sua nota é: ${média}, se chorar um pouco dou ponto ");
        2.99f -> println("sua média é: ${média}, se fudeu kkkkk");
        0.00f -> println("sua nota é: ${média}, quem é você ?")
        else -> println("Informe a nota"); //tem que ser exatamente igual, até as letras e acentos.
    }
}