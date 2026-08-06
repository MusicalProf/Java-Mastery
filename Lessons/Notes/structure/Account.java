package Notes.structure;

public class Account {
//    Data - Properties of the class.
    private String owner;
    private double balance;
    private double minBalance;

//    Actions - Methods/Functions of the class.
    public void deposit(double amount){
//        implementation
    }

    public void withdrawal(double amount){
//        implementation
    }

    public int calculateCreditWorthiness(){
        return 100;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }


}
