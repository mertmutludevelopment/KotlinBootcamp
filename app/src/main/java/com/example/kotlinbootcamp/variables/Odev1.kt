package com.example.kotlinbootcamp.variables

fun main() {

    val ilce = "Umraniye"
    val kita = "Avrupa"
    val posta_kodu = "34774"
    val calistigin_bolum = "Mobil Uygulama Geliştirme"
    val isim = "MERT MUTLU"
    val dogum_tarihi = "31.01.2001"
    var telefon_modeli = "SAMSUNG"
    var zam_miktari = 0
    var daire_sayisi = 0
    val enlem = "36-42"
    val boylam = "26-45"
    var bilgisayar_modeli = "Macbook"
    var ulke = "TÜRKİYE"
    val ekran_boyutu = 5


    var faks = "kullanmiyor"
    var linkedin_adresi = "https://www.linkedin.com/in/mertmutluu/"
    var urun_miktari = 10
    var müsteri_soyadi = "Yılmaz"
    var odeme_miktari = 99.90
    var borc = 150.999
    var medeni_hali = "bilinmiyor"
    var video_yorum = "super"
    var odeme_saati = 10.54
    var eft_miktari = 0
    var satilan_miktar = 1
    var dergi_adi = "Penguen"
    var basim_tarihi = "01.01.1990"


    println("-----Kullanıcı Bilgileri------")
    println("Kıta:$kita, Ülke:$ulke, İlçe:$ilce, Posta Kodu:$posta_kodu")
    println()
    println("İsim:$isim, Doğum Tarihi:$dogum_tarihi, Çalıştığı Alan:$calistigin_bolum, LinkedIn:$linkedin_adresi")
    println()
    println(
        "Telefon:$telefon_modeli, Telefon Boyutu:$ekran_boyutu inch, " +
                "Bilgisayar:$bilgisayar_modeli, Bilgisayar boyutu:${ekran_boyutu * 3} inch"
    )

    println("Borç: $borc TL")
    var yeniBorc = borc.toInt()
    println("Yeni Borç: $yeniBorc TL")


}

