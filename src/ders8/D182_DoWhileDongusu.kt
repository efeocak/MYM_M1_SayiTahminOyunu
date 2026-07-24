package ders8

fun main() {
    //Do While Dongüsü Koşul False olsa bile en az 1 kere çalışır
    var sayac = 1

    do {
    println("Sayaç Değeri: $sayac")
        sayac++
    } while (sayac < 1)

    //Şifre Kontrolü Örneği
    var sifre: String
    var dogruSifre = "12345"
    var deneme = 3

    do {
    print("Şifrenizi Giriniz: ")
        sifre = readln()

        if (sifre != dogruSifre) println("Yanlış Şifre. Tekrar Deneyiniz!")
        deneme--

    } while (sifre != dogruSifre && deneme > 0)

    if(deneme != 0) println("Sisteme Giriş Yapıldı!")
    else println("Deneme Hakkınız Bitti")





}

