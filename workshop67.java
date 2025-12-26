
/**
 * Write a description of class workshop67 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop67
{
    public static void main(String[] args)
    {
    String[][] matrix = new String[2][3]; 
        matrix[0][0]="Simran";
        matrix[0][1]="Supriyu";
        matrix[0][2]="Pradhara";
        
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                if (matrix[i][j] == null || matrix[i][j].isEmpty()) {
                    System.out.printf("%-10s", "[empty]"); 
                } else {
                    System.out.printf("%-10s", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }   

}
