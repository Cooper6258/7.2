import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner a = new Scanner(System.in);
        
        Acc b = new Acc();
        b.Adds();


        System.out.println("What is your username?");
        String username = a.nextLine();

        System.out.println("What is your password " + username + "?" );
        String password = a.nextLine();

        if (password.equals("12345")){
            b.View();
        }
        else{
            System.out.println("Sorry, that is a invalid password.");
        }



    }
}
