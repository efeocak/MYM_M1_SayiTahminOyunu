package ders3.alistirmalar

fun main() {

    print("Adınızı Giriniz: ")
    val kullaniciAdi = readln()
    print("Boyunuzu Giriniz (cm Türünden): ")
    val kullaniciBoyu = readln().toDouble()
    print("Kilonuzu Giriniz: ")
    val kullaniciKilo = readln().toDouble()

    val kullaniciBoyuMetre = kullaniciBoyu/100
    val kullaniciVucutKitleEndeksi = kullaniciKilo/(kullaniciBoyuMetre*kullaniciBoyuMetre)
    val formatliVucutKitleEndeksi = "%.2f".format(kullaniciVucutKitleEndeksi)


    println("Vücut Kitle Endeksiniz: $formatliVucutKitleEndeksi")













}