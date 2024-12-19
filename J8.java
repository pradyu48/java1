class Outer2{
    void displayMessage(){
        System.out.println("hii this is java program");
    }
    static class Inner2{
        void display(){
            System.out.println("This  Nested loop");
        }
    }
}
public class J8 {
    public static void main(String[] args) {
        Outer2 o3=new Outer2();
        o3.displayMessage();
        Outer2.Inner2 i3=new Outer2.Inner2();
        i3.display();

    }

}
