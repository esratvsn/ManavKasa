import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //Meyveler ve KG Fiyatları
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        double armut=2.14 ,elma=3.67 ,domates=1.11 ,muz=0.95 ,patlican=5.00,total,armutkg,domateskg,muzkg,elmakg,patlicankg;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç kilo armut istersiniz? :");
        armutkg=input.nextDouble();

        System.out.print("Kaç kilo elma istersiniz? :");
        elmakg=input.nextDouble();

        System.out.print("Kaç kilo domates istersiniz? :");
        domateskg=input.nextDouble();

        System.out.print("Kaç kilo muz istersiniz? :");
        muzkg=input.nextDouble();

        System.out.print("Kaç kilo patlıcan istersiniz? :");
        patlicankg=input.nextDouble();
        total=armut*armutkg+elma*elmakg+domates*domateskg+muz*muzkg+patlican*patlicankg;

        System.out.println("Toplam tutarınız: "+ total + " TL");
    }
}