import java.util.*;
public class Variation2 {
    public static long nCr(int n, int r){
        long res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void pascalTriangle(int n){
        for(int c = 1; c <=  n; c++){
            System.out.print(nCr(n - 1, c - 1)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n = 5;
        pascalTriangle(n);;
    }
}
