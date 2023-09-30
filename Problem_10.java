/*write a program to print the product of the first 10 number. */

public class Problem_10 {
    public static void main(String[] args){
        int multi = 1;
        for(int i = 1; i <= 10; i++){
            multi = multi * i;
        }
        System.out.println(multi);
    }
}
