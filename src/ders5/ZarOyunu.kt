package ders5

fun main() {
    print("Lütfen 1 ve 6 arasında bir sayı giriniz: ")
    val girilenSayi = readln().toIntOrNull()

    if (girilenSayi == null) {

        println("Geçersiz giriş yaptınız, lütfen sadece rakam kullanın!")


    } else if (girilenSayi < 1 || girilenSayi >6){
        print("Lütfen Sınırlar İçinde Bir Sayı Giriniz!")
    } else {
        val randomZar = (1..6).random()

        if (girilenSayi < randomZar) {
            print("Daha Küçük Bir Sayı Seçtiniz!")
        } else if (randomZar < girilenSayi) {
            print("Daha Büyük Bir Sayı Seçtiniz!")
        } else {
        print("Tebrikler Doğru Sayı Seçtiniz!")
        }
    }
    }
