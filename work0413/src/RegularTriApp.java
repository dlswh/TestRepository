class RegularTri{
    protected int length;

    public RegularTri(){
        length = 1;
    }

    public RegularTri(int length){
        //정삼각형의 높이는 밑변의 길이에 따라 결정되니 따로 설정해주지 않음.
        this.length = length;
    }

    public double getArea(){
        return Math.sqrt(3)/4*(length*length);
    }

    public int getLength(){
        return length;
    }
}

class RegularTriPrism extends RegularTri{
    private int high;
    
    public RegularTriPrism(){
        super();
        high = 1;
    }

    public RegularTriPrism(int length, int high){
        super(length);
        this.high = high;
    }

    public double getArea(){
        return length * high / 2;
    }

    public double getVolume(){
        return super.getArea()*high;
    }
}

public class RegularTriApp {
    public static void main(String[] args){
        //매개변수 없는 생성자 사용하는 객체
        RegularTriPrism tri = new RegularTriPrism();
        System.out.println("삼각기둥1 부피: " + tri.getVolume());
        
        //매개변수 있는 생성자 사용하는 객체
        RegularTriPrism tri2 = new RegularTriPrism(10, 20);
        System.out.println("삼각기둥2 부피: " + tri2.getVolume());
    }
}
