public class Client
{
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        Internet internet1= new RealInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
            internet1.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}