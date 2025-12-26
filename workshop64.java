import java.util.Scanner;

/**
 * Write a description of class workshop64 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop64
{
    public static void main(String[] args)
    {
        int[] scores={10,20,30,40,50};
        for(int i=0;i< scores.length;i++)
        {
            System.out.println(scores[i]);
        }
        int sum=0;
        for(int i=0;i< scores.length;i++)
        {
            sum=sum+scores[i];
        }
        System.out.println("Sum: "+sum);
        float avg=sum/5;
        System.out.println("Average: "+avg);
        int lowest = scores[0];
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i]; 
            }
            if (scores[i] > highest) {
                highest = scores[i]; 
            }
        }
        System.out.println("Highest score: "+highest);
        System.out.println("Lowest score: "+lowest);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many Index you want: ");
        int index=input.nextInt();
         input.nextLine();
        int[] arr=new int[index];
        System.out.println("Enter the values for the new array:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Enter value for index: "+i);
            arr[i]=input.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}