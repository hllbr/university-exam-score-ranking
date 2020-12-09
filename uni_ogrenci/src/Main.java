
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*Sayısal sayısal1 = new Sayısal(30, 40, 40, 10);
        Sayısal sayısal2 = new Sayısal(25, 45, 2, 35);
        
        EsitAgırlık esitAgırlık = new EsitAgırlık(30, 20, 40, 2);
        EsitAgırlık esitAgırlık1 = new EsitAgırlık(40, 10, 50, 0);
        Sayısal birinci = birinci(sayısal1, sayısal2);
        System.out.println(birinci+"Sayısal alanda birinci öğrencinin puanıdır.");

        EsitAgırlık biriAgırlık = birinci(esitAgırlık, esitAgırlık1);
        System.out.println(biriAgırlık+"EşitAğırlık alanında birinci öğrencinin puanıdır.");*/
         System.out.println("YGS LYS Birinci Bulma Programı...");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                          + "1. Eşit Ağırlık Öğrencileri Birincisi\n"
                          + "2. Sayısal Öğrencileri Birincisi";
        
                          
        
        System.out.println("*******************************************");
        System.out.println(islemler);
        System.out.println("*******************************************");
         while (true) {
            System.out.print("Çıkış için q'ya basın...");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            // Birinci Öğrenci
            System.out.print("Birinci Öğrenci İsmi : ");
            String isim1 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();
            
            // İkinci Öğrenci
            System.out.print("İkinci Öğrenci İsmi : ");
            String isim2 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
             scanner.nextLine();   
            // Üçüncü Öğrenci
            
            System.out.print("Üçüncü Öğrenci İsmi : ");
            String isim3 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("İşlemi Giriniz : ");
            String islem = scanner.nextLine();
            
            
            if (islem.equals("1")){
                EsitAgırlık ogrenci1 = new EsitAgırlık(turkce1, matematik1, edebiyat1, fizik1,isim1);
                EsitAgırlık ogrenci2 = new EsitAgırlık(turkce2, matematik2, edebiyat2, fizik2,isim2);
                EsitAgırlık ogrenci3 = new EsitAgırlık(turkce3, matematik3, edebiyat3, fizik3,isim3);
                
                EsitAgırlık birinci = birinci(ogrenci1,ogrenci2, ogrenci3);
                
                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());
                
                
                
                
                
            }
            else if (islem.equals("2")){
                Sayısal ogrenci1 = new Sayısal(turkce1, matematik1, edebiyat1, fizik1,isim1);
                Sayısal ogrenci2 = new Sayısal(turkce2, matematik2, edebiyat2, fizik2,isim2);
                Sayısal ogrenci3 = new Sayısal(turkce3, matematik3, edebiyat3, fizik3,isim3);
                
                Sayısal birinci = birinci(ogrenci1,ogrenci2, ogrenci3);
                
                System.out.println("Birinci Sayısal Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());
            }
            
            else {
                System.out.println("Geçersiz İşlem...");
            }
            
        }

    }
        public static <E extends Aday> E birinci(E e1,E e2,E e3) {
        
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            
            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            
            return e2;
        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            
            return e3;
        }
        else {
            return e1;
        }
    }
        public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            
            System.out.println(e);
            
        }
        
}
}
    