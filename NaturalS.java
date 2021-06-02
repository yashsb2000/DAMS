// Source code for Natural Disaster server

// Natural Calamity server :

import java.io.*;  
import java.net.*;  
public class NaturalS {  
public static void main(String[] args){  
System.out.println(" This is the department concerned with natural calamities");
try{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();      //establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str= (String)dis.readUTF();
System.out.println(" Help Needed !");  
System.out.println(str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  



