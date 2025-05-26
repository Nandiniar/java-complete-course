package in.abc;

public class ABC {
    private int a;
   public ABC(int a){
        this.a=a;
    }
    public void getvalue(){
        System.out.println("THe value is"+a);
    }
    public static void main(String[] args){
        ABC a=new ABC(10);
        a.getvalue();
    }
}
