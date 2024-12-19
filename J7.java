interface Resizeable2 {
    void resizeWidth(int width);
    void resizeHieght(int hieght);
}
class Rectangle2 implements Resizeable2{
    private int width;
    private int hieght;
    public Rectangle2(int width,int hieght){
        this.width=width;
        this.hieght=hieght;
    }
    public void resizeWidth(int width){
        this.width=width;
    }
    public void resizeHieght(int hieght){
        this.hieght=hieght;
    }
    public void display(){
        System.out.println(" Rectangle width:"+width);
        System.out.println(" Rectangle Hieght:"+hieght);
    }
}
public class J7 {
    public static void main(String[] args) {
        Rectangle2 r2 = new Rectangle2(6, 8);
        System.out.println("\n Original Size of the Rectangle:");
        r2.display();
        r2.resizeWidth(4);
        r2.resizeHieght(10);
        System.out.println("\n Resized hieght of Rectangle:");
        r2.display();
    }
}