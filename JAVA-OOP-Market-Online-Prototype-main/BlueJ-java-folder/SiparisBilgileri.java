public class SiparisBilgileri extends Kontrolor
{
    private String Adet;
    private String Urun;
    private String KargoUcreti;
    private double Fiyat;

   
    public SiparisBilgileri()
    {
       
    }

    
    public String getUrunAdi(){
        return Urun;
    }
    
    public double getToplamFiyat(){
        return Fiyat;
    }
    
    public String getUrunAdeti(){
        return Adet;
    }
    
    public String getKargoUcret(){
        return KargoUcreti;
    }
    
    public String setUrunAd(String p_Urun){
        String Urun;
        Urun = p_Urun;
        return Urun;
    }
    
    public double setToplamFiyat(double p_Fiyat){
        double Fiyat;
        Fiyat = p_Fiyat;
        return Fiyat;
    }
    
    public String setUrunAdeti(String p_Adet){
        String Adet;
        Adet = p_Adet;
        return Adet;
    }
    
    
    public String setKargoUcret(String p_KargoUcreti){
        String KargoUcreti;
        KargoUcreti = p_KargoUcreti;
        return KargoUcreti;
    }
    
    
    
    
    
    
    
    
}
