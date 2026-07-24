package ders8

fun main() {
    var bakiye = 500

    while (bakiye > 0) {
        var randomHarcamaTutari = (1..100).random()
        if (randomHarcamaTutari <= bakiye){
            bakiye -= randomHarcamaTutari
        }
        println("Harcama: $randomHarcamaTutari TL, Kalan Bakiye: $bakiye TL")
    }
}