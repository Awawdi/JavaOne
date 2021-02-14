import java.io.*;
import java.net.*;

public class EmailClient
{
    public static String serverName = "LOCALHOST";
    Socket socket = null;
    InputStream is = null;
    DataInputStream dis = null;
    OutputStream os = null;
    DataOutputStream dos = null;

    public void dispach(Email email)
    {
		try
		{
			socket = new Socket(email.To.VendorServerName,email.To.serverPortNumber);
			System.out.println("socket was created...");
			is = socket.getInputStream();
			System.out.println("input stream was created...");
			dis = new DataInputStream(is);
			System.out.println("data input stream was created...");
			os = socket.getOutputStream();
			System.out.println("output stream was created...");
			dos = new DataOutputStream(os);
			System.out.println("data output stream was created...");
			dos.writeUTF(email.toString());
			System.out.println("email was written to the server...");
		}
        catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(is!=null)
			{
				try{is.close();}catch(IOException e){e.printStackTrace();}
			}
			if(os!=null)
			{
				try{os.close();}catch(IOException e){e.printStackTrace();}
			}
			if(dis!=null)
			{
				try{dis.close();}catch(IOException e){e.printStackTrace();}
			}
			if(dos!=null)
			{
				try{dos.close();}catch(IOException e){e.printStackTrace();}
			}
			if(socket!=null)
			{
				try{socket.close();}catch(IOException e){e.printStackTrace();
                }
            }
        }
    }
}