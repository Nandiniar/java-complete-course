// association have two forms - aggregation and composition and(realization also its has relationship between two differnt components)
// association is structural relationship meaning it doesnot have any  meaning ,aggregation and composition both have "has a "
// relationship
// aggregation means whole/part means ke agar part nhi hoga toh tab whole ho sakta hai
// composition means strong whole/part means ke agar part nhi hoga toh whole bhi nhi ho sakta 
public class associ2 {
    private int accNo;
    private String accType;
    private double accBalance;
    public associ2(int accNo,String accType,double accBalance){
        this.accNo=accNo;
        this.accType=accType;
        this.accBalance=accBalance;
    }
    public void getAccount(){
        System.out.println("acc number is"+accNo+"acctype is"+accType+"account Balance is"+accBalance);
    }
    
}
// here we show aggregation we use associ2 as a refernce in customer2.java
