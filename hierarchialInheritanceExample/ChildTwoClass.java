package hierarchialInheritanceExample;


public class ChildTwoClass {
    ChildTwoClass(){
    System.out.println("Hello i am Child  second");
    } 
    public static void main(String args[]){
        ChildOneClass c1= new ChildOneClass();
        ChildTwoClass c2= new ChildTwoClass();
    }
}
