class veriable{
    public static void main(String[] args){
        int no=1234;
        int r=0;
        int sum=0;
        for(int i=1; i<=4; i++)
        {
            r=no%10;
            sum=sum+r;
            no=no/10;
        }
        System.out.println(sum);
    }
}