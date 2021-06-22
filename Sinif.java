import java.util.Scanner;
public class Sinif {
    public static void main(String[] args) {
        int mat,fzk,kmy,trk,mzk,ort;
        Scanner deger= new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat= deger.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fzk= deger.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kmy= deger.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        trk= deger.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        mzk= deger.nextInt();
        if((mat<=100) &&(fzk<=100) &&(kmy<=100) &&(trk<=100) &&(mzk<=100)){
        ort=(mat+fzk+kmy+trk+mzk)/5;
        System.out.println("Ortalamanız: " +ort);
        System.out.println( ort >= 55 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız" );}
    }
}
