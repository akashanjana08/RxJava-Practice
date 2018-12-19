package operator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread {
	    public GreetingServer(int port) throws IOException {
	     
	   }

	   public void run() {
	      while(true) {
	         try {
	            
	            System.out.println("Running");
	            clearConsole();
	         
	         } catch (Exception e) {
	            e.printStackTrace();
	            break;
	         }
	      }
	   }
	   
	   public static void main(String [] args) {
	      int port = 1027;
	      try {
	         Thread t = new GreetingServer(port);
	         t.start();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	   
	   public final static void clearConsole()
	   {
	       try
	       {
	           final String os = System.getProperty("os.name");

	           if (os.contains("Windows"))
	           {
	               Runtime.getRuntime().exec("cls");
	           }
	           else
	           {
	               Runtime.getRuntime().exec("clear");
	           }
	       }
	       catch (final Exception e)
	       {
	           //  Handle any exceptions.
	       }
	   }
	}