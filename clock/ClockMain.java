import java.util.Scanner;
public class ClockMain
{
public static void main(String args[]) throws Exception
{
int hour, mint, start;
Scanner s=new Scanner(System.in);
System.out.print("enter time mintues and hours");
mint=s.nextInt();
hour=s.nextInt();

Clock c=new Clock(mint, hour);

for (int i=0; i<=5; i++)
{
c.DisplayClock();
Thread.sleep(1000); 
c.tick();


}


}




}