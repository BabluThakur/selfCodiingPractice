package InterfaceExample;


public class ImplementInterface implements InterfaceDemo {

    @Override
    public int sum(int x, int y){
    return x+y;
    }
    public static void main(String args[]){
        ImplementInterface demo = new ImplementInterface();
        int result = demo.sum(2, 5);
        System.out.println("Sum = " + result);
    }
    
}
