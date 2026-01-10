package AbstractExample;

public class MainClass extends AbstractClass {
              void display(){
             System.out.println("This is Abstract Class");  
            
    }
    public static void main(String args[]){
     AbstractClass abstractClass = new MainClass();
             abstractClass.display();

}
}

