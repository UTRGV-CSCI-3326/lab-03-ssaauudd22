public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37; //starting balance

        //withdrawing $302.50
        balance -= 302.50;
        System.out.printf("Balance: $%.2f%n", balance);
        
        //deposits $50.03
        balance += 50.03;
        System.out.printf("Balance: $%.2f%n", balance);
                
        //withdrew half
        balance /= 2;
        System.out.printf("Balance: $%.2f%n", balance);
                
        //deposits $20.00
        balance += 20.00;
        System.out.printf("Balance: $%.2f%n", balance);
                
        //withdrew $1.00\
        balance -= 1.00;
        System.out.printf("Balance: $%.2f%n", balance);
                
        //deposits paycheck
        balance *= 2;
        System.out.printf("Balance: $%.2f%n", balance);
        
        //deposits $1.00
        balance += 1.00;
        
        System.out.printf("Final Balance: $%.2f%n", balance);

    }
}
