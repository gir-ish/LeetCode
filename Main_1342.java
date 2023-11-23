package LeetCode;
import java.util.Scanner;

/**
 * Main_1342
 */
public class Main_1342 {
    public static void main(String[] args) {
        System.out.println("Enter the value to reduce");
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        int result=Reducing_No(no,0);
        System.out.println(result);
        input.close();
    }
    static int Reducing_No(int no,int count){
        if(no!=0){
            if(no%2==0)
            {   
                return Reducing_No(no/2,++count);
            }
            else{
                return Reducing_No(no-1,++count);
            }
        }
        return count;
    }
}