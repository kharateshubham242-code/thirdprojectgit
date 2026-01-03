import java.util.Scanner;
 class Age {
    public static void main(String args [])
     {
    System.out.println("enter your age");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age>18)
    {
        System.out.println ("adult");
        if(true)
        System.out.println("he is mature");
    }
    else
    {
    System.out.println("he is not mature");

    }
}
}