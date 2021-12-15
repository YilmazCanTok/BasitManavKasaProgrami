import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Manav Kasa Programı");
        System.out.println("---------------------------------------------------");
        String malzemeler = "Armut : 2,14 TL\n" + "Elma : 3,67 TL\n" + "Domates : 1,11 TL\n" + "Muz: 0,95 TL\n" + "Patl\u0131can : 5,00 TL";
        System.out.println(malzemeler);
        System.out.println("---------------------------------------------------");
        System.out.print("Alınan Armut Miktarı(kg) : ");
        int armutkilo = scanner.nextInt();
        System.out.print("Alınan Elma Miktarı(kg) : ");
        int elmakilo = scanner.nextInt();
        System.out.print("Alınan Domates Miktarı(kg) : ");
        int domateskilo = scanner.nextInt();
        System.out.print("Alınan Muz Miktarı(kg) : ");
        int muzkilo = scanner.nextInt();
        System.out.print("Alınan Patlıcan Miktarı(kg) : ");
        int patlıcankilo = scanner.nextInt();
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;
        System.out.println("---------------------------------------------------");
        double toplamtutar = (armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlıcan*patlıcankilo);
        System.out.println("Toplam Tutar = "+toplamtutar +" TL");
        System.out.println("***************************************************");
    }
}
