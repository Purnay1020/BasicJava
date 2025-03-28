interface animal{
public void sound();

}
class dog implements animal{
public void sound(){
    System.out.println("dog barks");
}
}
class abstraction2{
public static void main(String[] args){
    animal d1 = new dog();
    d1.sound();

}
}