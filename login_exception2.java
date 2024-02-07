import java.util.Scanner;

class PasswordException extends Exception
{
    protected String msg;
    public PasswordException(String msg)
    {
        this.msg = msg;
    }
    public String getMsg()
    {
        return msg;
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	    try 
	    {
    	    Scanner sc = new Scanner(System.in);
    		System.out.println("Enter username");
    		String user = sc.nextLine();
    		System.out.println("Enter password");
    		String password = sc.nextLine();
    		if(user.equals("admin") && password.equals("password"))
    		    System.out.println("Login Successfull");
    		else
    		{
    		    throw new PasswordException("Invalid Login Credentials");
    		}
	    }
	    catch(PasswordException e)
	    {
	        System.out.println(e.getMsg());
	    }
	        
	    }
}

/*  
Enter username
admin
Enter password
password
Login Successfull

-------------------

Enter username
admin
Enter password
pwd
Invalid Login Credentials
  */
