import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);




        while (true){
           

            try {
                bankAccount.withDraw(6000);
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage() + bankAccount.getAmount());
                try {
                    bankAccount.withDraw(2000);
                }catch (LimitException limitException2){
                    System.out.println(limitException2.getRemainingAmount());
                }
                break;
            }

        }

    }
}