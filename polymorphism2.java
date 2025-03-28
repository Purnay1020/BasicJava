class overriding {
    public void sound(){
        System.out.println("sound");
    }

}
class A extends overriding{
    @Override
    public void sound(){
        System.out.println("music on music");

    }
}
public class polymorphism2{
    public static void main(String[] args){
        overriding obj = new overriding();
        obj.sound();
        A obj2 = new A();
        obj2.sound();
    }
}