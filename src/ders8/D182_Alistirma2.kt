package ders8

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    var secim: String

    do {
    print("Oyun bitti.Tekrar oynamak ister misiniz? (E/H): ")
        secim = readln().trim().lowercase(getDefault())
    } while (secim == "e")

    print("Uygulama Kapatıldı")




}