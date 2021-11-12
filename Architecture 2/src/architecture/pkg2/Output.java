package architecture.pkg2;

import Itype.Itype;
import datapath.DataPath;
import branch.branch;
import save.Save;
import load.Load;
import jump.jump;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;
import static architecture.pkg2.Buttons.*;

public class Output extends JFrame implements ActionListener {

    Variables an = new Variables();
    $Value V = new $Value();
    Reg_list reg = new Reg_list();
    JButton[] Pics = new JButton[an.n];
    Font a = new Font("Arch", Font.BOLD, 14);
    Font b = new Font("Arch", Font.BOLD, 24);
    private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    String[] text = {" ", "RegDest", "Branch", "MemRead", "MemtoReg", "ALU Op", "MemWrite", "ALUSrc", "RegWrite", "Jump"};
    JPanel table = new JPanel();
    JLabel[][] content = new JLabel[an.n + 1][10];
    JLabel[] memcontent = new JLabel[3072];
    JPanel image = new JPanel();
    JPanel Registers = new JPanel();
    JPanel Memory = new JPanel();
    JPanel Memory1 = new JPanel();
    JPanel Memory2 = new JPanel();

    public Output() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(0, 0, d.width, d.height - 50);
        setVisible(true);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
//------------------------------------------------------------------------------
        c.add(table, BorderLayout.NORTH);
        table.setPreferredSize(new Dimension(d.width,d.height/3));
        c.add(image, BorderLayout.CENTER);
        c.add(Registers, BorderLayout.EAST);
        c.add(Memory, BorderLayout.SOUTH);
        Memory.setLayout(new GridLayout(2, 1));
        table.setLayout(new GridLayout(an.n + 1, 10));
        Memory.add(Memory1);
        Memory.add(Memory2);
        Memory2.setLayout(new GridLayout(1, (3 * an.n)));
//------------------------------------------------------------------------------
        for (int i = 0; i < an.n + 1; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0) {
                    content[i][j] = new JLabel(text[j]);
                    content[i][j].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                    content[i][j].setFont(a);
                    table.add(content[i][j]);
                } else {
                    content[i][j] = new JLabel();
                    content[i][j].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                    table.add(content[i][j]);
                    switch (j) {
                        case 0:
                            content[i][j].setText(Integer.toString(i));
                            break;
                        case 1:
                            content[i][j].setText(redDst[i - 1]);
                            break;
                        case 2:
                            content[i][j].setText(branch[i - 1]);
                            break;
                        case 3:
                            content[i][j].setText(memRead[i - 1]);
                            break;
                        case 4:
                            content[i][j].setText(memToReg[i - 1]);
                            break;
                        case 5:
                            content[i][j].setText(aluOp[i - 1]);
                            break;
                        case 6:
                            content[i][j].setText(memwrite[i - 1]);
                            break;
                        case 7:
                            content[i][j].setText(aluSrc[i - 1]);
                            break;
                        case 8:
                            content[i][j].setText(regWrite[i - 1]);
                            break;
                        case 9:
                            content[i][j].setText(jump[i - 1]);
                            break;
                    }

                }
            }
        }
        c.validate();
        //----------------------------------------------------------------------
        Registers.add(reg);
        c.validate();
        //----------------------------------------------------------------------
        for (int i = 0; i < (3 * an.n) + 1; i++) {
            if (i == 0) {
                memcontent[i] = new JLabel("Memory");
                memcontent[i].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                memcontent[i].setFont(a);
                Memory1.add(memcontent[i]);
            } else if (i > 0 && i < an.n + 1) {
                memcontent[i] = new JLabel("" + memw[i - 1]);
                memcontent[i].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                memcontent[i].setFont(a);
                Memory2.add(memcontent[i]);
            } else if (i > (an.n + 1) && i < (2 * an.n) + 1) {
                int j = 0;
                memcontent[i] = new JLabel("" + memh[j++]);
                memcontent[i].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                memcontent[i].setFont(a);
                Memory2.add(memcontent[i]);
            } else {
                int j = 0;
                memcontent[i] = new JLabel("" + memb[j++]);
                memcontent[i].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                memcontent[i].setFont(a);
                Memory2.add(memcontent[i]);
            }
        }
        //------------------------------------------------------------------------------------
        image.setLayout(new GridLayout(an.n / 2, 2));
        for (int k = 0; k < an.n; k++) {
            Pics[k] = new JButton("" + k);
            Pics[k].addActionListener(this);
            image.add(Pics[k]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int no_ins = Integer.parseInt(((JButton) e.getSource()).getText().trim());
        switch (an.pp[no_ins][1].getText()) {
            case "addi":
                Itype I1 = new Itype(no_ins);
                I1.setVisible(true);
                break;
            case "add":
                DataPath R1 = new DataPath(no_ins);
                R1.setVisible(true);
                break;
            case "sub":
                DataPath R2 = new DataPath(no_ins);
                R2.setVisible(true);
                break;
            case "mul":
                DataPath R16 = new DataPath(no_ins);
                R16.setVisible(true);
                break;
            case "sll":
                DataPath R3 = new DataPath(no_ins);
                R3.setVisible(true);
                break;
            case "srl":
                DataPath R4 = new DataPath(no_ins);
                R4.setVisible(true);
                break;
            case "slt":
                DataPath R5 = new DataPath(no_ins);
                R5.setVisible(true);
                break;
            case "move":
                break;
            case "slti":
                Itype I3 = new Itype(no_ins);
                I3.setVisible(true);
                break;
            case "and":
                DataPath R6 = new DataPath(no_ins);
                R6.setVisible(true);
                break;
            case "or":
                DataPath R7 = new DataPath(no_ins);
                R7.setVisible(true);
                break;
            case "nor":
                DataPath R8 = new DataPath(no_ins);
                R8.setVisible(true);
                break;
            case "andi":
                Itype I4 = new Itype(no_ins);
                I4.setVisible(true);
                break;
            case "ori":
                Itype I5 = new Itype(no_ins);
                I5.setVisible(true);
                break;
            case "jr":
//                Itype R16 = new Itype(no_ins);
//                R16.setVisible(true);
                break;
            case "sltu":
                DataPath R9 = new DataPath(no_ins);
                R9.setVisible(true);
                break;
            case "lw":
                Load L1 = new Load(no_ins);
                L1.setVisible(true);
                break;
            case "lh":
                Load L2 = new Load(no_ins);
                L2.setVisible(true);
                break;
            case "lb":
                Load L3 = new Load(no_ins);
                L3.setVisible(true);
                break;
            case "lhu":
                Itype I10 = new Itype(no_ins);
                I10.setVisible(true);
                break;
            case "lbu":
                Itype I11 = new Itype(no_ins);
                I11.setVisible(true);
                break;
            case "lui":
                Itype I12 = new Itype(no_ins);
                I12.setVisible(true);
                break;
            case "sw":
                Save S1 = new Save(no_ins);
                S1.setVisible(true);
                break;
            case "sh":
                Save S2 = new Save(no_ins);
                S2.setVisible(true);
                break;
            case "sb":
                Save S3 = new Save(no_ins);
                S3.setVisible(true);
                break;
            case "j":
                jump J2 = new jump(no_ins);
                J2.setVisible(true);
                break;
            case "sltui":
                Itype I16 = new Itype(no_ins);
                I16.setVisible(true);
                break;
            case "jal":
                jump J1 = new jump(no_ins);
                J1.setVisible(true);
                break;
            case "blt":
//                    Itype I17=new Itype(no_ins);
//               I17.setVisible(true);
                break;
            case "beq":
                branch B1 = new branch(no_ins);
                B1.setVisible(true);
                break;
            case "bne":
                branch B2 = new branch(no_ins);
                B2.setVisible(true);
                break;

        }
    }
}
