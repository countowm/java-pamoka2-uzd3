import java.util.Scanner;

public class uzd3 {
    public static void main(String[] args) {
        String login;
        String email;
        String password;
        String pakartotasPassword;

        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite login ");
        login = skaitytuvas.next();
        System.out.println("Įveskite email ");
        email = skaitytuvas.next();
        if (email.contains("@")){
        }else{
            System.out.println("emailas neturi simbolio @");
        }
        if (email.contains(".")){
        }else{
            System.out.println("emailas neturi simbolio .");
        }
        System.out.println("Įveskite slaptazodi ");
        password = skaitytuvas.next();
        if (login == password);{
            System.out.println("login ir slaptazodis sutampa");
        }
        System.out.println("Įveskite pakartotas slaptazodis ");
        pakartotasPassword = skaitytuvas.next();
    }
}
