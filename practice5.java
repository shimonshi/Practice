import java.util.Scanner;
// 2е задание
public class practice5 {

    private static int recursive(int i,int lenght){
        if (i <= lenght){
            System.out.println(i);
            return recursive(i+1,lenght);
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lenght = sc.nextInt();
        int n = sc.nextInt();
        recursive(n,lenght);
    }

}