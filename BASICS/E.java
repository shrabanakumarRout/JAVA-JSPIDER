
 class D
    {
    public static void m1() {
    System.out.println("static m1 () is created");
    }

    public void m2() {
     System.out.println("static m2 () is created");
    }	

}
 








class E{

public static void main (String [] args)
{
D.m1();
D D1 = new D ();
D1.m2();
}
}
