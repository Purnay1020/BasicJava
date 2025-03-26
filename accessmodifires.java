public class accessmodifires {
    public void publicmethod(){
        System.out.println("this is a public method");
    }
    private void privatemethod(){
        System.out.println("this is a private method");
    }
    protected void protectedmethod(){
        System.out.println("this is aprotected method");
    }
    public static void main(String[] args){
        accessmodifires hello = new accessmodifires();
        hello.publicmethod();
        hello.privatemethod();
        hello.protectedmethod();
    }
}
