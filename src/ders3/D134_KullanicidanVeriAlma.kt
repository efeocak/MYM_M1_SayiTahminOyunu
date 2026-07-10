package ders3

fun main() {
    print("Adınızı Girin: ")
    val isim = readln()

    print("Kilonuzu Giriniz: ")
    val kilogram = readln().toDouble()

    val dunyaAgirligi = kilogram*10
    val marsAgirligi = dunyaAgirligi*0.38
    val formatliMarsAgirligi = "%.2f".format(marsAgirligi)


    println("Adınız: $isim, Kilonuz: $kilogram kg, Dünya Ağırlığınız: $dunyaAgirligi N")
    println("Mars'taki Ağırlığınız: $formatliMarsAgirligi N")
}