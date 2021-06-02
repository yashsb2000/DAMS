// Source code for Medical Emergency Server



import java.io.*;  
import java.net.*;  
public class MedicalS {  
public static void main(String[] args){  
System.out.println(" This is the Medical Emergency department");
try{  
ServerSocket ss=new ServerSocket(5555);  
Socket s=ss.accept();      //establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str= (String)dis.readUTF();  
System.out.println(" Help Needed !");

System.out.println(str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  

