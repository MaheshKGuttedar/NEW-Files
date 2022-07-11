public class Banking {
    private String name;
    private  String email;
    private long Acc_no;
    private float Amount;

    private int withdraw;

    public String getName(){

        return this.name;
    }

    public void  setName(String name){

        this.name=name;
    }

    public String getEmail(){
        return  this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public float getAmount(){
        return this.Amount;
    }
    public void setAmount(float Amount){
        this.Amount=Amount;
    }
    public long getAcc_no(){
        return this.Acc_no;
    }

    public  void setAcc_no(long Acc_no){
        this.Acc_no = Acc_no;
    }

    public int getWithdraw(){
        return  this.withdraw;
    }

    public void setWithdraw(int withdraw){
        this.withdraw=withdraw;
    }

    public float gettotalblanc(){
        return this.Amount - this.withdraw;
    }

    public  void display(){
        System.out.println("Account holder name :--" + this.name);
        System.out.println("Account holder email id:--" + this.email);
        System.out.println("Account number :--" + this.Acc_no);
        System.out.println("Amount in Account :-- " + this.Amount);
        System.out.println("Withdrwa Amount from the  Account is :-- " + this.withdraw);
        System.out.println("total blance amount in account is  :-- " + gettotalblanc());
    }

}
class Account {
    public  static  void main(String[] args){
        Banking ACC = new Banking();
        ACC.setAcc_no(123456789L);
        ACC.setAmount(50000);
        ACC.setName("mahesh");
        ACC.setEmail("mahesh@123");
        ACC.setWithdraw(10000);
        ACC.display();
    }

}