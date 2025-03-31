import java.util.concurrent.ExecutionException;

public class trycatch{
    public static void main(String[] args){
        int[] numbers= {0,1,2,3,4,};
        try{
            System.out.println(numbers[4]);

        }
        catch (Exception e){
            System.out.println("element not in number" + e.getMessage());
        }
        finally{
            System.out.println(" program cantinues");
        }
    }
}
