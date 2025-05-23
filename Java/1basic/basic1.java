public class basic1{ //here public,class is a keyword or reserved words and basic1 is class name
    public static void main(String args[]){  //main is the name of function 
        System.out.println("Hello world");//println is from printstream class
    }
}

// java 17 is LTS(Long term support)
//command - javap basic1 (it gives the byte class representation of class)
// javap is java disassembler
// command -  javap -c basic1(it gives the fuller bytecode of the class)
// camelcase -HelloWorld(The first letter of every word should be capital)
// for classes and interfaces first word should be capital and for functions/methods/variables 1 word should be small
// static is a modifier there are 12 modifier in  java-static method can be called without the need of object
// system is a class available in java.lang
//java.lang is a built-in package in Java that contains essential classes needed for basic programming.
// here string class and system class are from lang package
// keywords are also known as reserved words public is a keyword, class is a keyword , static is a keyword,void is keyword
// in java we have 53 keywords