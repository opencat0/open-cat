import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int max = scanner.nextInt();
        for (int cunt = 0 ;cunt<input-1; cunt++){
            int sa = scanner.nextInt();
            if (max<sa){
                max = sa;
            }
        }
        System.out.println(max);
    }
}