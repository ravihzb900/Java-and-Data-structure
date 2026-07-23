package Recursion;

public class Hello_java {
    static void hello_java(int a){
        System.out.println("Hello java");
        if (a == 0)
        {
                return;
        }
        a--;
        hello_java(a);
    }

    public static void main(String[] args){
        hello_java(7);

    }
}

