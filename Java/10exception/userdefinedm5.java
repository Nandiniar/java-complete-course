public class userdefinedm5 {
    static void validate(int age) throws userdefined4{
        if(age<18){
            throw new userdefined4("under age");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }

        public static void main(String[] args){
            userdefinedm5 a=new userdefinedm5();

            try{
           a. validate(34);
           a. validate(2);
            }
            catch(Exception e){
                System.err.println(e);
            }
            finally{
                System.out.println("Finally always get excecuted");
            }
        }
    }

