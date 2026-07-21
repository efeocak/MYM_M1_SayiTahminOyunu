package ders3.alistirmalar

fun main() {
    print("Bugünkü Sepet Tutarınızı Giriniz: ")
    var sepetTutari = readln().toDouble()

    val rastgeleSepetYuzdesi = (10..50).random()
    val indirimTutari = sepetTutari*rastgeleSepetYuzdesi/100
}