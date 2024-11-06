public class OdemeBilgileri extends Kontrolor
{
    private String KartTuru;
    private String OdemeTuru;
    private String Banka;
    private String KartNumarası;
    
    public OdemeBilgileri()
    {
        
    }

    public String getOdemeTuru(){
        return OdemeTuru;
    }
    
    public String getKrKartTuru(){
        return KartTuru;
    }
    
    public String getKullanılanBanka(){
        return Banka;
    }
    
    public String getKrKartNumarası(){
        return KartNumarası;
    }
    
    public String setOdemeTuru(String p_odeme){
        String OdemeTuru;
        OdemeTuru = p_odeme;
        return OdemeTuru;
    }
    
    public String setKrKartTuru(String p_KartTur){
        String KartTuru;
        KartTuru = p_KartTur;
        return KartTuru;
    }
    
    
    public String setKartBanka(String p_KrKartBanka){
        String Banka;
        Banka = p_KrKartBanka;
        return Banka;
    }
    
    public double setKrKartNumarası(double p_KrediKartNu){
        double KartNumarası;
        KartNumarası = p_KrediKartNu;
        return KartNumarası;
     }
    
    
    
}
