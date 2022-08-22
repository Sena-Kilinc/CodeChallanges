import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        username=inp.nextLine();
        System.out.print("Şifreniz: ");
        password=inp.nextLine();
        if (username.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş yapıldı.");
        }else if(!username.equals("patika")){
            System.out.println("Kullanıcı adınız yanlış!");
        }else {
            System.out.println("Şifreniz yanlış. Sıfırlamak ister misiniz? Evet/Hayır");
            String answer= inp.nextLine();
            if (answer.equals("Evet")){
                System.out.print("Şifreyi sıfırlamayı kabul ettiniz.\nYeni şifrenizi giriniz: ");
                String newpass= inp.nextLine();
                if (newpass.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }else{
                System.out.println("Giriş başarısız.");
            }
        }



    }
}
