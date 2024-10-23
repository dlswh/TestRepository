class Triangle{
    private int height;
    private int width;
    public Triangle(){
        height = 1;
        width = 1;
    }
    public Triangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public void setHeight(int h){ height = h; }
    public void setWidth(int w){ width = w; }
    public float getArea(){ return (float)(height*width)/2; }
    public void printInfo(){
        System.out.println("높이: " + height + ", 너비: " + width);
    }
    public void printInfo(int h, int w){
        setHeight(h);
        setWidth(w);
        System.out.println("높이: " + height + ", 너비: " + width);
    }
}
class TriPrism extends Triangle{
    private int high;

    public TriPrism(){
        super();
        high = 1;
    }

    public TriPrism(int height, int width, int high){
        super(height, width);
        this.high = high;
    }

    public float getVolume(){
        return this.getArea()*high;
    }
}
public class TriangleApp {
    public static void main(String[] args){
        //매개변수 없는 생성자 사용하는 객체
        TriPrism tri = new TriPrism();
        System.out.println("삼각기둥1 부피: " + tri.getVolume());
        
        //매개변수 있는 생성자 사용하는 객체
        TriPrism tri2 = new TriPrism(10, 20, 30);
        System.out.println("삼각기둥2 부피: " + tri2.getVolume());
    }
}
