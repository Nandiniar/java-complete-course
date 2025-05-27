// User defined / custom exception
// for this, first extend exception class so that it become checked expreesion(i.e checked by compiler)
//  extend runtimeexception - if we want to create unchecked expression
// to print error message e.getMessage()

public class userdefined4 extends Exception{ // this is for invalidageexception
    public userdefined4(String err){
        super(err); // to create construction for this
    }
}

class  InsufficientFundsEXception  extends Exception{
    public InsufficientFundsEXception(String err){
        super(err);
    }
}

