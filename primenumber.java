import java.util.*;
public class primenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();
        int count =0;
        for(int i=1; i<=no; i++){
        if(no%i==0)
        {
            count++;
        }
        }
        if(count==2)
        System.out.println("prime number");
        else 
        System.out.println("not a prime number");
}
    }

