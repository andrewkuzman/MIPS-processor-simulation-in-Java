package architecture.pkg2;

import static architecture.pkg2.Input.i;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static architecture.pkg2.Reg_list.*;

class $Value {

    public $Value() {
    }
    public static int $_V[] = new int[28];
}

public class Buttons extends Input implements ActionListener {

    $Value V = new $Value();
    Variables an = new Variables();
    public static int BEQ_BNE_Value;
    public static String[] redDst = new String[1024];
    public static String[] branch = new String[1024];
    public static String[] memRead = new String[1024];
    public static String[] memToReg = new String[1024];
    public static String[] aluOp = new String[1024];
    public static String[] memwrite = new String[1024];
    public static String[] aluSrc = new String[1024];
    public static String[] regWrite = new String[1024];
    public static String[] jump = new String[1024];

    public static int[] memw = new int[1024];
    public static int[] memh = new int[1024];
    public static int[] memb = new int[1024];
    public int txt;
    /*panels are named p+no, p10 is 1st panel in buttons panel, p20 2nd, etc..*/
    //Registers' values

    //stp1 is equivalent to rd
    //stp2 is equivalent to rs
    //stp3 is equivalent to rt
    //stp1,stp2 and stp3 are integers that make me know which register is rd, which is rs and rt
    private int stp1;
    private int stp2;
    private int stp3;

    //----------------------------------------------------------------------------------------
    private JPanel p10 = new JPanel(); //for (.data,.text,....and finish)
    private JPanel p20 = new JPanel(); //for labels and 2 textboxes
    private JPanel p30_1 = new JPanel();//Rformat instructions buttons
    private JPanel p30_2 = new JPanel(); //Iformat instructions buttons
    private JPanel p30_3 = new JPanel(); //j format and pseudo instructions buttons
    private JPanel p40_1 = new JPanel(); //$t registers 
    private JPanel p40_2 = new JPanel(); //$s registers
    private JPanel p40_3 = new JPanel(); //other registers

    private JPanel p30 = new JPanel(); //instructions(contain p30_1 , p30_2 and p30_3)
    private JPanel p40 = new JPanel(); //registers(contain p40_1 , p40_2 and p40_3)
    private JPanel pnl = new JPanel(); //pnl will contain p10 and p20

    /* Buttons are named B+no, B1 are buttons in 1st  buttonspanel, B2 are buttons in 2nd buttonspanel, etc..*/
    private JButton B1[] = new JButton[4];
    private JButton B2[] = new JButton[8];
    private JButton B3[] = new JButton[31];
    private JButton B4[] = new JButton[32];
    /*labels are named L+no, L1 are labels in 1st  buttonspanel, L2 are labels in 2nd buttonspanel, etc..*/
    private JLabel L2[] = new JLabel[3];
    private JLabel L3[] = new JLabel[4];
    private JLabel L4[] = new JLabel[3];

    Container c = getContentPane();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    private JTextField txtnumber = new JTextField();
    public static JTextField txtaddress = new JTextField();
    public static int address;
//*************************************************************************************************************
//   0 "$zero"
//   1 "$t0"
//   2 "$t1"
//   3 "$t2"
//   4 "$t3"
//   5 "$t4"
//   6 "$t5"
//   7 "$t6"
//   8 "$t7"
//   9 "$t8"
//   10 "$t9"
//   11 "$s0"
//   12 "$s1"
//   13 "$s2"
//   14 "$s3"
//   15 "$s4"
//   16 "$s5"
//   17 "$s6"
//   18 "$s7" 
//   19 "$at"
//   20 "$a0"
//   21 "$a1"
//   22 "$a2"
//   23 "$a3"    
//   24"$v0"
//   25"$v1"
//   26 "$ra"
//   27 "$sp"

    public void control() {
        for (int k = 0; k < an.n; k++) {
            redDst[k] = null;
            branch[k] = null;
            memRead[k] = null;
            memToReg[k] = null;
            aluOp[k] = null;
            memwrite[k] = null;
            aluSrc[k] = null;
            regWrite[k] = null;
            jump[k] = null;
        }
        for (int x = 0; x < an.n; x++) {
            switch (an.pp[x][1].getText()) {
                case "add":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "or":
                case "nor":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "and":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "sub":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "slt":
                case "sltu":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "sll":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "srl":
                    redDst[x] = "1";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "lw":
                case "lh":
                case "lb":
                case "lhu":
                case "lbu":
                    redDst[x] = "0";
                    branch[x] = "0";
                    memRead[x] = "1";
                    memToReg[x] = "1";
                    aluOp[x] = "00";
                    memwrite[x] = "0";
                    aluSrc[x] = "1";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "sw":
                case "sh":
                case "sb":
                    redDst[x] = "X";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "X";
                    aluOp[x] = "00";
                    memwrite[x] = "1";
                    aluSrc[x] = "1";
                    regWrite[x] = "0";
                    jump[x] = "0";
                    break;
                case "beq":
                case "bne":
                    redDst[x] = "X";
                    branch[x] = "1";
                    memRead[x] = "0";
                    memToReg[x] = "X";
                    aluOp[x] = "01";
                    memwrite[x] = "0";
                    aluSrc[x] = "0";
                    regWrite[x] = "0";
                    jump[x] = "0";
                    break;
                case "j":
                    redDst[x] = "X";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "X";
                    aluOp[x] = "XX";
                    memwrite[x] = "0";
                    aluSrc[x] = "X";
                    regWrite[x] = "0";
                    jump[x] = "1";
                    break;
                case "jal":
                    redDst[x] = "X";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "X";
                    aluOp[x] = "XX";
                    memwrite[x] = "0";
                    aluSrc[x] = "X";
                    regWrite[x] = "0";
                    jump[x] = "1";
                    break;
                case "addi":
                    redDst[x] = "0";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "1";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "slti":
                case "sltui":
                    redDst[x] = "0";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "1";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "ori":
                    redDst[x] = "0";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "1";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                case "andi":
                    redDst[x] = "0";
                    branch[x] = "0";
                    memRead[x] = "0";
                    memToReg[x] = "0";
                    aluOp[x] = "10";
                    memwrite[x] = "0";
                    aluSrc[x] = "1";
                    regWrite[x] = "1";
                    jump[x] = "0";
                    break;
                default:
                    redDst[x] = null;
                    branch[x] = null;
                    memRead[x] = null;
                    memToReg[x] = null;
                    aluOp[x] = null;
                    memwrite[x] = null;
                    aluSrc[x] = null;
                    regWrite[x] = null;
                    jump[x] = null;
                    break;
            }
        }
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

    public void Finish() {
//        int got=0;
//               for (int found = 0; found < an.n; found++) {
//            if (an.pp[found][1].equals("jal")) {
//                for (int get=0; get < an.n; get++) {
//                    if ((an.pp[found][2].getText()).equals(an.pp[get][0].getText())) {
//                        got=get;
//                        }
//                    }
//                }
//            }        
        for (int i = 0; i < an.n; i++)/*only the i is changing */ {
            //for (int y=b;y<5;y++){
//        if(i==got){
//        return;
//        }
//        else{
            switch (an.pp[i][1].getText()) {
                case "addi":
                    reg1(i, 2);
                    reg2(i, 3);
                    addi(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "add":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    add(stp1, stp2, stp3);
                    break;
                case "sub":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    sub(stp1, stp2, stp3);
                    break;
                case "mul":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    mul(stp1, stp2, stp3);
                    break;
                case "sll":
                    reg1(i, 2);
                    reg2(i, 3);
                    sll(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "srl":
                    reg1(i, 2);
                    reg2(i, 3);
                    srl(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "slt":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    slt(stp1, stp2, stp3);
                    break;
                case "move":
                    reg1(i, 2);
                    reg2(i, 3);
                    move(stp1, stp2);
                    break;
                case "slti":
                    reg1(i, 2);
                    reg2(i, 3);
                    slti(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "and":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    and(stp1, stp2, stp3);
                    break;
                case "or":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    or(stp1, stp2, stp3);
                    break;
                case "nor":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    nor(stp1, stp2, stp3);
                    break;
                case "andi":
                    reg1(i, 2);
                    reg2(i, 3);
                    andi(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "ori":
                    reg1(i, 2);
                    reg2(i, 3);
                    ori(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "jr":
                    //jr();
                    break;
                case "sltu":
                    reg1(i, 2);
                    reg2(i, 3);
                    reg3(i, 4);
                    slt(stp1, stp2, stp3);
                    break;
                case "lw":
                    reg1(i, 2);
                    reg2(i, 3);
                    lw(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "lh":
                    reg1(i, 2);
                    reg2(i, 3);
                    lh(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "lb":
                    reg1(i, 2);
                    reg2(i, 3);
                    lb(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "lhu":
                    reg1(i, 2);
                    reg2(i, 3);
                    lh(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "lbu":
                    reg1(i, 2);
                    reg2(i, 3);
                    lb(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "lui":
                    reg1(i, 2);
                    reg2(i, 3);
                    lw(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "sw":
                    reg1(i, 2);
                    reg2(i, 3);
                    sw(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "sh":
                    reg1(i, 2);
                    reg2(i, 3);
                    sh(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "sb":
                    reg1(i, 2);
                    reg2(i, 3);
                    sb(stp1, stp2, Integer.parseInt(Variables.pp[i][4].getText()));
                    break;
                case "j":
                    j(an.pp[i][2].getText(), 0);
                    i = 10000000;
                    break;
                case "sltui":
                    reg1(i, 2);
                    reg2(i, 3);
                    slti(stp1, stp2, Integer.parseInt(an.pp[i][4].getText()));
                    break;
                case "jal":
                    j(an.pp[i][2].getText(), i + 1);
                    break;
                case "blt":
                    reg1(i, 2);
                    reg2(i, 3);
                    blt(stp1, stp2, an.pp[i][4].getText());
                    break;
                case "beq":
                    reg1(i, 2);
                    reg2(i, 3);
                    beq(stp1, stp2, an.pp[i][4].getText());

                    break;
                case "bne":
                    reg1(i, 2);
                    reg2(i, 3);
                    bne(stp1, stp2, an.pp[i][4].getText());

                    break;
            }
        }

    }

    public void start_from_to(int a, int b, int c) {
        for (int x = a; x < b; x++)/*only the x is changing */ {
            switch (an.pp[x][1].getText()) {
                case "addi":
                    reg1(x, 2);
                    reg2(x, 3);
                    addi(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "add":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    add(stp1, stp2, stp3);
                    break;
                case "sub":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    sub(stp1, stp2, stp3);
                    break;
                case "mul":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    mul(stp1, stp2, stp3);
                    break;
                case "sll":
                    reg1(x, 2);
                    reg2(x, 3);
                    sll(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "srl":
                    reg1(x, 2);
                    reg2(x, 3);
                    srl(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "slt":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    slt(stp1, stp2, stp3);
                    break;
                case "move":
                    reg1(x, 2);
                    reg2(x, 3);
                    move(stp1, stp2);
                    break;
                case "slti":
                    reg1(x, 2);
                    reg2(x, 3);
                    slti(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "and":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    and(stp1, stp2, stp3);
                    break;
                case "or":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    or(stp1, stp2, stp3);
                    break;
                case "nor":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    nor(stp1, stp2, stp3);
                    break;
                case "andi":
                    reg1(x, 2);
                    reg2(x, 3);
                    andi(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "ori":
                    reg1(x, 2);
                    reg2(x, 3);
                    ori(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "jr":
                    jr(c);
                    x = x + 1000000;
                    break;
                case "sltu":
                    reg1(x, 2);
                    reg2(x, 3);
                    reg3(x, 4);
                    slt(stp1, stp2, stp3);
                    break;
                case "lw":
                    reg1(x, 2);
                    reg2(x, 3);
                    lw(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "lh":
                    reg1(x, 2);
                    reg2(x, 3);
                    lh(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "lb":
                    reg1(x, 2);
                    reg2(x, 3);
                    lb(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "lhu":
                    reg1(x, 2);
                    reg2(x, 3);
                    lh(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "lbu":
                    reg1(x, 2);
                    reg2(x, 3);
                    lb(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "lui":
//                    reg1(x,  2);
//                    reg2(x,  3);
//                    lu(stp1, stp2, Integer.parseInt(an.pp[x][ 4].getText()));
                    break;
                case "sw":
                    reg1(x, 2);
                    reg2(x, 3);
                    sw(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "sh":
                    reg1(x, 2);
                    reg2(x, 3);
                    sh(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "sb":
                    reg1(x, 2);
                    reg2(x, 3);
                    sb(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "j":
                    j(an.pp[x][2].getText(), 0);
                    x = x + 1000000;
                    break;
                case "sltui":
                    reg1(x, 2);
                    reg2(x, 3);
                    slti(stp1, stp2, Integer.parseInt(an.pp[x][4].getText()));
                    break;
                case "jal":
//                    jal(an.pp[x][2].getText());
                    j(an.pp[x][2].getText(), x + 1);
                    break;
                case "blt":
                    reg1(x, 2);
                    reg2(x, 3);
                    blt(stp1, stp2, an.pp[x][4].getText());
                    break;
                case "beq":
                    reg1(x, 2);
                    reg2(x, 3);
                    if (V.$_V[stp1] == V.$_V[stp2]) {
                        for (int From = 0; From < an.n; From++) {
                            if (an.pp[x][4].getText().equals(an.pp[From][0].getText())) {
                                if (From < x) {
                                    start_from_to(From, x, 0);
                                } else {
                                    start_from_to(From, an.n, 0);
                                    x = c + 1;
                                }
                            }
                        }
                        return;
                    }
                    break;
                case "bne":
                    reg1(x, 2);
                    reg2(x, 3);
                    if (!(V.$_V[stp1] == V.$_V[stp2])) {
                        for (int From = 0; From < an.n; From++) {
                            if (an.pp[x][4].getText().equals(an.pp[From][0].getText())) {
                                if (From < x) {
                                    start_from_to(From, x, 0);
                                } else {
                                    start_from_to(From, an.n, 0);
                                    x = c + 1;
                                }
                            }
                        }
                        return;
                    }
                    break;
            }
        }
    }

    public void addi(int a, int b, int c) // function to be executed when we press enter after writing number in number textbox
    {
        V.$_V[a] = V.$_V[b] + c;
        System.out.println(V.$_V[a]);
    }

    public void sll(int a, int b, int c) // function to be executed when we press enter after writing number in number textbox
    {
        V.$_V[a] = (int) (V.$_V[b] * (Math.pow(2, c)));
        System.out.println(V.$_V[a]);
    }

    public void srl(int a, int b, int c) // function to be executed when we press enter after writing number in number textbox
    {
        V.$_V[a] = (int) (V.$_V[b] / (Math.pow(2, c)));
        System.out.println(V.$_V[a]);
    }

    public void slt(int a, int b, int c) {
        if (V.$_V[b] < V.$_V[c]) {
            V.$_V[a] = 1;
        } else {
            V.$_V[a] = 0;
        }
        System.out.println(V.$_V[a]);
    }

    public void add(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] + V.$_V[c];
        System.out.println(V.$_V[a]);
    }

    public void sub(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] - V.$_V[c];
        System.out.println(V.$_V[a]);
    }

    public void beq(int a, int b, String s) {
        if (V.$_V[a] == V.$_V[b]) {
            for (int x = 0; x < an.n; x++) {
                if (s.equals(an.pp[x][0].getText())) {
                    if (x < i) {
                        start_from_to(x, i, 0);
                    } else {
                        start_from_to(x, an.n, 0);
                        i = an.n + 1;
                    }
                }
            }
        } else {
            return;
        }
    }

    public void bne(int a, int b, String s) {
        if (!(V.$_V[a] == V.$_V[b])) {
            for (int x = 0; x < an.n; x++) {
                if (s.equals(an.pp[x][0].getText())) {
                    if (x < i) {
                        start_from_to(x, i, 0);
                    } else {
                        start_from_to(x, an.n, 0);
                        i = an.n + 1;
                    }
                }
            }
        } else {
            return;
        }

    }

    public void mul(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] * V.$_V[c];
        System.out.println(V.$_V[a]);
    }

    public void move(int a, int b) {
        V.$_V[a] = V.$_V[b];
        System.out.println(V.$_V[a]);
    }

    public void slti(int a, int b, int c) {
        if (V.$_V[b] < c) {
            V.$_V[a] = 1;
        } else {
            V.$_V[a] = 0;
        }
        System.out.println(V.$_V[a]);
    }

    public void and(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] & V.$_V[c];
        System.out.println(V.$_V[a]);
    }

    public void or(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] | V.$_V[c];
        System.out.println(V.$_V[a]);
    }

    public void nor(int a, int b, int c) {
        V.$_V[a] = (~(V.$_V[b] | V.$_V[c]));
        System.out.println(V.$_V[a]);
    }

    public void andi(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] & c;
        System.out.println(V.$_V[a]);
    }

    public void ori(int a, int b, int c) {
        V.$_V[a] = V.$_V[b] | c;
        System.out.println(V.$_V[a]);
    }

    public void jr(int c) {
        i = c;
    }

    public void j(String s, int c) {
        for (int y = 0; y < an.n; y++) {
            if (s.equals(an.pp[y][0].getText())) {
                start_from_to(y, an.n, c);

            }
        }
    }

    public void jal(String s) {

        int k = 0;
        V.$_V[26] = i++;
        for (int f = 0; f < an.n; f++) {
            if (an.pp[f][1].getText().equals("jr"));
            k = f;
            break;
        }
        for (int x = 0; x < an.n; x++) {
            if (s.equals(an.pp[x][0].getText())) {
                start_from_to(x, k, 0);
            }
        }
    }

    public void lw(int a, int b, int c) {
        int k = (V.$_V[b] + c) / 4;
        V.$_V[a] = memw[k];
        System.out.println(V.$_V[a]);
    }

    public void sw(int a, int b, int c) {
        memw[(V.$_V[b] + c) / 4] = V.$_V[a];
        System.out.println(memw[V.$_V[27] + c]);
    }

    public void lh(int a, int b, int c) {
        V.$_V[a] = memh[(V.$_V[b] + c) / 2];
        System.out.println(V.$_V[a]);
    }

    public void sh(int a, int b, int c) {
        memh[(V.$_V[b] + c) / 2] = V.$_V[a];
        System.out.println(memh[V.$_V[27] + c]);
    }

    public void lb(int a, int b, int c) {
        V.$_V[a] = memb[(V.$_V[b] + c)];
        System.out.println(V.$_V[a]);
    }

    public void sb(int a, int b, int c) {
        memb[(V.$_V[b] + c)] = V.$_V[a];
        System.out.println(memb[V.$_V[27] + c]);
    }

    public void blt(int a, int b, String s) {
        slt(19, a, b);
        if (V.$_V[19] == 1) {
            beq(19, 19, s);
        } else {
            return;
        }

    }

    /*
   0 "$zero"
   1 "$t0"
   2 "$t1"
   3 "$t2"
   4 "$t3"
   5 "$t4"
   6 "$t5"
   7 "$t6"
   8 "$t7"
   9 "$t8"
   10 "$t9"
   11 "$s0"
   12 "$s1"
   13 "$s2"
   14 "$s3"
   15 "$s4"
   16 "$s5"
   17 "$s6"
   18 "$s7" 
   19 "$at"
   20 "$a0"
   21 "$a1"
   22 "$a2"
   23 "$a3"    
   24"$v0"
   25"$v1"
   26 "$ra"
   27 "$sp"
     */
    //reg1 is equivalent to rd
    //reg1,reg2 and reg3 are integers that make me know which register is rd, which is rs and rt
    public void reg1(int a, int b) {
        switch (an.pp[a][b].getText()) {
            case "$zero":
                stp1 = 0;
                return;
            case "$t0":
                stp1 = 1;
                return;
            case "$t1":
                stp1 = 2;
                return;
            case "$t2":
                stp1 = 3;
                return;
            case "$t3":
                stp1 = 4;
                return;
            case "$t4":
                stp1 = 5;
                return;
            case "$t5":
                stp1 = 6;
                return;
            case "$t6":
                stp1 = 7;
                return;
            case "$t7":
                stp1 = 8;
                return;
            case "$t8":
                stp1 = 9;
                return;
            case "$t9":
                stp1 = 10;
                return;
            case "$s0":
                stp1 = 11;
                return;
            case "$s1":
                stp1 = 12;
                return;
            case "$s2":
                stp1 = 13;
                return;
            case "$s3":
                stp1 = 14;
                return;
            case "$s4":
                stp1 = 15;
                return;
            case "$s5":
                stp1 = 16;
                return;
            case "$s6":
                stp1 = 17;
                return;
            case "$s7":
                stp1 = 18;
                return;
            case "$at":
                stp1 = 19;
                return;
            case "$a0":
                stp1 = 20;
                return;
            case "$a1":
                stp1 = 21;
                return;
            case "$a2":
                stp1 = 22;
                return;
            case "$a3":
                stp1 = 23;
                return;
            case "$v0":
                stp1 = 24;
                return;
            case "$v1":
                stp1 = 25;
                return;
            case "$ra":
                stp1 = 26;
                return;
            case "$sp":
                stp1 = 27;
                return;

        }
    }

    //reg2 is equivalent to rs
    //reg1,reg2 and reg3 are integers that make me know which register is rd, which is rs and rt
    public void reg2(int a, int b) {
        switch (an.pp[a][b].getText()) {
            case "$zero":
                stp2 = 0;
                return;
            case "$t0":
                stp2 = 1;
                return;
            case "$t1":
                stp2 = 2;
                return;
            case "$t2":
                stp2 = 3;
                return;
            case "$t3":
                stp2 = 4;
                return;
            case "$t4":
                stp2 = 5;
                return;
            case "$t5":
                stp2 = 6;
                return;
            case "$t6":
                stp2 = 7;
                return;
            case "$t7":
                stp2 = 8;
                return;
            case "$t8":
                stp2 = 9;
                return;
            case "$t9":
                stp2 = 10;
                return;
            case "$s0":
                stp2 = 11;
                return;
            case "$s1":
                stp2 = 12;
                return;
            case "$s2":
                stp2 = 13;
                return;
            case "$s3":
                stp2 = 14;
                return;
            case "$s4":
                stp2 = 15;
                return;
            case "$s5":
                stp2 = 16;
                return;
            case "$s6":
                stp2 = 17;
                return;
            case "$s7":
                stp2 = 18;
                return;
            case "$at":
                stp2 = 19;
                return;
            case "$a0":
                stp2 = 20;
                return;
            case "$a1":
                stp2 = 21;
                return;
            case "$a2":
                stp2 = 22;
                return;
            case "$a3":
                stp2 = 23;
                return;
            case "$v0":
                stp2 = 24;
                return;
            case "$v1":
                stp2 = 25;
                return;
            case "$ra":
                stp2 = 26;
                return;
            case "$sp":
                stp2 = 27;
                return;

        }
    }

    //reg3 is equivalent to rt
    //reg1,reg2 and reg3 are integers that make me know which register is rd, which is rs and rt
    public void reg3(int a, int b) {
        switch (an.pp[a][b].getText()) {
            case "$zero":
                stp3 = 0;
                return;
            case "$t0":
                stp3 = 1;
                return;
            case "$t1":
                stp3 = 2;
                return;
            case "$t2":
                stp3 = 3;
                return;
            case "$t3":
                stp3 = 4;
                return;
            case "$t4":
                stp3 = 5;
                return;
            case "$t5":
                stp3 = 6;
                return;
            case "$t6":
                stp3 = 7;
                return;
            case "$t7":
                stp3 = 8;
                return;
            case "$t8":
                stp3 = 9;
                return;
            case "$t9":
                stp3 = 10;
                return;
            case "$s0":
                stp3 = 11;
                return;
            case "$s1":
                stp3 = 12;
                return;
            case "$s2":
                stp3 = 13;
                return;
            case "$s3":
                stp3 = 14;
                return;
            case "$s4":
                stp3 = 15;
                return;
            case "$s5":
                stp3 = 16;
                return;
            case "$s6":
                stp3 = 17;
                return;
            case "$s7":
                stp3 = 18;
                return;
            case "$at":
                stp3 = 19;
                return;
            case "$a0":
                stp3 = 20;
                return;
            case "$a1":
                stp3 = 21;
                return;
            case "$a2":
                stp3 = 22;
                return;
            case "$a3":
                stp3 = 23;
                return;
            case "$v0":
                stp3 = 24;
                return;
            case "$v1":
                stp3 = 25;
                return;
            case "$ra":
                stp3 = 26;
                return;
            case "$sp":
                stp3 = 27;
                return;

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(i == an.n)) {
            if (j == 0) {
                String str = (((JButton) e.getSource()).getText());
                switch (((JButton) e.getSource()).getText()) {
                    case "L1":
                    case "L2":
                    case "L3":
                    case "L4":
                    case "L5":
                    case "L6":
                    case "L7":
                    case "L8":
                        an.pp[i][j].setText(str);
                        B2[0].setEnabled(false);
                        B2[1].setEnabled(false);
                        B2[2].setEnabled(false);
                        B2[3].setEnabled(false);
                        B2[4].setEnabled(false);
                        B2[5].setEnabled(false);
                        B2[6].setEnabled(false);
                        B2[7].setEnabled(false);
                        B3[9].setEnabled(false);
                        B3[26].setEnabled(false);
                        B3[27].setEnabled(true);
                        txtnumber.setEnabled(false);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        j++;
                        return;
                    case "jr":
                        an.pp[i][j].setText(null);
                        j++;
                        an.pp[i][j].setText(str);
                        j++;
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        B4[28].setEnabled(true);
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                    case "j":
                        an.pp[i][j].setText(null);
                        j++;
                        an.pp[i][j].setText(str);
                        j++;
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                    case "jal":
                        an.pp[i][j].setText(null);
                        j++;
                        an.pp[i][j].setText(str);
                        j++;
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                    default:
                        an.pp[i][j].setText(null);
                        j++;
                        an.pp[i][j].setText(str);
                        j++;
                        B2[0].setEnabled(false);
                        B2[1].setEnabled(false);
                        B2[2].setEnabled(false);
                        B2[3].setEnabled(false);
                        B2[4].setEnabled(false);
                        B2[5].setEnabled(false);
                        B2[6].setEnabled(false);
                        B2[7].setEnabled(false);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(true);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                }
            }
            //-------------------------------------------------------------------------------------------
            if (j == 1) {
                String str = (((JButton) e.getSource()).getText());
                switch (str) {
                    case "jal":
                        an.pp[i][j].setText(str);
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        j++;
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                    default:
                        an.pp[i][j].setText(str);
                        j++;
                        B2[0].setEnabled(false);
                        B2[1].setEnabled(false);
                        B2[2].setEnabled(false);
                        B2[3].setEnabled(false);
                        B2[4].setEnabled(false);
                        B2[5].setEnabled(false);
                        B2[6].setEnabled(false);
                        B2[7].setEnabled(false);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(true);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                }
            }
            //-----------------------------------------------------------------------------------------
            if (j == 2) //jr,j,jal fn calls added here
            {
                String w = ((JButton) e.getSource()).getText();
                switch (an.pp[i][j - 1].getText()) {
                    //**********************************
                    //fn call for jr added here
                    case "jr":
                        an.pp[i][j].setText(w);
                        j = 0;
                        i++;
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(true);
                        }
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        return;
                    //**********************************
                    //fn call for j added here
                    case "j":
                        w = ((JButton) e.getSource()).getText();
                        an.pp[i][j].setText(w);
                        j = 0;
                        i++;
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(true);
                        }

                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        return;
                    //**********************************
                    //fn call for jal added here
                    case "jal":
                        w = ((JButton) e.getSource()).getText();
                        an.pp[i][j].setText(w);
                        j = 0;
                        i++;
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(true);
                        }
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        return;
                    default:
                        //for any instruction except j,ja,jr
                        an.pp[i][j].setText(w);
                        j++;
                        return;
                }
            }
            //---------------------------------------------------------------------------------------
            if (j == 3) //move,lui fn calls are added here 
            {
                String w = ((JButton) e.getSource()).getText();
                switch (an.pp[i][j - 2].getText()) {
                    case "add":
                    case "sub":
                    case "slt":
                    case "sltu":
                    case "and":
                    case "or":
                    case "nor":
                    case "mul":
                        // after instruction; 3 registers are chosen
                        an.pp[i][j].setText(w);
                        j++;
                        return;
                    case "sll":
                    case "srl":
                    case "addi":
                    case "lw":
                    case "lhu":
                    case "lb":
                    case "lbu":
                    case "sw":
                    case "sh":
                    case "sb":
                    case "slti":
                    case "sltui":
                    case "andi":
                    case "ori":
                        // special; 3rd column after instruction is a number
                        an.pp[i][j].setText(w);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        txtnumber.setEnabled(true);
                        j++;
                        return;
                    case "beq":
                    case "bne":
                    case "blt":
                        // special because 3rd column after instruction contain labels
                        w = ((JButton) e.getSource()).getText();
                        an.pp[i][j].setText(w);
                        j++;
                        B2[0].setEnabled(true);
                        B2[1].setEnabled(true);
                        B2[2].setEnabled(true);
                        B2[3].setEnabled(true);
                        B2[4].setEnabled(true);
                        B2[5].setEnabled(true);
                        B2[6].setEnabled(true);
                        B2[7].setEnabled(true);
                        B1[0].setEnabled(false);
                        B1[1].setEnabled(false);
                        B1[2].setEnabled(false);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(false);
                        }
                        return;
                    //**********************************
                    //fn call for lui added here
                    case "lui":
                        w = ((JButton) e.getSource()).getText();
                        an.pp[i][j].setText(w);
                        j = 0;
                        i++; // only 2 columns needed after instruction column
                        return;

                    //**********************************
                    //fn call for move added here
                    case "move":
                        w = ((JButton) e.getSource()).getText();
                        an.pp[i][j].setText(w);
                        j = 0;
                        i++; // only 2 columns needed after instruction column
                        B1[0].setEnabled(false);
                        B1[1].setEnabled(false);
                        B1[2].setEnabled(false);
                        for (int x = 0; x < 32; x++) {
                            B4[x].setEnabled(false);
                        }
                        for (int x = 0; x < 31; x++) {
                            B3[x].setEnabled(true);
                        }
                        return;
                }
            }
            //--------------------------------------------------------------------------------------
            if (j == 4) /*this reg is used to add function calls for all instructions except
            jr,j,jal(fn calls are added in reg j=2)
            move,lui(fn calls are added in reg j=3)
             */ {
                String w = ((JButton) e.getSource()).getText();
                an.pp[i][j].setText(w);
                j = 0;
                i++;
                B2[0].setEnabled(true);
                B2[1].setEnabled(true);
                B2[2].setEnabled(true);
                B2[3].setEnabled(true);
                B2[4].setEnabled(true);
                B2[5].setEnabled(true);
                B2[6].setEnabled(true);
                B2[7].setEnabled(true);
                for (int x = 0; x < 32; x++) {
                    B4[x].setEnabled(false);
                }
                for (int x = 0; x < 31; x++) {
                    B3[x].setEnabled(true);

                }
                if (i == an.n - 1) {
                    B1[3].setEnabled(true);
                }
            }
        }
    }

    public Buttons() {
        init();
    }

    private void init() {
        // for more details see comments in class buttons
        pnl.setLayout(new GridLayout(2, 1));
        pnl.add(p10);
        pnl.add(p20);

        p30_1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p30_2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p30_3.setLayout(new FlowLayout(FlowLayout.LEFT));

        p30.setLayout(new GridLayout(3, 1));
        p30.setBorder(BorderFactory.createTitledBorder("Instructions"));
        p30.add(p30_1);
        p30.add(p30_2);
        p30.add(p30_3);

        p40_1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p40_2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p40_3.setLayout(new FlowLayout(FlowLayout.LEFT));

        p40.setLayout(new GridLayout(3, 1));
        p40.setBorder(BorderFactory.createTitledBorder("Registers"));
        p40.add(p40_1);
        p40.add(p40_2);
        p40.add(p40_3);

        p4.setLayout(new BorderLayout());

        p4.add(pnl, BorderLayout.NORTH);
        p4.add(p30, BorderLayout.CENTER);
        p4.add(p40, BorderLayout.SOUTH);

        p10.setBackground(Color.WHITE);
        p20.setBackground(Color.WHITE);
        p30.setBackground(Color.WHITE);
        p40.setBackground(Color.WHITE);

        //----------------------------------------------------------
        /*B1: (buttons of panel 1)
        0 .data
        1 .word
        2 .text
        3 FINISH
         */
        String[] namesB1 = {".data", ".word", ".text", "FINISH"};
        for (int i = 0; i < B1.length; i++) {

            B1[i] = new JButton(namesB1[i]);
            B1[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 90));
            //B1[i].addActionListener(this);
            B1[i].setEnabled(true);
        }

        //adding buttons of panel 1
        B1[3].setPreferredSize(new Dimension((int) d.width / 15, (int) d.width / 35));
        p10.add(B1[3]);

        B1[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control();
                Finish();
                for (int x = 0; x < 27; x++) {
                    setReg(x, V.$_V[x]);
                }
                Output a = new Output();
            }
        });

        //--------------------------------------------------------------------------------------------------------------

        /*L2: (labels of pannel 2)
   0 "Label"
   1 "Number"
   2 "Address"
         */
        String[] namesL2 = {"Label", "Number", "Address"};
        for (int i = 0; i < L2.length; i++) {
            L2[i] = new JLabel(namesL2[i]);
            L2[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 43));
        }

        /*B2: (buttons of panel 2)
        0 L1
        1 L2
        2 L3
         */
        // adding text box
        String[] namesB2 = {"L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8"};
        for (int i = 0; i < B2.length; i++) {
            B2[i] = new JButton(namesB2[i]);
            B2[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 85));
            B2[i].setPreferredSize(new Dimension(d.width / 20, d.width / 40));
            B2[i].addActionListener(this);
        }

        //adding buttons and labels of panel 2
        p20.add(L2[0]);
        for (int i = 0; i < B2.length; i++) {

            p20.add(B2[i]);
        }
        p20.add(L2[1]);

        txtnumber.setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 40));
        txtnumber.setEnabled(false);
        p20.add(txtnumber);

        txtnumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String str = new String();
                str = txtnumber.getText();
                an.pp[i][j].setText(str);
                j = 0;
                i++;
                txtnumber.setEnabled(false);
                B2[0].setEnabled(true);
                B2[1].setEnabled(true);
                B2[2].setEnabled(true);
                B2[3].setEnabled(true);
                B2[4].setEnabled(true);
                B2[5].setEnabled(true);
                B2[6].setEnabled(true);
                B2[7].setEnabled(true);
                for (int x = 0; x < 32; x++) {
                    B4[x].setEnabled(false);
                }
                for (int x = 0; x < 31; x++) {
                    B3[x].setEnabled(true);
                }
            }
        });
        p20.add(L2[2]);
        txtaddress.setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 40));

        p20.add(txtaddress);
        txtaddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                address = Integer.parseInt(txtaddress.getText());
            }
        });

        //setting size of the 2 textboxes
        txtnumber.setPreferredSize(new Dimension((int) d.width / 10, (int) d.width / 40));
        txtaddress.setPreferredSize(new Dimension((int) d.width / 10, (int) d.width / 40));

        //-------------------------------------------------------------------------------

        /*L3: (labels of pannel 3)
   0 "R-format:"
   1 "I-format:"
   2 "J-format:"
   3 "Pseudo:"*/
        String[] namesL3 = {"R-format:", "I-format:", "J-format:", "Pseudo:"};
        for (int i = 0; i < L3.length; i++) {
            L3[i] = new JLabel(namesL3[i]);
            L3[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 90));
        }

        /*B3: (buttons of panel 3)
   0 "add"
   1 "sub"
   2 "sll"
   3 "srl"
   4 "slt",
   5 "sltu"
   6 "and" 
   7 "or"
   8 "nor"
   9 "jr"
   10 "addi"
   11 "lw"
   12 "lh"
   13 "lhu"
   14 "lb"
   15 "lbu"
   16 "lui"
   17 "sw"
   18 "sh"
   19 "sb"
   20 "slti"
   21 "sltui"
   22 "andi"
   23 "ori"
   24 "beq"
   25 "bne"
   26 "j"
   27 "jal"
   28 "mul"
   29 "move"
   30 "blt"
         */
        String[] namesB3 = {"add", "sub", "sll", "srl", "slt",
            "sltu", "and", "or", "nor", "jr", "addi", "lw", "lh", "lhu", "lb", "lbu",
            "lui", "sw", "sh", "sb", "slti", "sltui", "andi", "ori", "beq", "bne", "j",
            "jal", "mul", "move", "blt"};
        for (int i = 0; i < B3.length; i++) {
            B3[i] = new JButton(namesB3[i]);
            B3[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 90));
            B3[i].setPreferredSize(new Dimension((int) d.width / 18, (int) d.height / 48));
            B3[i].addActionListener(this);
        }

        // adding buttons and labels of panel 3
        p30_1.add(L3[0]);
        for (int i = 0; i < 10; i++) {
            p30_1.add(B3[i]);
        }

        p30_2.add(L3[1]);

        for (int i = 10; i < 26; i++) {
            p30_2.add(B3[i]);
        }

        p30_3.add(L3[2]);
        for (int i = 26; i < 28; i++) {
            p30_3.add(B3[i]);
        }

        p30_3.add(L3[3]);
        for (int i = 28; i < B3.length; i++) {
            p30_3.add(B3[i]);
        }

        //---------------------------------------------------------------------------
        /*L4: (labels in panel 4)
   0 "$t:"
   1 "$s:"
   2 "Others:"*/
        String[] namesL4 = {"$t:", "$s:", "Others:"};
        for (int i = 0; i < L4.length; i++) {
            L4[i] = new JLabel(namesL4[i]);
            L4[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 90));
        }

        /*B4: (buttons of panel 4)
   0 "$t0"
   1 "$t1"
   2 "$t2"
   3 "$t3"
   4 "$t4"
   5 "$t5"
   6 "$t6"
   7 "$t7"
   8 "$t8"
   9 "$t9"
   10 "$s0"
   11 "$s1"
   12 "$s2"
   13 "$s3"
   14 "$s4"
   15 "$s5"
   16 "$s6"
   17 "$s7"
   18 "$s8"
   19 "$s9"
   20 "$zero"
   21 "$at"
   22 "$a0"
   23 "$a1"
   24 "$a2"
   25 "$a3"
   26 "$k0"
   27 "$k1"
   28 "$ra"
   29 "$sp"
   30 "$v0"
   31 "$v1"*/
        String[] namesB4 = {"$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$t8", "$t9",
            "$s0", "$s1", "$s2", "$s3", "$s4", "$s5", "$s6", "$s7", "$s8", "$s9", "$zero", "$at", "$a0",
            "$a1", "$a2", "$a3", "$k0", "$k1", "$ra", "$sp", "$v0", "$v1"};
        for (int i = 0; i < B4.length; i++) {
            B4[i] = new JButton(namesB4[i]);
            B4[i].setFont(new Font("Calibri", Font.PLAIN, (int) d.width / 90));
            B4[i].addActionListener(this);
            B4[i].setEnabled(false);
        }

        // adding butons and labels of panel 4
        p40_1.add(L4[0]);
        for (int i = 0; i < 10; i++) {
            B4[i].setPreferredSize(new Dimension((int) d.width / 14, (int) d.width / 48));
            p40_1.add(B4[i]);
        }
        txtnumber.setEnabled(false);

        p40_2.add(L4[1]);
        for (int i = 10; i < 20; i++) {
            B4[i].setPreferredSize(new Dimension((int) d.width / 14, (int) d.width / 48));
            if (i == 18 || i == 19) {
                continue;
            }
            p40_2.add(B4[i]);
        }

        p40_3.add(L4[2]);
        for (int i = 20; i < B4.length; i++) {
            B4[i].setPreferredSize(new Dimension((int) d.width / 15, (int) d.width / 48));
            if (i == 26 || i == 27) {
                continue;
            }
            p40_3.add(B4[i]);
        }
        c.validate();
    }
}
