import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        
        System.out.println("10개 숫자 입력");
        for(int i=0; i<array.length; i++){
            System.out.printf("array[i]", i);
            array[i] = sc.nextInt();
        }
        int max = array[0], min = array[0];

        for(int i=0; i<array.length; i++){
            if(max<array[i]) max = array[i];
            if(min>array[i]) min = array[i];
        }
        System.out.printf("최대: %d, 최소: %d\n", max, min);

        sc.close();
    }    
}
