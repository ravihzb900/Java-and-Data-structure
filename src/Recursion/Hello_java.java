package Recursion;

public class Hello_java {
    static void hello_java(){
        System.out.println("Hello java");
        hello_java();
    }

    public static void main(String[] args){
        hello_java();

    }
}
