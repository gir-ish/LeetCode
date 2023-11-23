package LeetCode;
import java.util.Random;
import java.util.Scanner;

/**
 * Main_1295
 */
public class Main_1295 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        Random random = new Random();

        // Generate random elements
        for (int i = 0; i < size; i++) {
            if(i==0){
                array[i] = random.nextInt(100);     
            }
            else{
                array[i] = array[i-1]+random.nextInt(100); 
            }
        }
        System.out.println("Generated array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        int result=Count_Even_Number_Digits(array,size,0,0);
        System.out.println(result);
        input.close();
    }
    
    static int Count_Even_Number_Digits(int array[],int size,int count,int i){
        if(i<size){
            int result=Check_no_of_Digit(array,i,0);
            if(result%2==0){
                return Count_Even_Number_Digits(array, size, count+1, i+1);
            }
            else{
                return Count_Even_Number_Digits(array, size, count,i+1);
            }       
        }
        return count;
    }
    static int Check_no_of_Digit(int array[],int i,int Count_d){
        if(array[i]!=0){
            Count_d+=1;
            array[i]=array[i]/10;
            return Check_no_of_Digit(array, i, Count_d);
        }
        return Count_d;
    }
}