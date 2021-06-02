// Source code for the java project

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;


class X1
{ 
public int i;
// Data members for frame 1
private JFrame f1;
private JButton b;
private JLabel l;

//Data members for frame 2
private JFrame f2;
private JButton b1;
private JButton b2;
private JLabel l1;
private JLabel l2;
private JLabel l3;
private JTextField t1;
private JTextField t2;
private CheckboxGroup cbg;
private Checkbox cb1;
private Checkbox cb2;
public String s1,s2,s3;

//Data memners for frame 3
private JFrame f3;
private JButton b3;
private JButton b4;
private JLabel l4;
private JLabel l5;
private JTextArea t;
private Choice ls;
public String s4;

// Data members for Fire frame
private JTextArea tfi1;
private JTextArea tfi2;
private JTextArea tfi3;
private JTextArea tfi4;
private JTextArea tfi5;
private JTextArea tfi6;
private JTextArea tfi7;
private JTextArea tfi8;
private JTextArea tfi9;
private JFrame fi;
private JLabel lfi;
private JLabel lfi2;

// Data members for medical frame
private JTextArea tm1;
private JTextArea tm2;
private JTextArea tm3;
private JTextArea tm4;
private JTextArea tm5;
private JTextArea tm6;
private JTextArea tm7;
private JTextArea tm8;
private JTextArea tm9;
private JFrame m;
private JLabel lm;
private JLabel lm2;


// Data members for Road frame
private JTextArea tr1;
private JTextArea tr2;
private JTextArea tr3;
private JTextArea tr4;
private JTextArea tr5;
private JTextArea tr6;
private JTextArea tr7;
private JTextArea tr8;
private JTextArea tr9;
private JFrame r;
private JLabel lr;
private JLabel lr2;

// Data members for Natural frame

private JTextArea tn1;
private JTextArea tn2;
private JTextArea tn3;
private JTextArea tn4;
private JTextArea tn5;
private JTextArea tn6;
private JTextArea tn7;
private JTextArea tn8;
private JTextArea tn9;
private JFrame n;
private JLabel ln;
private JLabel ln2;



X1()
{
prepareGui1();
}

// Gui for Frame 1:

public void prepareGui1()
{
f1=new JFrame("Frame 1");
f1.setSize(1000,600);
f1.setLayout(null);
f1.setVisible(true);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


l=new JLabel();
l.setText("Hello, Welc0me to Disaster and Accident Management System !");
l.setBounds(330,180,400,230);
f1.add(l);
b=new JButton("next");
b.setBounds(890,500,60,40);
f1.add(b);
b.setToolTipText("Click here to proceed");
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e) 
{
prepareGui2();
f1.dispose();
}
});
}


// Gui for Frame 2 :

public void prepareGui2()
{
f2=new JFrame("Frame 2");
f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f2.setSize(1000,600);
f2.setLayout(null);
f2.setVisible(true);
b1=new JButton("next");
b1.setBounds(890,500,60,40);
b2=new JButton(" <- previous");
b2.setBounds(100,500,120,40);
b1.setToolTipText("Click to proceed");
b2.setToolTipText("Click to go back");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
prepareGui1();
f2.dispose();
}
});
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
s1="Name : " + t1.getText();
s2="Age : " + t2.getText();
s3= "Gender : " + cbg.getSelectedCheckbox().getLabel();
prepareGui3();
f2.dispose();
}
});
f2.add(b1);
f2.add(b2);
l1=new JLabel();
l2=new JLabel();
l3=new JLabel();
l1.setText("NAME");
l2.setText("AGE");
l3.setText("GENDER");
l1.setBounds(50,100,100,60);
l2.setBounds(50,160,100,60);
l3.setBounds(50,240,100,60);
f2.add(l1);
 f2.add(l2); 
f2.add(l3);
t1=new JTextField(1);
t2=new JTextField(1);
t1.setBounds(250,100,160,40);
t2.setBounds(250,160,160,40);
t1.setToolTipText("Enter your name");
t2.setToolTipText("Enter your age");
f2.add(t1);
f2.add(t2);
cbg=new CheckboxGroup();
cb1=new Checkbox("Male", cbg,false);
cb2=new Checkbox("Female", cbg,false);
cb1.setBounds(250,220,100,100);
cb2.setBounds(350,220,100,100);
f2.add(cb1);
 f2.add(cb2);
}

// Gui for Frame 3

public void prepareGui3()
{
f3=new JFrame("Frame 3");
f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f3.setSize(1000,600);
f3.setLayout(null);
f3.setVisible(true);
b3=new JButton("Confirm");
b3.setBounds(840,500,100,40);
b4=new JButton(" <- previous");
b4.setBounds(140,500,100,40);
b3.setToolTipText("Click to proceed");
b4.setToolTipText("Click to go back");
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
prepareGui2();
f3.dispose();
}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
s4="Loction :" +  t.getText();
t.setToolTipText("Enter your current location ");
if((i=ls.getSelectedIndex())== 0)
{
prepareFgui();
f3.dispose();
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("\n "+s1+"\n "+s2+"\n "+s3+"\n "+ s4);  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e1){System.out.println(e1);}  

}

else if((i=ls.getSelectedIndex())== 1)
{
prepareMgui();
f3.dispose();
try{      
Socket s=new Socket("localhost",5555);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("\n "+s1+"\n "+s2+"\n "+s3+"\n "+ s4);  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e1){System.out.println(e1);}  

}
else if((i=ls.getSelectedIndex())== 2)
{
prepareRgui();
f3.dispose();
try{      
Socket s=new Socket("localhost",4444);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("\n "+s1+"\n "+s2+"\n "+s3+"\n "+ s4);  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e1){System.out.println(e1);}  

}
else
{
prepareNgui();
f3.dispose();
try{      
Socket s=new Socket("localhost",3333);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("\n "+s1+"\n "+s2+"\n "+s3+"\n "+ s4);  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e1){System.out.println(e1);}  

}

}
});

f3.add(b3);
f3.add(b4);
t=new JTextArea();
t.setBounds(470,100,350,60);
f3.add(t);
l4=new JLabel();
l4.setText("Enter your address");
l4.setBounds(180,100,150,40);
l5=new JLabel();
l5.setText("Select the type of emergency");
l5.setBounds(180,250,250,40);
f3.add(l4); f3.add(l5);
ls=new Choice();
ls.add("Fire");
ls.add("Medical Emergency");
ls.add("Road Accident");
ls.add("Natural Calamity");
ls.setBounds(470,250,350,150);
f3.add(ls);
}

// Gui for Fire frame

public void prepareFgui()
{
fi=new JFrame("Fire");
fi.setSize(1000,600);
fi.setVisible(true);
lfi2=new JLabel();
fi.add(lfi2);
lfi2.setBounds(400,30,100,10);
lfi2.setText(" In case of Fire :");
lfi=new JLabel();
fi.add(lfi);
lfi.setBounds(400,500,150,30);
lfi.setText("Help will arrive shortly ...");




tfi1=new JTextArea();
tfi1.setBounds(20,70,950,20);
tfi2=new JTextArea();
tfi2.setBounds(20,90,950,20);
tfi3=new JTextArea();
tfi3.setBounds(20,110,950,20);
tfi4=new JTextArea();
tfi4.setBounds(20,130,950,20);
tfi5=new JTextArea();
tfi5.setBounds(20,150,950,20);
tfi6=new JTextArea();
tfi6.setBounds(20,170,950,20);
tfi7=new JTextArea();
tfi7.setBounds(20,190,950,20);
tfi8=new JTextArea();
tfi8.setBounds(20,210,950,20);
tfi9=new JTextArea();
tfi9.setBounds(20,230,950,20);
tfi1.setText("Dos ->");
tfi2.setText("Evacuate calmly & quickly whenever a fire alarm sounds Keep important items such as medications & medical equipment handy to avail quickly in case of emergency");
tfi2.setText("->Before opening a door, feel it with the back of your hand & if the door is hot, do not open it");
tfi3.setText("-> On your way out during evacuation, before helping others, cover your face with wet cloth if possible to prevent  hot smoke from entering your lungs");
tfi4.setText("-> If you encounter smoke during your evacuation, stay low to the floor");
tfi5.setText("Don'ts :");
tfi6.setText(" ->Leave candles, incense, barbecue grills or other open flames unattended");
tfi6.append(" Hang tapestries from walls or ceilings");
tfi7.setText(" ->Leave cooking appliances unattended");
tfi7.append(" ->Prop fire or smoke doors open");
tfi8.setText(" ->Use elevators during an evacuation ");
tfi9.setText(" -> Do not panic ");

fi.add(tfi1); fi.add(tfi2); fi.add(tfi3); fi.add(tfi4); fi.add(tfi5); fi.add(tfi6); fi.add(tfi7); fi.add(tfi8); fi.add(tfi9);

fi.setLayout(null);
fi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


// Gui for Medical frame
public void prepareMgui()
{
m=new JFrame("Medical");
m.setSize(1000,600);
m.setVisible(true);
lm2=new JLabel();
m.add(lm2);
lm2.setBounds(400,30,200,30);
lm2.setText(" In case of a medical emergency :");
lm=new JLabel();
m.add(lm);
lm.setBounds(400,500,150,30);
lm.setText("Help will arrive shortly ...");
tm1=new JTextArea();
tm1.setBounds(20,70,950,20);
tm2=new JTextArea();
tm2.setBounds(20,90,950,20);
tm3=new JTextArea();
tm3.setBounds(20,110,950,20);
tm4=new JTextArea();
tm4.setBounds(20,130,950,20);
tm5=new JTextArea();
tm5.setBounds(20,150,950,20);
tm6=new JTextArea();
tm6.setBounds(20,170,950,20);
tm7=new JTextArea();
tm7.setBounds(20,190,950,20);
tm8=new JTextArea();
tm8.setBounds(20,210,950,20);
tm9=new JTextArea();
tm9.setBounds(20,230,950,20);
tm1.setText("Dos ->");
tm2.setText(" Stay by the side of the affected individual for moral support");
tm2.setText("-> Try to stop the bleeding with a cloth, tie the cloth at the affected part if possible ");
tm3.setText("-> In case of breathing difficulty, make the affected individual lie on their left side");
tm4.setText("-> In case the individual is unable to breathe, provide them air artificially, in case the heartbeat is absent, press( with a pumping action)  the left upper left portion of  chest  ");
tm5.setText("Don'ts :");
tm6.setText(" -> Try to fix broken body parts on your own");
tm6.append(" Gather around the individual unnecessarily");
tm7.setText(" -> Try to prescribe medicines on your own");
tm7.append(" -> Ask unnecessary questions to the affected individual");
tm8.setText(" -> Make noise around the individual ");
tm9.setText(" -> Do not panic ");
m.add(tm1); m.add(tm2); m.add(tm3); m.add(tm4); m.add(tm5); m.add(tm6); m.add(tm7); m.add(tm8); m.add(tm9);
m.setLayout(null);
m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

// Gui for Road frame

public void prepareRgui()
{
r=new JFrame("Road Accident");
r.setSize(1000,600);
r.setVisible(true);
lr2=new JLabel();
r.add(lr2);
lr2.setBounds(400,30,200,30);
lr2.setText(" In case of a road accident :");
lr=new JLabel();
r.add(lr);
lr.setBounds(400,500,150,30);
lr.setText("Help will arrive shortly ...");




tr1=new JTextArea();
tr1.setBounds(20,70,950,20);
tr2=new JTextArea();
tr2.setBounds(20,90,950,20);
tr3=new JTextArea();
tr3.setBounds(20,110,950,20);
tr4=new JTextArea();
tr4.setBounds(20,130,950,20);
tr5=new JTextArea();
tr5.setBounds(20,150,950,20);
tr6=new JTextArea();
tr6.setBounds(20,170,950,20);
tr7=new JTextArea();
tr7.setBounds(20,190,950,20);
tr8=new JTextArea();
tr8.setBounds(20,210,950,20);
tr9=new JTextArea();
tr9.setBounds(20,230,950,20);
tr1.setText("Dos ->");
tr2.setText(" Stay by the side of the affected individual for moral support");
tr2.setText("-> Try to stop the bleeding with a cloth, tie the cloth at the affected part if possible ");
tr3.setText("-> In case of breathing difficulty, make the affected individual lie on their left side");
tr4.setText("-> In case the individual is unable to breathe, provide them air artificially, in case the heartbeat is absent, press( with a pumping action)  the left upper left portion of  chest  ");
tr5.setText("Don'ts :");
tr6.setText(" -> Try to fix broken body parts on your own");
tr6.append(" Gather around the individual unnecessarily");
tr7.setText(" -> Try to prescribe medicines on your own");
tr7.append(" -> Ask unnecessary questions to the affected individual");
tr8.setText(" -> Make noise around the individual ");
tr9.setText(" -> Do not panic ");

r.add(tr1); r.add(tr2); r.add(tr3); r.add(tr4); r.add(tr5); r.add(tr6); r.add(tr7); r.add(tr8); r.add(tr9);

r.setLayout(null);
r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


// Gui for Natural calamity frame

public void prepareNgui()
{
n=new JFrame("Natural");
n.setSize(1000,600);
n.setVisible(true);
ln2=new JLabel();
n.add(ln2);
ln2.setBounds(400,30,200,30);
ln2.setText(" In case of a natural calamity:");
ln=new JLabel();
n.add(ln);
ln.setBounds(400,500,150,30);
ln.setText("Help will arrive shortly ...");

tn1=new JTextArea();
tn1.setBounds(20,70,950,20);
tn2=new JTextArea();
tn2.setBounds(20,90,950,20);
tn3=new JTextArea();
tn3.setBounds(20,110,950,20);
tn4=new JTextArea();
tn4.setBounds(20,130,950,20);
tn5=new JTextArea();
tn5.setBounds(20,150,950,20);
tn6=new JTextArea();
tn6.setBounds(20,170,950,20);
tn7=new JTextArea();
tn7.setBounds(20,190,950,20);
tn8=new JTextArea();
tn8.setBounds(20,210,950,20);
tn9=new JTextArea();
tn9.setBounds(20,230,950,20);
tn1.setText("Dos ->");
tn2.setText(" Stay by the side of the affected individual for moral support");
tn2.setText("-> Try to stop the bleeding with a cloth, tie the cloth at the affected part if possible ");
tn3.setText("-> In case of breathing difficulty, make the affected individual lie on their left side");
tn4.setText("-> In case the individual is unable to breathe, provide them air artificially, in case the heartbeat is absent, press( with a pumping action)  the left upper left portion of  chest  ");
tn5.setText("Don'ts :");
tn6.setText(" -> Try to fix broken body parts on your own");
tn6.append(" Gather around the individual unnecessarily");
tn7.setText(" -> Try to prescribe medicines on your own");
tn7.append(" -> Ask unnecessary questions to the affected individual");
tn8.setText(" -> Make noise around the individual ");
tn9.setText(" -> Do not panic ");

n.add(tn1); n.add(tn2); n.add(tn3); n.add(tn4); n.add(tn5); n.add(tn6); n.add(tn7); n.add(tn8); n.add(tn9);

n.setLayout(null);
n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args) throws IOException
{
new X1();
}
}


// Source code for Fire Server
/*
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
*/

