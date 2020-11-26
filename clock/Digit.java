class Digit
{
private int value;
private int limit;
public Digit(int v, int l)
{
value=v;
limit=l;
}
public void setValue(int v)
{
value=v;
}
public  int getValue()
{
return(value);
}
public void increment()
{

value=(value+1)%limit;
}
public String displayDigit()
{
if(value<10)
{
	String v="0"+value;
return(v);
}
else
return(""+value);  
}

}