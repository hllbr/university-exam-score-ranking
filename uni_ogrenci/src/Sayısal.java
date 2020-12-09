
public class Sayısal extends Aday{

    public Sayısal(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    public int puanHesapla() {
        return getTurkce()*3+getMatematik()*5+getFizik()*5+getEdebiyat()*1;
       
    }
    
}
