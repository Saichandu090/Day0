import java.util.Scanner;

public class ValidDate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date");
        int date=sc.nextInt();
        System.out.println("Enter the Month");
        int month=sc.nextInt();
        System.out.println("Enter the Year");
        int year=sc.nextInt();
        boolean rs=isValid(date,month,year);
        System.out.println(rs);
    }

    public static boolean isValid(int date,int month,int year)
    {
        if(date<1||date>31||month<1||month>12||year<1)
            return false;
        else if((month==4||month==6||month==9||month==11)&&date>30)
            return false;
        else if(month==2&&date>29)
            return false;
        else if(!(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) &&month==2&&date>28)
            return false;
        else
            return true;
    }
}
