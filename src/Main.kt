package src
fun perigo() {
    println("Os batimentos cardíacos estão acima da média, desligue o aparelho imediatamente")
}

fun main() {
    var batimentos = 200
    var media = 150
    var diferenca = batimentos - media
    var i = 0
    if (batimentos > media) {
        perigo()
        println("A diferenca é $diferenca")
    }
}