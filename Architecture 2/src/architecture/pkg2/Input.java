package architecture.pkg2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Variables {

    public void Varaibles() {
    }
    public static int n;
    public static JLabel[][] pp = new JLabel[1000][10000];
}

public class Input extends JFrame {

    Variables an = new Variables();
    static int j = 0;
    static int i = 0;

    private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    Font a = new Font("Arch", Font.BOLD, 18);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JButton ok = new JButton("OK");
    JButton clr = new JButton("Clear");

    int[][] ppN = new int[1000][1000];
    TextField t = new TextField();
    JLabel no = new JLabel();

    public JLabel[][] get_pp() {
        return an.pp;
    }

    public Input() {
        setBounds(0, 0, d.width, d.height - 50);
        setVisible(true);
        setTitle("Arch v1.0");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //-------------------------------------------------------------------
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(p1, BorderLayout.NORTH); // adding base Panel
        c.add(p2, BorderLayout.CENTER); // adding base Panel
        c.add(p3, BorderLayout.EAST); // adding base Panel
        c.add(p4, BorderLayout.SOUTH); // adding base Panel
        c.add(p5, BorderLayout.WEST);
        p4.setPreferredSize(new Dimension(2,400));
        p2.setBackground(Color.WHITE); // Center Colour
        p3.setBackground(Color.WHITE);//East panel colour
        p4.setBackground(Color.WHITE); // South Colour
        p3.setLayout(new GridLayout(1, 1)); // East Layout
        p3.setFont(a);

        //---------------------------------------------------------------------
        p1.setLayout(new GridLayout(1, 4)); // Creating the upper Label's Contents
        no.setText("Input Number of Instructoins (.Data,...etc is included)");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_ok();
                main_label();
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_clr();
            }
        });
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Text_Field();
            }
        });

        no.setFont(a);
        t.setFont(a);
        p1.add(no);
        p1.add(t);
        p1.add(ok);
        p1.add(clr);
        this.validate();
        //---------------------------------------------------------------------
    }

    public void btn_ok() { //Action Performed when OK button is pressed
        an.n = Integer.parseInt(t.getText());
        t.setText("OK");
        t.setEnabled(false);
        ok.setEnabled(false);
    }

    public void btn_clr() {
        p2.removeAll();
        i = 0;
        j = 0;

        this.repaint();
        t.setEnabled(true);
        ok.setEnabled(true);
    }

    public void Text_Field() {
        btn_ok();
        main_label();
        t.setEnabled(false);
        ok.setEnabled(false);
    }

    public void main_label() { // Labels Used for the inputed program

        p2.setLayout(new GridLayout(an.n, 5)); // Setting Layout of Center Label
        for (int i = 0; i < an.n; i++) {      // Loop for Creating the ouput Labels
            for (int j = 0; j < 5; j++) {

                an.pp[i][j] = new JLabel(" ");
                an.pp[i][j].setFont(a);
                an.pp[i][j].setBorder(BorderFactory.createRaisedSoftBevelBorder());
                p2.add(an.pp[i][j]);
            }
        }
        this.validate(); //to refresh the app.
        //---------------------------------------------------------------------    }

    }

}
