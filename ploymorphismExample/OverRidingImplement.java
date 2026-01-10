package ploymorphismExample;

public class OverRidingImplement extends OverRidingExample {

    @Override
    public int add(int a, int b ){
        return a+b+10;

    }
    public static void main(String args[]){
        // OverRidingExample oE = new OverRidingImplement();
        OverRidingExample oE= new OverRidingExample();
        int result = oE.add(5,2);
        System.out.println("Result is " + result);
    }
}
