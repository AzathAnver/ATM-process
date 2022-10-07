

class atm extends Main{
    int c_2000=0;
    int c_500=0;
    int c_100=0;
    int total_2000=0;
    int total_500=0;
    int total_100=0;
    int atmbalance=0;

    public int getTotal_2000() {
        return total_2000;
    }
    public void setTotal_2000(int total_2000) {
        this.total_2000 = total_2000;
    }
    public int getTotal_500() {
        return total_500;
    }
    public void setTotal_500(int total_500) {
        this.total_500 = total_500;
    }
    public int getTotal_100() {
        return total_100;
    }
    public void setTotal_100(int total_100) {
        this.total_100 = total_100;
    }
    public int getAtmbalance() {
        return atmbalance;
    }
    public void setAtmbalance(int atmbalance) {
        this.atmbalance = atmbalance;
    }
    public int getc_2000() {
        return c_2000;
    }
    public void setc_2000(int c_2000) {
        this.c_2000 = c_2000;
    }
    public int getc_500() {
        return c_500;
    }
    public void setc_500(int c_500) {
        this.c_500 = c_500;
    }
    public int getc_100() {
        return c_100;
    }
    public void setc_100(int c_100) {
        this.c_100 = c_100;
    }
    public void upadate_cash(int c_2000, int c_500, int c_100) {
        this.c_2000+=c_2000;
        this.c_500+=c_500;
        this.c_100+=c_100;
        total_2000=c_2000*2000;
        total_500=c_500*500;
        total_100=c_100*100;
        atmbalance=total_2000+total_500+total_100;
        return;
    }
    public boolean update_withdrawl(int amt,int _2000c,int _500c,int _100c) {
        if(_2000c<=c_2000&&_500c<=c_500&&_100c<=c_100) {
            c_2000-=_2000c;
            c_500-=_500c;
            c_100-=_100c;
            total_2000-=_2000c*2000;
            total_500-=_500c*500;
            total_100-=_100c*100;
            atmbalance-=amt;
            return true;
        }
        return false;
    }
}
