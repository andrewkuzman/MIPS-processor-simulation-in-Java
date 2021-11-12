package architecture.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reg_list extends JPanel {

    final public int zero = 0;
    public static int at;
    public static int v0;
    public static int v1;
    public static int a0;
    public static int a1;
    public static int a2;
    public static int a3;
    public static int t0;
    public static int t1;
    public static int t2;
    public static int t3;
    public static int t4;
    public static int t5;
    public static int t6;
    public static int t7;
    public static int s0;
    public static int s1;
    public static int s2;
    public static int s3;
    public static int s4;
    public static int s5;
    public static int s6;
    public static int s7;
    public static int t8;
    public static int t9;
    public static int sp;
    public static int ra;

    Font b = new Font("Arch",Font.ITALIC, 15);
    Font a = new Font("Arch",Font.ITALIC ,13 );
    public JLabel titleLeft1 = new JLabel("Register Name:");
    public JLabel titleLeft2 = new JLabel("Register Name:");
    public JLabel titleRight1 = new JLabel("Register Value:");
    public JLabel titleRight2 = new JLabel("Register Value:");
    public JPanel pnlRight = new JPanel();
    public JPanel pnlLeft = new JPanel();
    public JPanel pnltable = new JPanel();
    public Color col = new Color(66, 192, 251);
    //registers for left pnl
    public JLabel lbl$0 = new JLabel("$zero");
    public JLabel val$0 = new JLabel("0", 4);
    public JLabel lbl$at = new JLabel("$at");
    public JLabel val$at = new JLabel(Integer.toString(at), 4);
    public JLabel lbl$v0 = new JLabel("$v0");
    public JLabel val$v0 = new JLabel(Integer.toString(v0), 4);
    public JLabel lbl$v1 = new JLabel("$v1");
    public JLabel val$v1 = new JLabel(Integer.toString(v1), 4);
    public JLabel lbl$a0 = new JLabel("$a0");
    public JLabel val$a0 = new JLabel(Integer.toString(a0), 4);
    public JLabel lbl$a1 = new JLabel("$a1");
    public JLabel val$a1 = new JLabel(Integer.toString(a1), 4);
    public JLabel lbl$a2 = new JLabel("$a2");
    public JLabel val$a2 = new JLabel(Integer.toString(a2), 4);
    public JLabel lbl$a3 = new JLabel("$a3");
    public JLabel val$a3 = new JLabel(Integer.toString(a3), 4);
    public JLabel lbl$t0 = new JLabel("$t0");
    public JLabel val$t0 = new JLabel(Integer.toString(t0), 4);
    public JLabel lbl$t1 = new JLabel("$t1");
    public JLabel val$t1 = new JLabel(Integer.toString(t1), 4);
    public JLabel lbl$t2 = new JLabel("$t2");
    public JLabel val$t2 = new JLabel(Integer.toString(t2), 4);
    public JLabel lbl$t3 = new JLabel("$t3");
    public JLabel val$t3 = new JLabel(Integer.toString(t3), 4);
    public JLabel lbl$t4 = new JLabel("$t4");
    public JLabel val$t4 = new JLabel(Integer.toString(t4), 4);
    public JLabel lbl$t5 = new JLabel("$t5");
    public JLabel val$t5 = new JLabel(Integer.toString(t5), 4);

    // registers for right pnl
    public JLabel lbl$t6 = new JLabel("$t6");
    public JLabel val$t6 = new JLabel(Integer.toString(t6), 4);
    public JLabel lbl$t7 = new JLabel("$t7");
    public JLabel val$t7 = new JLabel(Integer.toString(t7), 4);
    public JLabel lbl$s0 = new JLabel("$s0");
    public JLabel val$s0 = new JLabel(Integer.toString(s0), 4);
    public JLabel lbl$s1 = new JLabel("$s1");
    public JLabel val$s1 = new JLabel(Integer.toString(s1), 4);
    public JLabel lbl$s2 = new JLabel("$s2");
    public JLabel val$s2 = new JLabel(Integer.toString(s2), 4);
    public JLabel lbl$s3 = new JLabel("$s3");
    public JLabel val$s3 = new JLabel(Integer.toString(s3), 4);
    public JLabel lbl$s4 = new JLabel("$s4");
    public JLabel val$s4 = new JLabel(Integer.toString(s4), 4);
    public JLabel lbl$s5 = new JLabel("$s5");
    public JLabel val$s5 = new JLabel(Integer.toString(s5), 4);
    public JLabel lbl$s6 = new JLabel("$s6");
    public JLabel val$s6 = new JLabel(Integer.toString(s6), 4);
    public JLabel lbl$s7 = new JLabel("$s7");
    public JLabel val$s7 = new JLabel(Integer.toString(s7), 4);
    public JLabel lbl$t8 = new JLabel("$t8");
    public JLabel val$t8 = new JLabel(Integer.toString(t8), 4);
    public JLabel lbl$t9 = new JLabel("$t9");
    public JLabel val$t9 = new JLabel(Integer.toString(t9), 4);
    public JLabel lbl$sp = new JLabel("$sp");
    public JLabel val$sp = new JLabel(Integer.toString(sp), 4);
    public JLabel lbl$ra = new JLabel("$ra");
    public JLabel val$ra = new JLabel(Integer.toString(ra), 4);

    public Reg_list() {// we will make more than one constructor depending on R-type,I-type or J-type
        lbl$0.setFont(a);
        lbl$t0.setFont(a);
        lbl$t1.setFont(a);
        lbl$t2.setFont(a);
        lbl$t3.setFont(a);
        lbl$t4.setFont(a);
        lbl$t5.setFont(a);
        lbl$t6.setFont(a);
        lbl$t7.setFont(a);
        lbl$t8.setFont(a);
        lbl$t9.setFont(a);
        lbl$s0.setFont(a);
        lbl$s1.setFont(a);
        lbl$s2.setFont(a);
        lbl$s3.setFont(a);
        lbl$s4.setFont(a);
        lbl$s5.setFont(a);
        lbl$s6.setFont(a);
        lbl$s7.setFont(a);
        lbl$at.setFont(a);
        lbl$a0.setFont(a);
        lbl$a1.setFont(a);
        lbl$a2.setFont(a);
        lbl$a3.setFont(a);
        lbl$v0.setFont(a);
        lbl$v1.setFont(a);
        lbl$ra.setFont(a);
        lbl$sp.setFont(a);
        val$0.setFont(a);
        val$t0.setFont(a);
        val$t1.setFont(a);
        val$t2.setFont(a);
        val$t3.setFont(a);
        val$t4.setFont(a);
        val$t5.setFont(a);
        val$t6.setFont(a);
        val$t7.setFont(a);
        val$t8.setFont(a);
        val$t9.setFont(a);
        val$s0.setFont(a);
        val$s1.setFont(a);
        val$s2.setFont(a);
        val$s3.setFont(a);
        val$s4.setFont(a);
        val$s5.setFont(a);
        val$s6.setFont(a);
        val$s7.setFont(a);
        val$at.setFont(a);
        val$a0.setFont(a);
        val$a1.setFont(a);
        val$a2.setFont(a);
        val$a3.setFont(a);
        val$v0.setFont(a);
        val$v1.setFont(a);
        val$ra.setFont(a);
        val$sp.setFont(a);
        val$at.setText(Integer.toString(at));
        val$v0.setText(Integer.toString(v0));
        val$v1.setText(Integer.toString(v1));
        val$a0.setText(Integer.toString(a0));
        val$a1.setText(Integer.toString(a1));
        val$a2.setText(Integer.toString(a2));
        val$a3.setText(Integer.toString(a3));
        val$t0.setText(Integer.toString(t0));
        val$t1.setText(Integer.toString(t1));
        val$t2.setText(Integer.toString(t2));
        val$t3.setText(Integer.toString(t3));
        val$t4.setText(Integer.toString(t4));
        val$t5.setText(Integer.toString(t5));
        val$t6.setText(Integer.toString(t6));
        val$t7.setText(Integer.toString(t7));
        val$t8.setText(Integer.toString(t8));
        val$t9.setText(Integer.toString(t9));
        val$s0.setText(Integer.toString(s0));
        val$s1.setText(Integer.toString(s1));
        val$s2.setText(Integer.toString(s2));
        val$s3.setText(Integer.toString(s3));
        val$s4.setText(Integer.toString(s4));
        val$s5.setText(Integer.toString(s5));
        val$s6.setText(Integer.toString(s6));
        val$s7.setText(Integer.toString(s7));
        val$sp.setText(Integer.toString(sp));
        val$ra.setText(Integer.toString(ra));
        //-----------------------------------------------------------------------
        //LeftPanel stuff
        //left panel content Borders
        titleLeft1.setFont(b);
        titleLeft2.setFont(b);
        titleRight1.setFont(b);
        titleRight2.setFont(b);
        titleLeft1.setBorder(BorderFactory.createLineBorder(Color.black));
        titleLeft1.setOpaque(true);
        titleLeft1.setBackground(Color.lightGray);
        titleRight1.setBorder(BorderFactory.createLineBorder(Color.black));
        titleRight1.setOpaque(true);
        titleRight1.setBackground(Color.lightGray);
        lbl$0.setBorder(BorderFactory.createLineBorder(Color.black));
        val$0.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$at.setBorder(BorderFactory.createLineBorder(Color.black));
        val$at.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$0.setOpaque(true);
        val$0.setOpaque(true);
        lbl$0.setBackground(col);
        val$0.setBackground(col);
        lbl$v0.setBorder(BorderFactory.createLineBorder(Color.black));
        val$v0.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$v1.setBorder(BorderFactory.createLineBorder(Color.black));
        val$v1.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$v0.setOpaque(true);
        val$v0.setOpaque(true);
        lbl$v0.setBackground(col);
        val$v0.setBackground(col);
        lbl$a0.setBorder(BorderFactory.createLineBorder(Color.black));
        val$a0.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$a1.setBorder(BorderFactory.createLineBorder(Color.black));
        val$a1.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$a0.setOpaque(true);
        val$a0.setOpaque(true);
        lbl$a0.setBackground(col);
        val$a0.setBackground(col);
        lbl$a2.setBorder(BorderFactory.createLineBorder(Color.black));
        val$a2.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$a3.setBorder(BorderFactory.createLineBorder(Color.black));
        val$a3.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$a2.setOpaque(true);
        val$a2.setOpaque(true);
        lbl$a2.setBackground(col);
        val$a2.setBackground(col);
        lbl$t0.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t0.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t1.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t1.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t0.setOpaque(true);
        val$t0.setOpaque(true);
        lbl$t0.setBackground(col);
        val$t0.setBackground(col);
        lbl$t2.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t2.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t3.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t3.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t2.setOpaque(true);
        val$t2.setOpaque(true);
        lbl$t2.setBackground(col);
        val$t2.setBackground(col);
        lbl$t4.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t4.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t5.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t5.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t4.setOpaque(true);
        val$t4.setOpaque(true);
        lbl$t4.setBackground(col);
        val$t4.setBackground(col);
        //Right Panel content Borders
        titleLeft2.setBorder(BorderFactory.createLineBorder(Color.black));
        titleLeft2.setOpaque(true);
        titleLeft2.setBackground(Color.lightGray);
        titleRight2.setBorder(BorderFactory.createLineBorder(Color.black));
        titleRight2.setOpaque(true);
        titleRight2.setBackground(Color.lightGray);
        lbl$t6.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t6.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t7.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t7.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t6.setOpaque(true);
        val$t6.setOpaque(true);
        lbl$t6.setBackground(col);
        val$t6.setBackground(col);
        lbl$s0.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s0.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s1.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s1.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s0.setOpaque(true);
        val$s0.setOpaque(true);
        lbl$s0.setBackground(col);
        val$s0.setBackground(col);
        lbl$s2.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s2.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s3.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s3.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s2.setOpaque(true);
        val$s2.setOpaque(true);
        lbl$s2.setBackground(col);
        val$s2.setBackground(col);
        lbl$s4.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s4.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s5.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s5.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s4.setOpaque(true);
        val$s4.setOpaque(true);
        lbl$s4.setBackground(col);
        val$s4.setBackground(col);
        lbl$s6.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s6.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s7.setBorder(BorderFactory.createLineBorder(Color.black));
        val$s7.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$s6.setOpaque(true);
        val$s6.setOpaque(true);
        lbl$s6.setBackground(col);
        val$s6.setBackground(col);
        lbl$t8.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t8.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t9.setBorder(BorderFactory.createLineBorder(Color.black));
        val$t9.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$t8.setOpaque(true);
        val$t8.setOpaque(true);
        lbl$t8.setBackground(col);
        val$t8.setBackground(col);
        lbl$sp.setBorder(BorderFactory.createLineBorder(Color.black));
        val$sp.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$ra.setBorder(BorderFactory.createLineBorder(Color.black));
        val$ra.setBorder(BorderFactory.createLineBorder(Color.black));
        lbl$sp.setOpaque(true);
        val$sp.setOpaque(true);
        lbl$sp.setBackground(col);
        val$sp.setBackground(col);

        //Right Paneel content
        pnlRight.setLayout(new GridLayout(15, 2));
        pnlRight.add(titleLeft2);
        pnlRight.add(titleRight2);
        pnlRight.add(lbl$t6);
        pnlRight.add(val$t6);
        pnlRight.add(lbl$t7);
        pnlRight.add(val$t7);
        pnlRight.add(lbl$s0);
        pnlRight.add(val$s0);
        pnlRight.add(lbl$s1);
        pnlRight.add(val$s1);
        pnlRight.add(lbl$s2);
        pnlRight.add(val$s2);
        pnlRight.add(lbl$s3);
        pnlRight.add(val$s3);
        pnlRight.add(lbl$s4);
        pnlRight.add(val$s4);
        pnlRight.add(lbl$s5);
        pnlRight.add(val$s5);
        pnlRight.add(lbl$s6);
        pnlRight.add(val$s6);
        pnlRight.add(lbl$s7);
        pnlRight.add(val$s7);
        pnlRight.add(lbl$t8);
        pnlRight.add(val$t8);
        pnlRight.add(lbl$t9);
        pnlRight.add(val$t9);
        pnlRight.add(lbl$sp);
        pnlRight.add(val$sp);
        pnlRight.add(lbl$ra);
        pnlRight.add(val$ra);

        //leftPanel content
        pnlLeft.setLayout(new GridLayout(15, 2));
        pnlLeft.add(titleLeft1);
        pnlLeft.add(titleRight1);
        pnlLeft.add(lbl$0);
        pnlLeft.add(val$0);
        pnlLeft.add(lbl$at);
        pnlLeft.add(val$at);
        pnlLeft.add(lbl$v0);
        pnlLeft.add(val$v0);
        pnlLeft.add(lbl$v1);
        pnlLeft.add(val$v1);
        pnlLeft.add(lbl$a0);
        pnlLeft.add(val$a0);
        pnlLeft.add(lbl$a1);
        pnlLeft.add(val$a1);
        pnlLeft.add(lbl$a2);
        pnlLeft.add(val$a2);
        pnlLeft.add(lbl$a3);
        pnlLeft.add(val$a3);
        pnlLeft.add(lbl$t0);
        pnlLeft.add(val$t0);
        pnlLeft.add(lbl$t1);
        pnlLeft.add(val$t1);
        pnlLeft.add(lbl$t2);
        pnlLeft.add(val$t2);
        pnlLeft.add(lbl$t3);
        pnlLeft.add(val$t3);
        pnlLeft.add(lbl$t4);
        pnlLeft.add(val$t4);
        pnlLeft.add(lbl$t5);
        pnlLeft.add(val$t5);

        //final panel stuff for table
        pnltable.setLayout(new GridLayout(1, 2));
        pnltable.setBorder(BorderFactory.createTitledBorder("Registers"));
        pnltable.add(pnlLeft);
        pnltable.add(pnlRight);
        this.add(pnltable);
    }

    public void setReg(int index, int val) {
        switch (index) {

            case 0:
                val = 0;

                return;
            case 1:
                t0 = val;
                return;
            case 2:
                t1 = val;
                return;
            case 3:
                t2 = val;
                return;
            case 4:
                t3 = val;
                return;
            case 5:
                t4 = val;
                return;
            case 6:
                t5 = val;
                return;
            case 7:
                t6 = val;
                return;
            case 8:
                t7 = val;
                return;
            case 9:
                t8 = val;
                return;
            case 10:
                t9 = val;
                return;
            case 11:
                s0 = val;
                return;
            case 12:
                s1 = val;
                return;
            case 13:
                s2 = val;
                return;
            case 14:
                s3 = val;
                return;
            case 15:
                s4 = val;
                return;
            case 16:
                s5 = val;
                return;
            case 17:
                s6 = val;
                return;
            case 18:
                s7 = val;
                return;
            case 19:
                at = val;
                return;
            case 20:
                a0 = val;
                return;
            case 21:
                a1 = val;
                return;
            case 22:
                a2 = val;
                return;
            case 23:
                a3 = val;
                return;
            case 24:
                v0 = val;
                return;
            case 25:
                v1 = val;
                return;
            case 26:
                ra = val;
                return;
            case 27:
                sp = val;
                return;
        }
    }

    public String getReg(int index) {
        String s = null;
        switch (index) {
            case 0:
                s = "0";
                break;
            case 1:
                s = "$t0";
                break;
            case 2:
                s = "$t1";
                break;
            case 3:
                s = "$t2";
                break;
            case 4:
                s = "$t3";
                break;
            case 5:
                s = "t4";
                break;
            case 6:
                s = "$t5";
                break;
            case 7:
                s = "$t6";
                break;
            case 8:
                s = "$t7";
                break;
            case 9:
                s = "$t8";
                break;
            case 10:
                s = "$t9";
                break;
            case 11:
                s = "$s0";
                break;
            case 12:
                s = "$s1";
                break;
            case 13:
                s = "$s2";
                break;
            case 14:
                s = "$s3";
                break;
            case 15:
                s = "$s4";
                break;
            case 16:
                s = "$s5";
                break;
            case 17:
                s = "$s6";
                break;
            case 18:
                s = "$s7";
                break;
            case 19:
                s = "$at";
                break;
            case 20:
                s = "$a0";
                break;
            case 21:
                s = "$a1";
                break;
            case 22:
                s = "$a2";
                break;
            case 23:
                s = "$a3";
                break;
            case 24:
                s = "$v0";
                break;
            case 25:
                s = "$v1";
                break;
            case 26:
                s = "$ra";
                break;
            case 27:
                s = "$sp";
                break;
        }
        return s;
    }

}
