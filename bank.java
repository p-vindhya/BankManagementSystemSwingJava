import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
class bank{
public static void main(String[]args){
JFrame f=new JFrame("BANK MANAGEMENT SYSTEM");
JLabel label = new JLabel();
int n=3;
label.setBounds(20,150, 200,50);

JPasswordField value = new JPasswordField();

value.setBounds(100,75,100,30);

JLabel l1=new JLabel("UserId:");

l1.setBounds(20,20, 80,30);

JLabel l2=new JLabel("Password:");

l2.setBounds(20,75, 80,30);

JButton b = new JButton("Login");

b.setBounds(100,120, 80,30);

JTextField text = new JTextField();

text.setBounds(100,20, 100,30);
f.add(b);f.add(value); f.add(l1);f.add(l2);f.add(text);
f.getContentPane().setBackground(Color.LIGHT_GRAY);
f.setSize(300,300);

f.setLayout(null);

f.setVisible(true);
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
b.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
	if(new String(value.getPassword()).equals("12345")&&text.getText().equals("vindhya")){
	
JFrame f1=new JFrame("iBANKING");
JButton j1=new JButton("WithDraw");
JButton j2=new JButton("Deposit");
JButton j3=new JButton("Create New Account");
JButton j4=new JButton("Transfer");
JButton j5=new JButton("Display customer details");
j1.setBounds(30,30,100,30);
j2.setBounds(30,80,100,30);
j3.setBounds(30,130,190,30);
j4.setBounds(30,180,100,30);
j5.setBounds(30,230,290,30);
f1.add(j1);f1.add(j2);f1.add(j3);f1.add(j4);f1.add(j5);

f1.setSize(400,500);

f1.setLayout(null);

f1.setVisible(true);
j5.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		JFrame e1=new JFrame("Details:");
String data[][]={{"raju","123","70000","1234567890"},{"ravi","456","10000","0987654321"},{"rahul","789","1000000","1230987654"}};
String column[]={"Name","Accont number","Balance","phone no"};

JTable jt=new JTable(data,column);
jt.setBounds(30,40,300,300);
JScrollPane sp=new JScrollPane(jt);
e1.add(sp);
e1.setSize(800,500);
e1.setVisible(true);
e1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}});
j4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		JFrame m2=new JFrame("Transfer");
		JLabel x=new JLabel("Applicant Name");
		JLabel x1=new JLabel("Debit Account Number:");
		JLabel x2=new JLabel("Amount :");
		JLabel x3=new JLabel("Credit Account :");
	
		JButton y1=new JButton("Transfer");
		
		JTextField z1=new JTextField();
		JTextField z2=new JTextField();
		JTextField z3=new JTextField();
		JTextField z4=new JTextField();
		
		x.setBounds(30,30,150,30);
		z1.setBounds(200,30,150,30);
		x1.setBounds(30,80,200,30);
		z2.setBounds(260,80,100,30);
		x2.setBounds(30,120,100,30);
		z3.setBounds(150,120,100,30);
		x3.setBounds(30,160,150,30);
		z4.setBounds(200,160,150,30);
		
		y1.setBounds(280,280,100,40);
		m2.add(y1);m2.add(z1);m2.add(z2);m2.add(z3);m2.add(z4);m2.add(x);
		m2.add(x1);m2.add(x2);m2.add(x3);
		y1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(m2,"Transaction Succesfull");}});
		
		m2.setSize(800,500);

m2.setLayout(null);

m2.setVisible(true);
m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}});

j1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		JFrame e1=new JFrame("Details:");
String data[][]={{"raju","123","70000","1234567890"},{"ravi","456","10000","0987654321"},{"rahul","789","1000000","1230987654"}};
String column[]={"Name","Accont number","Balance","phone no"};

JTable jt=new JTable(data,column);
JLabel jl=new JLabel("Click on the balance of the  person you want to withdraw money");
jl.setBounds(30,350,450,50);
jt.setBounds(30,40,300,300);
JScrollPane sp=new JScrollPane(jt);
e1.add(jl);
e1.add(sp);
e1.setSize(800,500);
e1.setVisible(true);

jt.setCellSelectionEnabled(true);

ListSelectionModel select= jt.getSelectionModel();

select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
select.addListSelectionListener(new ListSelectionListener() {

public void valueChanged(ListSelectionEvent e) {
	JFrame w1=new JFrame("Withdraw");
		JLabel ba=new JLabel("Balance:");
JLabel atw=new JLabel("Amount Of Be Withdrawn");
JLabel BA=new JLabel("Balance Available");
JButton w=new JButton("Withdraw");
JTextField t3=new JTextField();
JTextField t4=new JTextField();
JTextField t5=new JTextField();
ba.setBounds(30,160,100,20);
atw.setBounds(30,190,200,20);
w.setBounds(450,220,100,30);

t3.setBounds(150,160,100,20);
t4.setBounds(250,190,200,20);
BA.setBounds(30,260,190,30);
t5.setBounds(235,260,150,30);
w1.add(w);w1.add(t3);w1.add(t4);w1.add(t5);w1.add(ba);w1.add(atw);w1.add(BA);



w1.setSize(1000,900);
w1.setLayout(null);
w1.setVisible(true);

String Data = null;

int[] row = jt.getSelectedRows();

int[] columns = jt.getSelectedColumns();

for (int i = 0; i < row.length; i++) {

for(int j=0;j<columns.length;j++){
	

t3.setText( (String) jt.getValueAt(row[i], columns[j]));
}}
w.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
int one=Integer.parseInt(t3.getText());
int two=Integer.parseInt(t4.getText());
String answer=String.valueOf(one-two);
t5.setText(answer);}});


	}});

}});


j2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		
		
		
		
		Frame e1=new JFrame("Details:");
String data[][]={{"raju","123","70000","1234567890"},{"ravi","456","10000","0987654321"},{"rahul","789","1000000","1230987654"}};
String column[]={"Name","Accont number","Balance","phone no"};

JTable jt=new JTable(data,column);
JLabel jl1=new JLabel("Click on the balance of the person you want to deposit money");
jl1.setBounds(30,350,450,50);
jt.setBounds(30,40,300,300);
JScrollPane sp=new JScrollPane(jt);
e1.add(jl1);
e1.add(sp);
e1.setSize(800,500);
e1.setVisible(true);

jt.setCellSelectionEnabled(true);

ListSelectionModel select= jt.getSelectionModel();

select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
select.addListSelectionListener(new ListSelectionListener() {

public void valueChanged(ListSelectionEvent e) {
		
		
		
		
	    JFrame fr=new JFrame("DEPOSIT");
		//JLabel an=new JLabel("Applicant name");
		JLabel ac=new JLabel("Account Balance");
		JLabel de=new JLabel("Amount to be deposited");
		JLabel t=new JLabel("Balance Available:");
		JButton D=new JButton("Deposit");
		//JTextField s1=new JTextField();
		JTextField s2=new JTextField();
		JTextField s3=new JTextField();
		JTextField s4=new JTextField();
		//an.setBounds(30,30,150,30);
		ac.setBounds(30,80,150,30);
		de.setBounds(30,120,150,30);
		t.setBounds(30,160,150,30);
		//s1.setBounds(190,30,150,30);
		s2.setBounds(190,80,150,30);
		s3.setBounds(190,120,150,30);
		s4.setBounds(190,160,150,30);
		D.setBounds(290,220,100,40);
		fr.add(D);fr.add(s2);fr.add(s3);fr.add(s4);fr.add(ac);
		fr.add(de);fr.add(t);
		fr.setSize(1000,800);
		
		
		
		String Data = null;

int[] row = jt.getSelectedRows();

int[] columns = jt.getSelectedColumns();
int i,j;
for ( i = 0; i < row.length; i++) {

for(j=0;j<columns.length;j++){
	

s2.setText( (String) jt.getValueAt(row[i], columns[j]));


}}

D.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		
int o=Integer.parseInt(s2.getText());
int t=Integer.parseInt(s3.getText());
String answer=String.valueOf(o+t);
s4.setText(answer);}});
		
fr.setLayout(null);
fr.setVisible(true);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}});
}});

j3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	JFrame f3=new JFrame("New Acccount Form");
	String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
String year[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
	JTextField name=new JTextField();
	JTextField guardian =new JTextField();
	JTextField mother =new JTextField();         
	JTextField address=new JTextField();
	JTextField street=new JTextField();
	JTextField state=new JTextField();
	JTextField nation=new JTextField();
	JTextField pin=new JTextField();
	JTextField phno=new JTextField();
	JTextField city=new JTextField();
	JTextField email=new JTextField();
	JButton save=new JButton("Save");
	
	JLabel na=new JLabel("Applicant Name:");
	JLabel c=new JLabel("Customer Type:");
	JLabel fn=new JLabel("Name of Guardian:");
	JLabel mm=new JLabel("Mother's Name:");
	JLabel n=new JLabel("Nationality:");
	JLabel ms=new JLabel("Marital Status:");
	JLabel dob=new JLabel("Date Of Birth:");
	JLabel a=new JLabel("correspondence Address:");
	JLabel lm=new JLabel("Landmark/Street:");
	JLabel s=new JLabel("State:");
	JLabel p=new JLabel("Pincode:");
	JLabel ph=new JLabel("Phone No:");
	JLabel ci=new JLabel("City:");
	JLabel em=new JLabel("Email Address:");
	JLabel g=new JLabel("Gender:");
	JComboBox d=new JComboBox(date);
JComboBox m=new JComboBox(month);
JComboBox y=new JComboBox(year);

JRadioButton r1=new JRadioButton("Male");
JRadioButton r2=new JRadioButton("Female");
ButtonGroup bg=new ButtonGroup();
JRadioButton m1=new JRadioButton("Married");
JRadioButton um=new JRadioButton("UnMarried");
ButtonGroup bg1=new ButtonGroup();
JRadioButton c1=new JRadioButton("public ");
JRadioButton c2=new JRadioButton("staff");
ButtonGroup bg2=new ButtonGroup();
bg2.add(c1);bg2.add(c2);
na.setBounds(8,8,150,30);
name.setBounds(8,45,250,38);
c.setBounds(300,45,120,30);
c1.setBounds(425,45,90,30);
c2.setBounds(519,45,100,30);
fn.setBounds(8,100,150,30);
guardian.setBounds(8,140,250,30);
n.setBounds(165,100,130,30);
nation.setBounds(300,100,130,30);
dob.setBounds(8,180,100,30);
d.setBounds(115,180,95,30);
m.setBounds(215,180,130,30);
y.setBounds(355,180,100,30);
g.setBounds(510,180,100,30);
r1.setBounds(620,180,100,30);
r2.setBounds(725,180,100,30);
mm.setBounds(8,220,100,30);
mother.setBounds(8,255,199,30);
ms.setBounds(280,220,100,30);
m1.setBounds(390,220,100,30);
um.setBounds(490,220,100,30);
a.setBounds(8,300,200,30);
address.setBounds(8,345,260,50);
lm.setBounds(8,405,150,30);
street.setBounds(165,405,150,30);
s.setBounds(320,405,100,30);
state.setBounds(425,405,150,30);
ci.setBounds(585,405,100,30);
city.setBounds(690,405,150,30);
p.setBounds(8,440,100,30);
pin.setBounds(115,440,100,30);
ph.setBounds(225,440,100,30);
phno.setBounds(330,440,100,30);
em.setBounds(8,480,100,30);
email.setBounds(115,480,190,30);
save.setBounds(480,530,100,30);
f3.add(save);f3.add(name);f3.add(guardian);f3.add(mother);f3.add(nation);f3.add(address);f3.add(street);
	f3.add(state);f3.add(pin);f3.add(phno);f3.add(city);f3.add(email);f3.add(c1);f3.add(c2);
f3.add(na);f3.add(c);f3.add(fn);f3.add(mm);f3.add(n);f3.add(ms);f3.add(dob);f3.add(a);
f3.add(lm);f3.add(s);f3.add(p);f3.add(ph);f3.add(ci);f3.add(em);f3.add(d);f3.add(m);f3.add(y);f3.add(g);
f3.add(r1);f3.add(r2);f3.add(m1);f3.add(um);
bg1.add(m1);bg1.add(um);
bg.add(r1);bg.add(r2);
save.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		JFrame d1=new JFrame("New account details");
		JTextArea ta1=new JTextArea();
		
		String msg="";
	String gen="";
	String mmm="";
	int da =d.getSelectedIndex();
String DA="";

if(da!=-1)
	DA=date[da];

		int mo=m.getSelectedIndex();
		String MO="";
		
		if(mo!=-1)
			MO=month[mo];
		
		int ye=y.getSelectedIndex();
		String yea="";
		if(ye!=-1)
			yea=year[ye];
		
		
		
	if(c1.isSelected())
msg="Public";
if(c2.isSelected())
msg="Staff";	
		if(r1.isSelected())
			gen="Male";
		if(r2.isSelected())
			gen="Female";
		if(m1.isSelected())
		mmm="Married";
if(um.isSelected())
mmm="UnMarried";	
		
ta1.setText("The name of the applicany is "+name.getText()+ " \n The name of the applicant's father is "
  +guardian.getText()+"\n Name of the applicanys mother is "+mother.getText()+"\nThe  gender of the applicant is "
		+gen+"\n The customer type of the applicant is "+msg+"\nThe applicant is "+mmm+"\n The date of birth of applicant is "
			+DA+"-"+MO+"-"+yea+"\n Nationality :"+nation.getText()+"\n Address of the applicant is "+address.getText()+","+street.getText()+","
 +state.getText()+" , "+city.getText()+" , "+pin.getText()+"\n Phone number of applicant is "+phno.getText()+ "\n Email Id of applicant is "+email.getText());
		
		
		ta1.setBounds(30,30,550,600);
		d1.add(ta1);
		d1.setSize(1000,800);
d1.setLayout(null);
d1.setVisible(true);
}});
f3.setSize(1000,800);
f3.setLayout(null);
f3.setVisible(true);
f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}});
}
else{
	JOptionPane.showMessageDialog(f,"userid or password incorrect","Alert",JOptionPane.WARNING_MESSAGE);
	
}

}

});
}}
