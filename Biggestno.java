class Biggestno
{
    public static void main(String args[])
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=Integer.parseInt(args[2]);   
            if(a>b && a>c)
                {
                    System.out.println(a+ "Is Largest Number!...");
                }
            else if(b>a && b>c)
                {
                    System.out.println(b +"Is Largest number!...");
                }
            else   
                {
                    System.out.println(c +"Is Largest number!...");
                }
        }
}


