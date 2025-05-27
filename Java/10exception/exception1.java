
//lang.throwable throwable is super class of all exceptional class
// throwable has 2 direct children - error , exception
// error are not recoverable  error is unchecked exception means they are not checked by compiler
// exception are recoverable - 
// exception is something which when happen disrupt the normal flow
// exception like IOException,SQLexeption,and runtime exception(unchecked expression) like arithmetic expression, nullpointexpression, numberformatexpression
// try, catch, finally, throw,throws
// try block contains the code that may or may  not throw exception
// catch takes the exception and here we handle it , it will print what exception come three methods 
// 1 handling -> sop(e)
// 2  e.printStackTrace()
// 3 sop(e.getMessage())
// finally - will always get excecuted, always get executed,clean up code
// throw
// throws- declare exception class


// without excepiton
// try block can be followed by multiple exception

import java.util.Scanner;
import java.util.*;
public class exception1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=0;
        int b=0;

        // int res=a/b; // throw new.java.lang.ArithmeticException() - we get  this error if b is 0 so we will put it in try
        try{
              a=in.nextInt();
     b=in.nextInt();
            int res=a/b;
            System.out.println("Result is"+res);
        }
        catch(ArithmeticException e){
         //jab   e.printStackTrace();
            System.err.println(e); // it is defined only for error
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
          int sum=a+b;
        System.out.println("Sum is "+sum);
        int prod=a*b;
        System.out.println("Product is "+prod);

        System.out.println("Rest of the code ... follows! ");
    }


    }
