/*
 * Jessica Qiao
 * 26/10/2018
 */

package show.what.you.know;
import java.util.Scanner;
/**
 *
 * @author shqia0005
 */
public class ShowWhatYouKnow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
//      
        
        System.out.println("Please enter your last 5 assignment marks");
        double average = 0.0;
        double total = 0.0;
        int[]marks = new int[5];
        for(int i = 0;i<=4;i=i+1)
        {
            marks[i] = keyedInput.nextInt();
        }
        for(int i = 0;i<=4;i=i+1)
        {
            total = total + marks[i];
        }
        for(int i = 0;i<=4;i=i+1)
        {
            average = total / 5;
        }
        System.out.println("The average of your marks is " + average + ".");
    }
        
}
