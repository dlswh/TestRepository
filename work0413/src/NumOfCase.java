public class NumOfCase {
    public static void main(String[] args){
        String[] subAry = {"C", "Java", "Python"};
        for(int i=0; i<subAry.length-1; i++){
            for(int j=i+1; j<subAry.length; j++){
                System.out.println("(" + subAry[i] + " , " + subAry[j] + ")");
            }
        }
    }    
}
