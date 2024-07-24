import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Account{
    String password;
    int AccountBalance=0;
    Scanner scanner1 = new Scanner(System.in);
    int amount=0;
    int Doer(String input,int acc_balance){
        switch(input){
            case "Withdraw":
                System.out.print("Enter amount to withdraw: ");
                amount = scanner1.nextInt();
                acc_balance -= amount;
                return acc_balance;
            case "Deposit":
                System.out.print("Enter amount to deposit: ");
                amount = scanner1.nextInt();
                acc_balance += amount;
                return acc_balance;
            case "Balance_check":
                return acc_balance;
            default:
                System.out.println("Invalid");
                return acc_balance;
        }
    }
    void read(){
        System.out.print("Enter operation (Withdraw, Deposit, Balance_check): ");
        String giveinput =scanner1.nextLine();
        AccountBalance=Doer(giveinput,0);
    }
}
class User extends Account{
    String name;
    User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
class Banking{
    static Scanner scanner=new Scanner(System.in);
    static Map<String,User> Details=new HashMap<>();
    public static void main(String[] args) {
        while(true){
            System.out.print("Enter username: ");
            String Username=scanner.nextLine();
            if(Details.containsKey(Username)){
                User account = Details.get(Username);
                System.out.println("Enter the password");
                String input =scanner.nextLine();
                if(account.password.equals(input)){
                    account.read();
                    Display(Username);
                }
                else{
                    System.out.println("Incorrect Password");
                }
            }
            else{
                System.out.println("Could not find your account");
                addAccount(Username);
            }
        }
    }
    static void addAccount(String username) {
            System.out.print("Enter password: ");
            String Pass=scanner.nextLine();
            User input = new User(username,Pass);
            Details.put(username, input);
    }
    static void Display(String name){
        User account = Details.get(name);
        System.out.println("Balance: " + account.AccountBalance);
    }
}