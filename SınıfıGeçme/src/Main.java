import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int top=0;
        int count = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        if (mat>=0 && mat<=100){
            top +=mat;
            count++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        if (fizik>=0 && fizik<=100){
            top +=fizik;
            count++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();
        if (turkce>=0 && turkce<=100){
            top +=turkce;
            count++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        if (kimya>=0 && kimya<=100){
            top +=kimya;
            count++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();
        if (muzik>=0 && muzik<=100){
            top +=muzik;
            count++;
        }

        double average  = top/count;
        System.out.println(average);
        System.out.println(count);
        if (average<=55){
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!");
        }else {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız: "+average);
    }
}
