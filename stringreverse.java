import java.util.*;
public class Main
{
public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,j,flag=0;
        i=0;
        j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag=1;
            }
            i++;
            j--;
        }
        if(flag==0)
        {
            System.out.println("YEs");
        }
        else{
            System.out.println("No");
        }
    }
}