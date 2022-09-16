package MODULE_2.SET_3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame {
    private JTextField txt1, txt2, txt3;
    private JButton submit,op1,op2,op3;
    String d = "add";
    String a,b,c;

    public GUI(){
        super("Calculator");
        setLayout(null);

        
        txt1 = new JTextField();
        txt1.setBounds(10, 10, 100, 20);
        add(txt1);
        
        txt2 = new JTextField();
        txt2.setBounds(120, 10, 100, 20);
        add(txt2);

        submit = new JButton(d);
        submit.setBounds(65, 40, 100, 20);
        add(submit);
        submit.addActionListener(l -> {
            a = txt1.getText();
            b = txt2.getText();
            c = submit.getText();
            calcu cal = new calcu(Integer.parseInt(a), Integer.parseInt(b), c);
            txt3.setText(Integer.toString(cal.add()));
        });
        
        txt3 = new JTextField();
        txt3.setBounds(10, 70, 210, 20);
        add(txt3);
        
        op1 = new JButton(a);
        op1.setBounds(65, 90, 20, 20);
        add(op1);
        op1.addActionListener(l -> {
            a = txt1.getText();
            b = txt2.getText();
            c = submit.getText();
            calcu cal = new calcu(Integer.parseInt(a), Integer.parseInt(b), c);
            txt3.setText(Integer.toString(cal.add()));
        });
    
        op2 = new JButton(b);
        op2.setBounds(105, 90, 20, 20);
        add(op2);
    
        op3 = new JButton(c);
        op3.setBounds(145, 90, 20, 20);
        add(op3);
    }

    public static void main(String[] args) {
        GUI obj = new GUI();

        obj.setSize(250, 150);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
