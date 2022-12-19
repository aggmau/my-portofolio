/*
Access Modifiers

You're a tour manager and you need to have a list of countries along with its capitals.
You're given a program which creates Country object and you should output the name and the capital, but something goes wrong.

Task
Change the access modifiers of the Country class fields in order to perform the required output.
*/
public class Program
{
	public static void main(String[] args) {
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
}
	
	
}
class Country{
    //change the code below
    public String name;
    public String capital;
}
