package ploymorphismExample;

public class OverloadingExample {

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String args[]){
        OverloadingExample oe = new OverloadingExample();
        int result1 = oe.add(1,2);
        int result2 = oe.add(2,3,4);
        System.out.println(result1);
        System.out.println(result2);
    }
    
}
