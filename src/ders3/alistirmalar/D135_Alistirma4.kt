package ders3.alistirmalar

fun main() {
    var ejderhaCani = 1000.0

    print("Kullanıcı Adınızı Giriniz: ")
    var kullaniciAdi = readln()
    print("Temel Saldırı Gücününüzü Giriniz: ")
    var saldiriGucu = readln().toDouble()

    var randomKritikBonusu = (10..50).random()
    var toplamHasar = saldiriGucu + randomKritikBonusu

    var ejderhaCanSon = ejderhaCani - toplamHasar

    println("Merhaba Savaşçı! İşte bu karşılaşmanın İstatistikleri:")
    println("Ejderhaya Verilen Gerçek Hasar: $saldiriGucu Kadar!")
    println("Ejderhaya Verlilen Kritik Hasar: $randomKritikBonusu Kadar!")
    println("Ejderhaya Verilen Toplam Hasar: $toplamHasar Kadar!")
    println("Ejderhanın Kalan Canı İse: $ejderhaCanSon")
    println("Cesurca Dövüştün Savaşçı Sonraki Sefere Kılıcını Daha İyi Bile!")
}