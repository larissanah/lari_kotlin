fun perigo() {
    println("Os batimentos cardíacos estão acima da média, desligue o aparelho imediatamente")
}

fun saudavel() {
    println("Os batimentos cardíacos estão ok")
}

fun main() {
    var batimentos = 100
    var media = 150
    var diferenca = batimentos - media
    if (batimentos > media) {
        perigo()
    }
    else {
        saudavel()
        println("batimentos: $batimentos")
        println("media: : $media")
    }
}