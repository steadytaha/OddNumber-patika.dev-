import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Give a number: ");
            n = input.nextInt();
            if(n%4==0){
                total+=n;
            }
        }while(n%2==0);
        
        System.out.println("Total: " +total);
    }
}
