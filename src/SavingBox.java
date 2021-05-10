public class SavingBox {


    public static void main(String[] args) {
        AddAmount a1=new AddAmount();
        AddAmount b1= new AddAmount(100);
        a1.Transaction();
        b1.Transaction();
        b1.FinalAmt();

    }
}

class AddAmount{
    int amount=50;
    int c=0;


    AddAmount() {
        this.amount=50;
    }
    AddAmount(int a) {
        this.amount=this.amount+a;
        c=c+1;
    }
    void Transaction() {
        System.out.println("transcation took place " +c);
    }
    void FinalAmt() {
        System.out.println("final amount is " +this.amount);
    }
}
