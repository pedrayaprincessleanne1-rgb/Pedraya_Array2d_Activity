import java.util.Scanner;

public class Userinput {

    public int[] getSize() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        return new int[]{r, c};
    }
}