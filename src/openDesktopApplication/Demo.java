package openDesktopApplication;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Demo 
{
    public static void main(String[] args) throws IOException, URISyntaxException 
    {
		Runtime rt=Runtime.getRuntime();
		
		//to open the calculator
		rt.exec("calc");
		
		// to open the notepad
		//rt.exec("notepad");
		
		//start the default browser
		//rt.exec("start https://www.google.com");
		
		//URI url=new URI("https://www.example.com");
		
		  // String url1 = "https://www.example.com";
          // rt.exec("rundll32 url.dll,FileProtocolHandler " + url1);
           
           // we can print the comment line like this
          //\u000d  System.out.println("please mind your code");
		
	}
}
