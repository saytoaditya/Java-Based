import java.util.*;
public class SplitBill
{
    public static void main(String[] args)
    {
        System.out.println("enter number of people");
        Scanner scan=new Scanner(System.in);
        int peopleCount=scan.nextInt();
        String names[]=new String[peopleCount];
        for(int i=0;i<peopleCount;i++)
        {
            names[i]=scan.nextLine();
        }
    }
}