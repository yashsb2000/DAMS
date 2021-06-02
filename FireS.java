// Source code for Fire Server

import java.io.*;  
import java.net.*;  
public class FireS {  
public static void main(String[] args){  
System.out.println(" This is the Fire Department");
try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();      //establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str= (String)dis.readUTF();  
System.out.println(" Help Needed !");
System.out.println(str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  

