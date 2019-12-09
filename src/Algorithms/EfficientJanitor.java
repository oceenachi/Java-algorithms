package Algorithms;

import java.util.Arrays;

public class EfficientJanitor {

    public static void main(String[] args) {
        double[] floater = {3.0,3.0,3.0};
        System.out.println(efficientJanitor(floater));

    }

    public static int efficientJanitor(double[] floatArr) {
        Arrays.sort(floatArr);
        System.out.println(Arrays.toString(floatArr));
        double sum = 0;
        int count = 0;

        for(int i=0; i<floatArr.length; i++){
           double check = sum + floatArr[i];

            if(check <= 3.0 ) {
                sum = check;
            }
            else if(check > 3.0) {
                count+=1;

                sum=floatArr[i];
            }
                System.out.println(sum);
        }
        return count + 1;
    }


}
