

public class customer2 {
    private int cid;
    private String cname;
    private static String bank="SBI";
private associ2 a;
public customer2(int cid,String cname,associ2 a){
    this.cid=cid;
    this.cname=cname;
    this.a=a;
}
public void disp(){
    System.out.println(cid+" "+cname+" "+bank);
    a.getAccount();
}

   public static void main(String[] args) {
    associ2 a1=new associ2(123,"Saving",10000);
    customer2 c1=new customer2(112,"ABC",a1);
    c1.disp();
   }
}
