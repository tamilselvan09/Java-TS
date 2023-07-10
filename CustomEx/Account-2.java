class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl(int amount) throws InsuffientFundsException  {

        if(amount > 200000){
            //generate custom exception object simply throw
            throw new InsuffientFundsException("Can't Withdraal");
        }
        else{
            System.out.println("Enjoy with Money!");
        }
    }
    public static void main(String[] args) throws InsuffientFundsException{
        Account a1=new Account();
        a1.withdrawl(50000);
    }
}