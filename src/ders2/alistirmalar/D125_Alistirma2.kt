package ders2.alistirmalar

fun main() {
//String, Int, Double ve Boolean tiplerini birlikte kullanarak senaryolar kurgulayalım.
//
//🛒 Mini Market Otomasyonu: Tek bir alışveriş kalemini modelleyin. Ürün adı (String), alınacak adet (Int),
// birim fiyat (Double) ve ürünün stokta olup olmadığı (Boolean) bilgilerini değişkenlere atayın.
// Adet ile birim fiyatı çarparak ara toplamı hesaplayın ve tüm bu bilgileri konsola düzenli bir şekilde yazdırın.
//🌡 Şehir Hava Durumu Paneli: Yaşadığınız şehrin adını, anlık sıcaklığını ve nem oranını değişkenlere atayın.
// Bu atamaları yaparken tipleri açıkça yazmayın, bırakın Kotlin otomatik algılasın.
// Ancak, klimaların ulaşmasını istediğiniz “hedef sıcaklık” değerini tanımlarken,
// tipin kesinlikle Double olmasını sağlamak için tipi (: Double) olarak açıkça belirtin.

    val urunAdi = "Patates"
    val urunAdedi = 20
    val urunFiyati = 2.5
    val stoktaVarMi = true

    val araToplam = urunAdedi * urunFiyati

    println("Ürün Adı: " + urunAdi)
    println("Ürün Fiyatı: " + urunFiyati)
    println("Stokta Var Mı: " + stoktaVarMi)
    println("Toplam Fiyat: " + araToplam)


























}