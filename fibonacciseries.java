public class fibonacciseries {
    public static void main(String[] args){
        int f1=1;
        int f2=2;
        int f3;
        System.out.println(f1+" ");
        System.out.println(f2+" ");
        for(int i=1; i<=7; i++)
        {
            f3=f1+f2;
            System.out.println(f3+ " ");
            f1=f2;
            f2=f3;
        }

    }
}
