
/**
 * Write a description of class tutorial6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial6
{
    public static void main(String[] args)
    {
        int[] age= new int[5]; //last index= length-1 (5-1=4)
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        System.out.println(age.length);
        
        int[] agr={10,20,30,40,50};// {} represents 1D array . most of the linear equation is done in 1D array
        for(int i=0;i< agr.length;i++)
        {
            System.out.println(agr[i]);
        }
        for(int i=(agr.length-1);i>=0;i--)
        {
            System.out.println(agr[i]);
        }
        
        //to store in reverse inside another array from previous array . IT IS HW
        //int[] revArg=new int[arg.length];
        
        
        //addition
        int sum=0;
        for(int a=0;a<agr.length;a++)
        {
            sum=sum+agr[a];
        }
        System.out.println(sum);
        //multiplication
        int mul=1;
        for(int b=0;b<agr.length;b++)
        {
            mul=mul*agr[b];
        }
        System.out.println(mul);
        
        
        // 2D ARRAY
        /* row column
        int[][] matrix;
        matrix = new int[2][3]; 
        matrix[0][0]=10;
        matrix[0][1]=20;
        matrix[0][2]=30;
        matrix[1][0]=40;
        matrix[1][1]=50;
        matrix[1][2]=60;
        
        */ //to put in one line  
        //                 row 0     row 1    row 2
        int[][] matrix={ {1,2,3} , {4,5,6} , {7,8,9} };
        //              c0 c1 c2   c0 c1 c2  c0 c1 c2
        for(int d=0;d< matrix.length;d++)
        {
            System.out.println(matrix[d]);
        }
        
        for(int i=0;i< matrix.length;i++) //matrix[i].length (if we dont lnow the no of column)
        {
            for(int j=0;j< matrix[i].length;j++)
        {
            System.out.println(matrix[j]);
        }
        }
        
    }
}