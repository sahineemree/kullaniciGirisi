import java.util.*;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName , password;
         Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("emre") && password.equals("1234"))
        {

            System.out.println("Giriş başarılı !");

        }else
        { System.out.println("Giriş başarısız !");

        }
    }
}