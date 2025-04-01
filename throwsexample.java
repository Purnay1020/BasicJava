public class throwsexample {
    public static void devid(int a, int b) throws ArithmeticException{
if(b==0){
    throw new ArithmeticException("division by zero not allowed");
}
System.out.println(a/b);
    }
    public static void main(String[] args){
        try{
            devid(10, 0);
        }
        catch(ArithmeticException e){
            System.out.println("exception caught " + e.getMessage());
        }
    }
}
