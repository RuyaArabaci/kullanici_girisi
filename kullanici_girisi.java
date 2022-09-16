
package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class kullanici_girisi {

    public static void main(String[] args) {
        String userName,password,newpassword,karar;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

//Burada kullanıcı adı ve şifre belirliyoruz. Ben kullanıcı adını 'patika.dev', şifreyi ise 'java101' olarak belirledim.

        if (userName.equals("patika.dev") && password.equals("java101")) {
            System.out.println("Giriş başarılı!");
        } else if (userName.equals("patika.dev") && password != "java101") {
            System.out.print("Şifre hatalı.Şifrenizi sıfırlamak ister misiniz?(e/h): ");
            karar = input.nextLine();
            if (karar.equals("e")) {
                System.out.println("NOT: Yeni şifreniz eskisiyle ya da önceki girdiğinizle aynı olamaz.");
                System.out.print("Yeni şifrenizi giriniz: ");
                newpassword = input.nextLine();
                if (newpassword.equals(password) || newpassword.equals("java101")) {
                    System.out.println("Şifre oluşturulamadı.");
                } else {
                    password = newpassword;
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        } else {
            System.out.println("Giriş hatalı.tekrar deneyiniz.");
        }
    }
}
