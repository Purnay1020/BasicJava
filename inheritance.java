class animal {
    public void eat(){
        System.out.println("this animal eats food");
    }

}
class dog extends animal{
    public void bark(){
        System.out.println("dog barks");
    }
}
public class inheritance{
    public static void main(String[] args){
        animal elephant = new animal();
        elephant.eat();
        dog d1= new dog();
        d1.eat();
        d1.bark();
    }
}