package ders3.alistirmalar

fun main() {

    print("Lütfen yaşadığınız Şehri Giriniz: ")
    val yasananSehir = readln()

    print("Bugünün En Düşük Sıcaklığını Giriniz: ")
    val enDusukSicaklik = readln().toDouble()

    print("Bugünün En Yüksek Sıcaklığını Giriniz: ")
    val enYuksekSicaklik = readln().toDouble()

    val sicaklikOrtalama = (enYuksekSicaklik + enDusukSicaklik) / 2.0
    val formatliSicaklikOrtalama = "%.2f".format(sicaklikOrtalama)

    println("Burası $yasananSehir, Bugünün Sıcaklık $enDusukSicaklik ile $enYuksekSicaklik Arasında Değişecek, Bugünün Ortalama Sıcaklığı İse: $formatliSicaklikOrtalama")
}