package MultipleInterfaceExample;

public class ImplementMultiipleInterface implements MultipleAdd, MultipleSub {

    public int sum(int a, int b) {
        int sumResult = a + b;
        return sumResult;
    }

    public int sub(int a, int b) {
        int subResult = a - b;
        return subResult;
    }

    public static void main(String args[]) {

        ImplementMultiipleInterface imi = new ImplementMultiipleInterface();
        int rel = imi.sub(5, 6);
        int rel1 = imi.sum(5, 6);
        System.out.println(rel1);
        System.out.println(rel);
    }
}
