import java.util.*;
class array{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<=4; i++){
            array[i]=sc.nextInt();
        }
        for (int i=0; i<=4; i++){
            for (int j=0; j<=3-i; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0; i<=4; i++){
            System.out.println(array[i]);
        }

    
    }
}