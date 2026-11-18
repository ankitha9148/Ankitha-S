public class Calculator {
    int add(int a,int b)
    {
        return a+b;
    }
    double prod(double a, double b)
    {
        return a*b;
    }
    int max(int a, int b, int c)
    {
        int max=a;
        if(b>max)max=b;
        if(c>max)max=c;
        return max;
    }
    double diff(int a,double b)
    {
        return a-b;
    }
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        System.out.println("Sum of 2 integers:"+obj.add(10,20));
        System.out.println("product of 2 doubles:"+obj.prod(5,7));
        System.out.println("the largest of 3 numbers is:"+obj.max(35,78,59));
        System.out.println("difference of integer and double is:"+obj.diff(35,25));
    }
}
