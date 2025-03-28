abstract class Vehicle{
    abstract void start();
    public void stop(){
        System.out.println("stop the vehicle");
    }
}
class Car extends Vehicle{
    @Override
    void start (){
        System.out.println("cars starts with key");
    }
}
class abstraction{
    public static void main(String[] args){
        
        Car c1 =new Car();
        c1.start();
            
    }
}