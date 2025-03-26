class student{
    
    public static void main(String[] args)
    {
      String statement = "welcome to my college";
      System.out.println("length" + statement.length());
      System.out.println("uppercase" + statement.toUpperCase());
      System.out.println("replace " + statement.replace("my", "our"));
    System.out.println("substring " + statement.substring(0, 6));
      System.out.println("contains " + statement.contains("college"));
    }
}