class customer_info extends Main{
    int accNo;
    String ahName;
    int sPin;
    int balance;
    public customer_info(int accNo, String ahName, int sPin, int balance) {
        super();
        this.accNo = accNo;
        this.ahName = ahName;
        this.sPin = sPin;
        this.balance = balance;
    }
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getAhName() {
        return ahName;
    }
    public void setAhName(String ahName) {
        this.ahName = ahName;
    }
    public int getsPin() {
        return sPin;
    }
    public void setsPin(int sPin) {
        this.sPin = sPin;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void updatebalaance(int amt) {
        balance-=amt;
        return;
    }
    void customercashupdate(customer_info obj,int amt,int _2000c ,int _500c ,int _100c ) {
        if(amt<=obj.balance) {
            if(a.update_withdrawl(amt,_2000c ,_500c ,_100c )) {
                obj.updatebalaance(amt);
            }
            else {
                System.out.println("Sorry Atm Balance Is Low");
            }
        }
        else {
            System.out.println("Sorry Your Acc  Balance Is Low");
        }
        return;
    }

}
