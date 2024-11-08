import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class number24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] mynumbers = new int[3][];
        mynumbers[0]= new int[5];
        mynumbers[1]= new int[3];
        mynumbers[2]= new int[1];
        
        for (int i = 0; i < mynumbers.length; i++) {
            System.out.println("panjang baris ke- " + (i+1) + " :" +mynumbers[i].length );
            
        }
    }
}
