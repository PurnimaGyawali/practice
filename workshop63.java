import java.util.Scanner;

/**
 * Write a description of class workshop63 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop63
{
    public static void main(String[] args)
    {
        String[] name={"Saroj","Sushant","Uijwal","Rabina","Sandesh"};
        for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]);
        }
        for(int i=0;i< name.length;i++)
        {
            if (i==2){
            System.out.println(name[i]);
        }
        }
        for(int i=0;i< name.length;i++)
        {
            if (i==4){
                name[i]="Simran";
            System.out.println(name[i]);
        }
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Enter which Index you want to update;(0,1,2,3,4)");
        int index=input.nextInt();
        input.nextLine();
        System.out.println("Enter the new name:");
        String newName=input.nextLine();
        for(int i=0;i< name.length;i++)
        {
            if (i==index){
            name[i]=newName;
        }
        }
            for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]);
        }
        
        
    }
}