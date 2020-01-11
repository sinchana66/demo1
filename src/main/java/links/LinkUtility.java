package links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LinkUtility {

	public static void responseForLink(String link)
	{
		try {
			URL url=new URL(link);
			HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
			httpUrlConnection.setC
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	{
		

	}

}
