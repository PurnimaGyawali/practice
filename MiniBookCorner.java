
/**
 * Write a description of class MiniBookCorner here.
 *
 * @author Purnima
 * @version v1
 */
public class MiniBookCorner
{
    public static void main(String[] args)
    {
        String[] categories= {"Fiction","Nepali"};
        String[][] titles= new String[2][1];
        double[][] prices= new double[2][1];
        titles[0][0] ="Dr.Strange";
        titles[1][0] ="Munamadan";
        prices[0][0] = 500.0;
        prices[1][0] = 750.0;
        System.out.println("~~~~~~~~~~MINI BOOK INVENTORY~~~~~~~~~");
        System.out.println("______________________________________");
        System.out.println("\n");
        for(int i=0; i<categories.length; i++)
        {
            System.out.println("Category:"+categories[i]);
            for(int j=0; j<titles[i].length; j++)
            {
                if ( titles[i][j] != null)
                {
                    System.out.printf("Title: %s\n",titles[i][j]);
                    System.out.printf("Price: Rs.%.2f\n",prices[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println("______________________________________");
    }
}