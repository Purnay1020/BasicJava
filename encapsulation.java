public class encapsulation {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int GetAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args){
        encapsulation s1 = new encapsulation();
        s1.setName(" santosh");
        s1.setAge(25);
        System.out.println("my name is + " + s1.getName());
        System.out.println("my age is " + s1.GetAge());
    }


}
