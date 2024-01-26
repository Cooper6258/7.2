import java.util.ArrayList;
import java.util.Scanner;
public class Acc {
    
    Scanner a = new Scanner(System.in);
    ArrayList<String> Check_History = new ArrayList<String>();
    ArrayList<String> Credit_History = new ArrayList<String>();

    public void Adds(){ 
        Check_History.add("+32.13");
        Check_History.add("-51.32");
        Check_History.add("-12.91");
        Check_History.add("+135.32");
        Check_History.add("-537.13");
        Check_History.add("+1563.38");
        Check_History.add("-93.50");
        Credit_History.add("-3000.00");
        Credit_History.add("+2000.00");
        Credit_History.add("-3000.00");
        Credit_History.add("-900.00");
        Credit_History.add("+800.00");
        Credit_History.add("+4000.00");
    }


    Double Credit_Balance = 100.00;
    Double Checking_Balance = 533.36;


    public void View(){
        System.out.println("Hello.");
        System.out.println("Your Current Credit Balance is " + Credit_Balance + "/10000");
        System.out.println("Your Current Checking Balance is " + Checking_Balance);
            System.out.println("What would you like to go to your Credit Transactions, Checking Transactions, View Checking, View Credit, Search Checking, Search Credit, or Exit?");
            String options = a.nextLine();

            if(options.equals("Credit Transactions")){
                Credit_Tran();
            }
            if(options.equals("Checking Transactions")){
                Check_Tran();
            }
            if(options.equals("View Checking")){
                View_Check();
            }
            if(options.equals("View Credit")){
                View_Credit();
            }
            if(options.equals("Search Credit")){
                Search_Credit();
            }
            if(options.equals("Search Checking")){
                Search_Check();
            }
            if(options.equals("Exit")){
                Exit();
            }
            else{
                System.out.println("Sorry, that is not an option, try again.");
                View();
            }

    }



    public void Search_Credit(){
        System.out.println("What would you like to find in your credit?");
        String search = a.nextLine();
        for (int i = 0; i < Credit_History.size(); i++){
            if(Credit_History.get(i).equals(search)){
                System.out.println("We found your transaction, it is at positon" + (i));
                View();
            }
            else{
                System.out.println("We could not find your transaction.");
                View();
            }
        }
    }

    public void Search_Check(){
        System.out.println("What would you like to find in your Checking?");
        String search = a.nextLine();
        for (int i = 0; i < Check_History.size(); i++){
            if(Check_History.get(i).equals(search)){
                System.out.println("We found your transaction, it is at positon" + (i));
                View();
            }
            else{
                System.out.println("We could not find your transaction.");
                View();
            }
    }

    public void View_Check(){
        System.out.println("Your Checking History for your account is");
        for (int i = 0; i < Check_History.size(); i++){
            System.out.println(Check_History.get(i));
        }

        System.out.println("Your Checking Balance is");
        System.out.println(Checking_Balance);
        System.out.println("Press enter when ready to leave.");
        a.nextLine();
        View();
    }

    public void View_Credit(){
        System.out.println("Your Credit History for your account is");
        for (int i = 0; i < Credit_History.size();i++){
            System.out.println(Credit_History.get(i));
        }

        System.out.println("Your Credit Balance is");
        System.out.println(Credit_Balance);
        System.out.println("Press enter when ready to leave.");
        a.nextLine();
        View();
    }

    public void Check_Tran(){
        System.out.println("Would you like to add a transaction? yes or no");
        String tran = a.nextLine();
        while(tran.equals("yes")){
            System.out.println("Would you like to add to Checking or pay off Credit?");
            tran = a.nextLine();
            if(tran.equals("Credit")){
                System.out.println("How much would you like to pay off? (put sign in front)");
                String num1 = a.nextLine();
                Credit_History.add(num1);
                Check_History.add(num1);
                Double Num1 = new Double(num1);
                Credit_Balance = Double.sum(Credit_Balance, Num1);
                System.out.println("Would you like to add another transaction?");
                tran = a.nextLine();
                if(tran.equals("no")){
                    View();
                }
                
            }
            if(tran.equals("Checking")){
                System.out.println("How much would you like to add? (put sign in front)");
                String num1 = a.nextLine();
                Check_History.add(num1);
                Double Num1 = new Double(num1);
                Checking_Balance = Double.sum(Checking_Balance, Num1);
                System.out.println("Would you like to add another transaction?");
                tran = a.nextLine();
                if(tran.equals("no")){
                    View();
                }
                
            }
        }
        if(tran.equals("no")){
            View();
        }
        else{
            System.out.println("Sorry, invalid response, try again.");
            Check_Tran();
        }
    }

    public void Credit_Tran(){
        System.out.println("Would you like to add a transaction? yes or no");
        String tran = a.nextLine();
        while(tran.equals("yes")){
            System.out.println("How much would you like to add? (put sign in front)");
            String num1 = a.nextLine();
            Credit_History.add(num1);
            Double Num1 = new Double(num1);
            Credit_Balance = Double.sum(Credit_Balance, Num1);
            System.out.println("Would you like to add another transaction?");
            tran = a.nextLine();
            if(tran.equals("no")){
                View();
            }
        }
        if(tran.equals("no")){
            View();
        }
        else{
            System.out.println("Sorry, invalid response, try again.");
            Check_Tran();
        }
    }

    public void Exit(){
        System.out.println("Thank You for using our bank, come again!");
    }
}
