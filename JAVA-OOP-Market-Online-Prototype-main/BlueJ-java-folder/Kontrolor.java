public class Kontrolor
{
    private UrunBilgileri v_UrunBilgileri;
    private MusteriBilgileri v_MusteriBilgileri;
    private SiparisBilgileri v_SiparisBilgileri;
    private OdemeBilgileri v_OdemeBilgileri;
   
    public Kontrolor(){
        v_UrunBilgileri = new UrunBilgileri();
        v_MusteriBilgileri = new MusteriBilgileri();
        v_SiparisBilgileri = new SiparisBilgileri();
        v_OdemeBilgileri  = new OdemeBilgileri();

    }
    
    protected void Yaz(){
        System.out.println("Musteri Adı:");
        System.out.println("Musteri Soyadı:");
        System.out.println("Musteri Telefon:");
    }
    
    public void UrunFiyat(){
        String UrunFiyat;
        UrunFiyat = v_UrunBilgileri.getUrunFiyat();
        System.out.println("Fiyat Giriniz = " + UrunFiyat);
    }
    
    public void odemeTuruSec(){
        String odemeTuru;
        odemeTuru = v_OdemeBilgileri.getOdemeTuru();
        System.out.println("Ödeme Yöntemi Seçiniz: " + odemeTuru);
    }
    
    public void MusteriAdıAl(){
        String MusteriAd;
        MusteriAd = v_MusteriBilgileri.getAdi();
        System.out.println("Kullanıcı Adı Giriniz: "+ MusteriAd);
    }
    
    
    public void krKartNumarasıAl(){
    double krKartNumarası;
    krKartNumarası = v_MusteriBilgileri.getkrKartNumarası();
    System.out.println("Kredi Kartı Numarasını Giriniz: "+ krKartNumarası);
    
    }
    
    
    public void urunAdAl(){
        String UrunAdi;
        UrunAdi = v_SiparisBilgileri.getUrunAdi();
        System.out.println("Urun adını giriniz: " + UrunAdi);
    }
   
}  
