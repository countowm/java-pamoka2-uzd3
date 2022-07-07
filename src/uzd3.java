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
        System.out.println("Įveskite slaptazodi ");
        password = skaitytuvas.next();
        System.out.println("Įveskite pakartotas slaptazodis ");
        pakartotasPassword = skaitytuvas.next();
    }
        public static Boolean arEmailasGeras(String email) {
            if (email.contains("@") && email.contains(".")){
                return true;
                //System.out.println("emailas neturi simbolio @");
            }
            else{
                return false;
            }

        }

        public static boolean slaptazodziai(String login, String password, String pakartotasPassword){
            if (login.equals(password)) {
                //System.out.println("login ir slaptazodis sutampa");
            }
            if (!password.equals(pakartotasPassword)){
                //System.out.println("slaptazodziai nesutampa");
            }

        }
    }

