package June_10_2020;

public class IfExample {

    public static void main(String[] args) {
        int RequestedWithdrawalAmount = 51;
        int accountBalance = 100;

        //Simple if
        if (RequestedWithdrawalAmount < 40){
            System.out.println("He is young");
        }

        //If else
        if (RequestedWithdrawalAmount < 40){
            System.out.println("He is young");
        }else{
            System.out.println("He is adult");
        }

        //If Else If example
        if (RequestedWithdrawalAmount < accountBalance) {
            System.out.println("Withdraw success");
        }else if (RequestedWithdrawalAmount <50){
            System.out.println("He is less than 50");
        }else if (RequestedWithdrawalAmount <60){
            System.out.println("He is less than 50");
        }else if (RequestedWithdrawalAmount <70){
            System.out.println("He is less than 50");
        }else{
            System.out.println("Insufficient balance");
        }
        //Nested if
        //Simple if
        int dailyLimit = 10;
        if (RequestedWithdrawalAmount < 100){
            if (RequestedWithdrawalAmount < dailyLimit){
                System.out.println("Ohh - You exceeded daily withdrawal limit");
            }
        }


    }
}
