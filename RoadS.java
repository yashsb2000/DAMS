// Source code for Road accient Server

// Road accident server :

import java.io.*;  
import java.net.*;  
public class RoadS {  
public static void main(String[] args){  
System.out.println(" This is the department concerned with road accidents");
try{  
ServerSocket ss=new ServerSocket(4444);  
Socket s=ss.accept();      //establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str= (String)dis.readUTF();
System.out.println(" Help Needed !");  
System.out.println(str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  



