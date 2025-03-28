public class polymorphism {
    public int add (int a, int b)
    {
    return a+b;
    }
    public double add(double a, double b){
        return a+b;

    }
    public static void main(String[] args){
        polymorphism addition = new polymorphism();
        int r1=addition.add(2, 6);
        double r2=addition.add(3.2, 4.4);
        System.out.println("int add " + r1);
        System.out.println("double "+ r2);
    }
}
