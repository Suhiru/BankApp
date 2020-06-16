import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private int customerId;

	//Constructor that has two parameters 
    public BankAccount(String customerName,int customerId){

        this.customerName=customerName;
        this.customerId=customerId;

    }

    public void deposit(int amount){


        if(amount!=0){

            balance+=amount;
            previousTransaction=amount;
        }
    }

    public void withdraw(int amountX){

        if(amountX!=0){

            balance-=amountX;
            previousTransaction= -amountX;
        }

    }

	//this method shows previous trasactions that the customer has done
    public void showPreviousTransaction(){

        if (previousTransaction<0){
            int x=Math.abs(previousTransaction);
            System.out.print("withdrew: "+x);
        }else{

            System.out.print("Deposited: "+previousTransaction);
        }
    }

    
    public void showMenu(){   //Menu

        char command='\0';
       System.out.println("*********************************************************");
        System.out.println("Hello Mr "+customerName+" Welcome to Bank of Italy ");
        System.out.println("Your customer id is: "+customerId);
        System.out.println();
        System.out.println();
        System.out.println("please follow the instructions below");
        System.out.println("*********************************************************");

        Scanner input=new Scanner(System.in);

        do{ System.out.println("Type A to check your account balance");
        System.out.println("Type B to deposit");
        System.out.println("Type C to withdraw");
        System.out.println("Type D to check the previous transaction");
        System.out.println("Type E to exit");
           System.out.println("---->");

      command=input.next().charAt(0);

        switch(command) {

            case 'A':
                System.out.println("*********************************");
                System.out.println("Your Account balance is: "+balance);
                System.out.println("*********************************");
                break;

            case 'B':
                System.out.println("-------------------------------------");
                System.out.print("Enter the amount you want  to deposit: ");
                System.out.println("-------------------------------------");
                int amount=input.nextInt();
                deposit(amount);
                System.out.println("*********************************");
                System.out.println("Deposited Rs."+amount);
                System.out.println("*********************************");
                break;

            case 'C':
                System.out.println("-------------------------------------");
                System.out.println("Enter the amount you want  to withdraw: ");
                System.out.println("-------------------------------------");
                int amountX=input.nextInt();
                withdraw(amountX);
                System.out.println("*********************************");
                System.out.println("Withdrawn Rs."+amountX);
                System.out.println("*********************************");
                break;

            case 'D':

                System.out.println("*********************************");
                showPreviousTransaction();
                System.out.println("*********************************");
                break;


            case 'E':

                    System.out.println("*********************************");
                     System.out.println("Thank you for using our service");
                    System.out.println("*********************************");
                    break;

            default:
                System.out.println("*********************************");
                System.out.println("Please enter a valid input");
                System.out.println("*********************************");
                break;
        }


    }while(command!='E');

        System.out.println("*********************************");
        System.out.println("See you again!");
        System.out.println("*********************************");
    }

}
