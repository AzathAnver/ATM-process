import java.util.Scanner;
//import CD_ATM.customer_infoDetails;
class atmfunc extends Main{
    customer_info obj1;
    Scanner sc=new Scanner(System.in);
    public atmfunc() {
        System.out.println("-------------ATM Operations--------------");
        System.out.println("1)Check Balance");
        System.out.println("2)Withdraw Money");
        System.out.println("3)Transfer Money");
        System.out.println("4)Check ATM balance");
        System.out.println("5)Deposit amount");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                checkbalance();
                break;
            case 2:
                withdrawmoney();
                break;
            case 3:
                transfermoney();
                break;
            case 4:
                atmbalance();
                break;
            case 5:
                DepositAmount();
                break;

        }
    }
    void checkbalance() {
        System.out.println("Enter Pin");
        int pin=sc.nextInt();
        for(customer_info customerdeatail: detail)
        {
            if(customerdeatail.getsPin()==pin){
                System.out.println(customerdeatail.getBalance());

            }
        }
    }
    void withdrawmoney() {
        System.out.println("Enter Pin");
        int pin=sc.nextInt();
        for(customer_info customerdeatail: detail)
        {
            if(customerdeatail.getsPin()==pin){
                obj1=customerdeatail;
                int amt;
                int flag=1;
                do {
                    System.out.println("Enter Amount Multiples by 100 and less than 10000:");
                    amt=sc.nextInt();
                    if(amt>=100&&amt<=10000) {
                        flag=0;
                    }
                }while(flag!=0);
                int _2000count=0,_500count=0,_100count=0;
                int amt_copy=amt;
                while(amt>100)
                {	if(amt>=2000) {
                    _2000count++;
                    amt-=2000;
                }
                else if(amt>=500&&amt<2000) {
                    _500count++;
                    amt-=500;
                }
                else if(amt>=100&&amt<100) {
                    _100count++;
                    amt-=100;
                }
                }
                customerdeatail.customercashupdate(obj1,amt_copy, _2000count,_500count ,_100count);
            }
        }
    }
    void transfermoney() {
        System.out.println("Enter pin");
        int pin=sc.nextInt();
        for(customer_info customerdeatail: detail)
        {
            if(customerdeatail.getsPin()==pin){
                customer_info obj1=customerdeatail;
                moneyupdate(obj1);
            }
        }
    }
    void  moneyupdate(customer_info obj) {
        System.out.println("Enter account number to transfer");
        int accno=sc.nextInt();
        for(customer_info customerdeatail1: detail)
        {
            if(customerdeatail1.getAccNo()==accno){
                int amt;
                do {
                    System.out.println("Enter Amount less than 10000:");
                    amt=sc.nextInt();
                }while(amt>10000);

                if(obj.balance>=amt) {
                    obj.balance-=amt;
                    customerdeatail1.balance+=amt;
                    System.out.println("Amount transfered successfully!");
                }
            }
        }
    }
    void atmbalance() {
        displayatmdenomenation();
    }
    void DepositAmount() {
        System.out.println("Enter pin");
        int pin=sc.nextInt();
        for(customer_info customerdeatail: detail)
        {
            if(customerdeatail.getsPin()==pin){
                System.out.println("Enter Amount to Deposit:");
                int amount=sc.nextInt();
                customerdeatail.balance+=amount;
            }
        }
    }

}