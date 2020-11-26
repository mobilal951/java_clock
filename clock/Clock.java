public class Clock
{
Digit mintue;
Digit hour;
String time;
public Clock(int a , int b)
{
mintue =new Digit(a,60);
hour =new Digit(b,24);
time=hour.displayDigit()+":"+mintue.displayDigit();
}
public void setTime(int a, int b)
{
mintue.setValue(a);
hour.setValue(b);
time=hour.displayDigit()+":"+mintue.displayDigit();
}
public void tick()
{
mintue.increment();
if(mintue.getValue()==0)
hour.increment();
time=hour.displayDigit()+":"+mintue.displayDigit();
}
public void DisplayClock()
{
System.out.println(time);
}
}