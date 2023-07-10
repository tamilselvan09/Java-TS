//try catch

class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}

class Account{
    public void withdrawl(int amount){
        try{

        
        if (amount > 20000){
                throw new InsuffientFundsException("can't");
        }
        else{
            System.out.println("can");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }

    public static void main(String[] args){
        Account a1= new Account();
        a1.withdrawl(50000);
    }
}