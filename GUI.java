import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI implements ActionListener{
 JCheckBox cb; JButton b;
    public void actionPerformed(ActionEvent e){
      if(cb.isSelected()){
           JOptionPane.showMessageDialog(b, "Registration Successfull");
      }
      else{
           JOptionPane.showMessageDialog(b, "Please Accept The Terms And Condition!");
      }
  
    }
    
    GUI(){
        JFrame f= new JFrame("Registration Form");
        f.setSize(800,1000);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.GRAY);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        f.setLayout(null);
        ImageIcon i = new ImageIcon("imge.png");
        JLabel l= new JLabel(i);
        l.setBounds(80,00,350,300);
        f.getContentPane().add(l);
        JLabel l1= new JLabel("Dua's Registration Form");
        l1.setBounds(400,130,300,30);
        l1.setFont(new Font("TimesRoman", Font.BOLD, 20));
        l1.setForeground(Color.white);
        f.getContentPane().add(l1);
        JLabel l2= new JLabel("Name: ");
        l2.setBounds(200,300,100,30);
        l2.setFont(new Font("DialogInput", Font.PLAIN, 18));
        l2.setForeground(Color.white);
        f.getContentPane().add(l2);
        JTextField t = new JTextField();
        t.setBounds(350,300,150,30);
        f.getContentPane().add(t);
        JLabel l3= new JLabel("Password: ");
        l3.setBounds(200,350,120,30);
        l3.setFont(new Font("DialogInput", Font.PLAIN, 18));
        l3.setForeground(Color.WHITE);
        f.getContentPane().add(l3);
        JPasswordField p= new JPasswordField();
        p.setBounds(350,350,150,30);
        f.getContentPane().add(p);
        JLabel l4= new JLabel("Gender: ");
        l4.setBounds(200,400,100,30);
        l4.setFont(new Font("DialogInput", Font.PLAIN, 18));
        l4.setForeground(Color.WHITE);
        f.getContentPane().add(l4);
        JRadioButton r= new JRadioButton("Male");
        r.setBounds(350,400,100,30);
        JRadioButton r1= new JRadioButton("Female");
        r1.setBounds(450,400,100,30);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r); bg.add(r1);
        f.getContentPane().add(r); f.getContentPane().add(r1);
        JLabel l5 = new JLabel("City: ");
        l5.setBounds(200,450,100,30);
        l5.setFont(new Font("DialogInput", Font.PLAIN, 18));
        l5.setForeground(Color.WHITE);
        f.getContentPane().add(l5);
        String Choice[]= {"Hyderabad", "Jamshoro", "Karachi", "Dadu", "Lahore", "Islamabad", "Quetta"};
        JComboBox c= new JComboBox(Choice);
        c.setBounds(350,450,100,30);
        f.getContentPane().add(c);
        JLabel l6= new JLabel("Email: ");
        l6.setBounds(200, 500, 100, 30);
        l6.setFont(new Font("DialogInput", Font.PLAIN, 18));
        l6.setForeground(Color.WHITE);
        f.getContentPane().add(l6);
        JTextField t1= new JTextField();
        t1.setBounds(350,500,150,30);
        f.getContentPane().add(t1);
        JLabel l7= new JLabel("Phone: ");
        l7.setBounds(200,550,100,30);
        l7.setFont(new Font("DialogInput", Font.PLAIN, 18));
        l7.setForeground(Color.WHITE);
        f.getContentPane().add(l7);
        JTextField t2= new JTextField();
        t2.setColumns(11);
        t2.addKeyListener(new KeyAdapter() {
          public void keyPressed(KeyEvent ke) {
            JLabel msg= new JLabel("");
            msg.setBounds(200,600,100,30);
            f.getContentPane().add(msg);
             String value = t2.getText();
             int l = value.length();
             if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                t2.setEditable(true);
                msg.setText("");
             } else {
                t2.setEditable(false);
                JOptionPane.showMessageDialog(t2, "Please Enter Only Numbers From 0-9");
             }
          }
       });
       t2.setBounds(350,550,150,30);
       f.getContentPane().add(t2);
        cb= new JCheckBox("Agreed To Terms And Condition");
        cb.setBounds(250,600,210,30);
        f.getContentPane().add(cb);
        b= new JButton("Register");
        b.setBounds(350,650,100,30);
        b.addActionListener(this);
        f.getContentPane().add(b);
        JButton b1= new JButton("Clear");
        b1.setBounds(450,650,100,30);
        b1.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
          cb.setSelected(false);
          t.setText(null);
          p.setText(null);
          r.setSelected(false);
          r1.setSelected(false);
          bg.clearSelection();
          t1.setText(null);
          t2.setText(null);
          c.setSelectedIndex(0);
          }
        }
        );
        f.getContentPane().add(b1);}
    public static void main(String[] args) {
       new GUI();
 }
}