package ders8

fun main() {
    var sayac = 0

    for (i in 1..5){
        if (i % 2 == 0) {
            println("Bu Adım Atlanıyor.")
            sayac++
            continue
        }
    }

    println("Çifts Sayı Adedi : $sayac")
}