public class UrunBilgileri extends Kontrolor
{
    private String UrunAdi;
    private String Stogu;
    private String UrunFiyat;
    private int barkod;
    private String Kategori;
    public UrunBilgileri()
    {
      
    
    }
    
    public UrunBilgileri(String p_UrunFiyat){
        UrunFiyat=p_UrunFiyat;
    }

    
    public UrunBilgileri(String p_UrunFiyat, String p_UrunAdi, int p_barkod, String p_Kategori){
        UrunFiyat=p_UrunFiyat;
        UrunAdi=p_UrunAdi;
        barkod=p_barkod;
        Kategori=p_Kategori;

    }
    
    
    public String getUrunFiyat(){
        return UrunFiyat;
    }
    
    public void setFiyat(String p_UrunFiyat){
        UrunFiyat=p_UrunFiyat;
    }
    
    public String getUrunAdi(){
        return UrunAdi;
    }
    
    public void setUrunAdi(String p_UrunAdi){
        UrunAdi=p_UrunAdi;
    }
    
    public int getbarkod(int p_barkod){
        int barkod;
        barkod=p_barkod;
        return barkod;
    }
    
    public String getKategori(String p_Kategori){
        String Kategori;
        Kategori=p_Kategori;
        return Kategori;
    }
    
    
    
    
    
    
    
   
}

