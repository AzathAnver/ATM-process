import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<customer_info> detail=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    static void atmoperation() {
        atmfunc ob=new atmfunc();

    }
    static void RefillAtm() {
        System.out.println("----------Load to Cash---------");
        System.out.println("Enter note count->");
        System.out.println("Enter count_2000");
        int _2000=sc.nextInt();
        System.out.println("Enter count_500");
        int _500=sc.nextInt();
        System.out.println("Enter count_100");
        int _100=sc.nextInt();
        a.upadate_cash(_2000,_500,_100);
        displayatmdenomenation();
    }
    static void customerdetails() {
        customer_info c1=new customer_info(101,"Suresh",2343,25234);
        customer_info c2=new customer_info(102,"Ganesh",5432,34123);
        customer_info c3=new customer_info(103,"Magesh",7854,26100);
        customer_info c4=new customer_info(104,"Naresh",2345,80000);
        customer_info c5=new customer_info(105,"Harish",1907,103400);
        detail.addAll(Arrays.asList(c1,c2,c3,c4,c5));
    }
    static void displaydetails() {
        System.out.println("------------------------Customer Details-----------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%8s %20s %12s %16s", "Acc No", "Account Holder", "Pin Number", "Account Balance");
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        for(customer_info customerdeatail: detail)
        {
            System.out.format("%7s %14s %14s %16s",customerdeatail.getAccNo(), customerdeatail.getAhName(), customerdeatail.getsPin(), customerdeatail.getBalance());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
        System.out.print("\n");
    }
    static void displayatmdenomenation() {
        System.out.println("------------------Atm Balance-------------------");
        System.out.println("---------------------------------------------");
        System.out.printf("%8s %12s %12s ", "Denomination", "Number", "Value");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.format("%7s %16s %12s ","2000", a.getc_2000(),a.getTotal_2000());
        System.out.println();
        System.out.format("%7s %16s %12s ","500",a.getc_500(),a.getTotal_500());
        System.out.println();
        System.out.format("%7s %16s %12s ","100", a.getc_100(),a.getTotal_100());
        System.out.println();
        System.out.println("---------------------------------------------- ");
        System.out.print("\n");
    }



    static atm a=new atm();
    public static void main(String[] args) {
        customerdetails();
        a.upadate_cash(20, 100, 100);
        int choice;
        do {
            System.out.println("-------------CustomerDetails&AtmProcess-------------");
            System.out.println("1)Load Cash to ATM");
            System.out.println("2)Atm Balance");
            System.out.println("3)Customer Details");
            System.out.println("4)ATM Operations");
            System.out.println("Enter Choices to do Reqired Operation");
            choice=sc.nextInt();
            switch(choice) {
                case 1:
                    RefillAtm();
                    break;
                case 2:
                    displayatmdenomenation();
                    break;
                case 3:
                    displaydetails();
                    break;
                case 4:
                    atmoperation();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice!");

                    break;
            }
        }while(choice!=5);

    }
}
