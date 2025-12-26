import java.util.Scanner;

/**
 * Write a description of class workshop65 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop65
{
    public static void main(String[] args){
        String[] district={"morang","kathmandu","kaski","sindhuli"};
        System.out.println("initial district:");

        for(int i=0; i< district.length; i++)
        {
            System.out.println((i+1)+ district[i]);
           
        }
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
