package jump;

import architecture.pkg2.IMAGES_FUNCTIONS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import static architecture.pkg2.Buttons.address;
import static architecture.pkg2.Buttons.aluOp;

public class jump extends javax.swing.JFrame {

    private int no_ins;

    /**
     * Creates new form DataPath
     */
    public jump(int no_ins) {
        this.no_ins = no_ins;
        initComponents();
    }
    IMAGES_FUNCTIONS B = new IMAGES_FUNCTIONS();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //reg file don't change
        regFile = new javax.swing.JLabel();
        //from pc to I-mem must be changed
        pc2Imem = new javax.swing.JLabel();
        //pc label don't change
        PC = new javax.swing.JLabel();
        //branch add alu don't change
        branchAdd = new javax.swing.JLabel();
        //shift left 2 to branch add must be changed
        shiftLeft2Add = new javax.swing.JLabel();
        //instruction mem 32 bit must be changed
        imemInstrction = new javax.swing.JLabel();
        //write data in regDst file don't change
        writeDataRegFile = new javax.swing.JLabel();
        //control unit don't change
        control = new javax.swing.JLabel();
        Alu2mux = new javax.swing.JLabel();
        //[15,0] from i-mem must be changed
        i0to15 = new javax.swing.JLabel();
        //from mux to regDst file must be changed
        mux2regfile = new javax.swing.JLabel();
        //mux next to data mem label 1 don't change
        muxDataMemLbl1 = new javax.swing.JLabel();
        //memRead control signal don't change
        memRead = new javax.swing.JLabel();
        //mux next to data mem label 0 don't change
        muxDataMemLbl0 = new javax.swing.JLabel();
        //mux to write regDst Label 1 don't change
        mux2WriteRegLbl1 = new javax.swing.JLabel();
        //mux to mux label 1 don't change
        mux2muxLbl1 = new javax.swing.JLabel();
        //mux 2 mux label 0 don't change
        mux2muxLbl0 = new javax.swing.JLabel();
        //mux to alu label 1 don't change
        mux2AluLbl1 = new javax.swing.JLabel();
        //mux to write regDst Labe0 1 don't change
        mux2WriteRegLbl0 = new javax.swing.JLabel();
        //zero flag don't change
        zeroFlag = new javax.swing.JLabel();
        //mux to alu label 0 don't change
        mux2AluLbl0 = new javax.swing.JLabel();
        //data mem don't change
        dataMem = new javax.swing.JLabel();
        //read address from regDst file don't change
        readAddress = new javax.swing.JLabel();
        //ALU control don't change
        aluControl = new javax.swing.JLabel();
        //sign extend don't change
        signExt = new javax.swing.JLabel();
        //alu don't change
        alu = new javax.swing.JLabel();
        //read address from data mem
        addressDataMem = new javax.swing.JLabel();
        //Read data from data mem don't change
        readData = new javax.swing.JLabel();
        //[20,16] from i-mem must be changed
        i16to20 = new javax.swing.JLabel();
        //read data 2 from instruction mem must be changed
        readData2 = new javax.swing.JLabel();
        //read regDst 2 from regDst file don' change
        readReg2 = new javax.swing.JLabel();
        //write regDst in regDst file don't change
        writeReg = new javax.swing.JLabel();
        //instruction mem don't change
        iMem = new javax.swing.JLabel();
        //write data in data mem don't change
        writeDataDataMem = new javax.swing.JLabel();
        //mux to PC label 0 don't change
        mux2PCLbl0 = new javax.swing.JLabel();
        //mux tp PC label 1 don't change
        mux2PCLbl1 = new javax.swing.JLabel();
        //instruction [31,26] must be changed
        i26to31 = new javax.swing.JLabel();
        //PC adder don't change
        PCAdd = new javax.swing.JLabel();
        //shift left 2 to adder don't change
        shiftLeft2ToAdd = new javax.swing.JLabel();
        //shift left 2 to mux don't chnage
        shiftLeft2ToMux = new javax.swing.JLabel();
        //jump address to mux must be changed
        jumpAddress2Mux = new javax.swing.JLabel();
        //from branch adder to mux could be changed
        branchAdd2mux = new javax.swing.JLabel();
        //from and to mux don't change
        And2Mux = new javax.swing.JLabel();
        //jump control signal don't change
        jumpCntrl = new javax.swing.JLabel();
        //memToReg control signal don't change
        memToReg = new javax.swing.JLabel();
        //Alu control signal must be changed
        AluControl = new javax.swing.JLabel();
        //memWrite control signal don't change
        MemWrite = new javax.swing.JLabel();
        //ALUSrc control signal don't change
        AluSrc = new javax.swing.JLabel();
        //regWrite control signal don't change
        regWrite = new javax.swing.JLabel();
        //zero flag signal could be changed
        zeroFlagSignal = new javax.swing.JLabel();
        //regDest control signal don't change
        regDst = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        //branch control signal don't change
        branch = new javax.swing.JLabel();
        //input number 4 to PC adder don't change
        input4 = new javax.swing.JLabel();
        //instruction [25,21] must be changed
        i21to25 = new javax.swing.JLabel();
        //rs (register value that was read from read data 1) must be changed
        rs = new javax.swing.JLabel();
        //instruction [25,0] must be changed
        i0to25 = new javax.swing.JLabel();
        //output from shift left 2 ([27,0]) must be changed
        shiftLeft0to27 = new javax.swing.JLabel();
        //read reg 1 in reg file don't change
        readReg1 = new javax.swing.JLabel();
        //read data 1 from reg file don't change
        readData1 = new javax.swing.JLabel();
        //mux to PC address must be changed
        Mux2PC = new javax.swing.JLabel();
        //from adder to mux must be changed
        add2Mux = new javax.swing.JLabel();
        //from sign extend to shift left must be changed
        signExt2ShiftLeft = new javax.swing.JLabel();
        //from mux to reg file must be changed
        mux2RegFile = new javax.swing.JLabel();
        //rt (reg value that was read from read data 2) must be changed
        rt = new javax.swing.JLabel();
        //alu control to alu must be changed
        AluCntrl2Alu = new javax.swing.JLabel();
        //data that was read from mem could be changed
        dataFromMem = new javax.swing.JLabel();
        //instruction [15,11] must be changed
        i11to15 = new javax.swing.JLabel();
        //rt to write data must be changed
        rt2WriteData = new javax.swing.JLabel();
        //PC to adder must be changed
        PC2Add = new javax.swing.JLabel();
        //instruction label don't change
        instruction = new javax.swing.JLabel();
        //[5,0] from i-mem must be changed
        i0to5 = new javax.swing.JLabel();
        //mux to Alu must be changed
        mux2Alu = new javax.swing.JLabel();
        //from branch mux to jump mux must be changed
        mux2Mux = new javax.swing.JLabel();
        //background label don't change
        backGroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 150));
        setMaximizedBounds(new java.awt.Rectangle(100, 100, 847, 590));
        setMinimumSize(new java.awt.Dimension(847, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(1360, 700));
        getContentPane().setLayout(null);

        regFile.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        regFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regFile.setText("reg file");
        getContentPane().add(regFile);
        regFile.setBounds(330, 410, 80, 20);

        pc2Imem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc2Imem.setText(B.To_Hexa(B.ADDRESS(no_ins)+""));
        getContentPane().add(pc2Imem);
        pc2Imem.setBounds(10, 480, 360, 30);

        PC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PC.setText("PC");
        getContentPane().add(PC);
        PC.setBounds(20, 420, 40, 14);

        branchAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branchAdd.setText("add");
        getContentPane().add(branchAdd);
        branchAdd.setBounds(480, 90, 80, 30);

        shiftLeft2Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftLeft2Add.setText("x");
        getContentPane().add(shiftLeft2Add);
        shiftLeft2Add.setBounds(440, 120, 40, 20);

        imemInstrction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imemInstrction.setText(B.To_Hexa(B.Jump_INSTRUCTION_BINARY(no_ins)));
        getContentPane().add(imemInstrction);
        imemInstrction.setBounds(170, 380, 260, 30);

        writeDataRegFile.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        writeDataRegFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        writeDataRegFile.setText("write data");
        getContentPane().add(writeDataRegFile);
        writeDataRegFile.setBounds(300, 410, 60, 20);

        control.setForeground(new java.awt.Color(0, 51, 204));
        control.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        control.setText("Control");
        getContentPane().add(control);
        control.setBounds(240, 170, 90, 30);

        Alu2mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alu2mux.setText("x");
        getContentPane().add(Alu2mux);
        Alu2mux.setBounds(510, 320, 90, 40);

        i0to15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i0to15.setText("x");
        getContentPane().add(i0to15);
        i0to15.setBounds(190, 460, 80, 20);

        mux2regfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2regfile.setText("x");
        getContentPane().add(mux2regfile);
        mux2regfile.setBounds(250, 370, 80, 20);

        muxDataMemLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muxDataMemLbl1.setText("1");
        getContentPane().add(muxDataMemLbl1);
        muxDataMemLbl1.setBounds(710, 360, 30, 30);

        memRead.setForeground(new java.awt.Color(0, 51, 255));
        memRead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memRead.setText("0");
        getContentPane().add(memRead);
        memRead.setBounds(350, 150, 60, 30);

        muxDataMemLbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muxDataMemLbl0.setText("0");
        getContentPane().add(muxDataMemLbl0);
        muxDataMemLbl0.setBounds(710, 410, 30, 20);

        mux2WriteRegLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2WriteRegLbl1.setText("1");
        getContentPane().add(mux2WriteRegLbl1);
        mux2WriteRegLbl1.setBounds(250, 410, 30, 20);

        mux2muxLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2muxLbl1.setText("1");
        getContentPane().add(mux2muxLbl1);
        mux2muxLbl1.setBounds(670, 100, 40, 30);

        mux2muxLbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2muxLbl0.setText("0");
        getContentPane().add(mux2muxLbl0);
        mux2muxLbl0.setBounds(670, 60, 40, 20);

        mux2AluLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2AluLbl1.setText("1");
        getContentPane().add(mux2AluLbl1);
        mux2AluLbl1.setBounds(420, 390, 40, 20);

        mux2WriteRegLbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2WriteRegLbl0.setText("0");
        getContentPane().add(mux2WriteRegLbl0);
        mux2WriteRegLbl0.setBounds(250, 360, 30, 20);

        zeroFlag.setForeground(new java.awt.Color(0, 0, 204));
        zeroFlag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zeroFlag.setText("zero");
        getContentPane().add(zeroFlag);
        zeroFlag.setBounds(510, 320, 30, 20);

        mux2AluLbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2AluLbl0.setText("0");
        getContentPane().add(mux2AluLbl0);
        mux2AluLbl0.setBounds(420, 350, 40, 20);

        dataMem.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        dataMem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataMem.setText("Data mem");
        getContentPane().add(dataMem);
        dataMem.setBounds(620, 450, 80, 20);

        readAddress.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        readAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readAddress.setText("Read address");
        getContentPane().add(readAddress);
        readAddress.setBounds(80, 410, 80, 30);

        aluControl.setFont(new java.awt.Font("Dialog", 1, 7)); // NOI18N
        aluControl.setForeground(new java.awt.Color(0, 51, 204));
        aluControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aluControl.setText("ALU cont");
        getContentPane().add(aluControl);
        aluControl.setBounds(400, 460, 90, 40);

        signExt.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        signExt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signExt.setText("sign ext");
        getContentPane().add(signExt);
        signExt.setBounds(320, 470, 60, 30);

        alu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alu.setText("ALU");
        getContentPane().add(alu);
        alu.setBounds(510, 330, 30, 30);

        addressDataMem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressDataMem.setText("address");
        getContentPane().add(addressDataMem);
        addressDataMem.setBounds(590, 330, 50, 30);

        readData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readData.setText("read data");
        getContentPane().add(readData);
        readData.setBounds(610, 370, 80, 20);

        i16to20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i16to20.setText("x");
        getContentPane().add(i16to20);
        i16to20.setBounds(220, 320, 80, 20);

        readData2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        readData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readData2.setText("read data2");
        readData2.setToolTipText("");
        getContentPane().add(readData2);
        readData2.setBounds(330, 350, 70, 30);

        readReg2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        readReg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readReg2.setText("read reg2");
        getContentPane().add(readReg2);
        readReg2.setBounds(300, 330, 60, 30);

        writeReg.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        writeReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        writeReg.setText("write reg");
        getContentPane().add(writeReg);
        writeReg.setBounds(300, 380, 60, 20);

        iMem.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        iMem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iMem.setText("Instruction mem");
        getContentPane().add(iMem);
        iMem.setBounds(70, 450, 110, 30);

        writeDataDataMem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        writeDataDataMem.setText("write data");
        getContentPane().add(writeDataDataMem);
        writeDataDataMem.setBounds(580, 420, 80, 20);

        mux2PCLbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2PCLbl0.setText("0");
        getContentPane().add(mux2PCLbl0);
        mux2PCLbl0.setBounds(750, 50, 40, 20);

        mux2PCLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2PCLbl1.setText("1");
        getContentPane().add(mux2PCLbl1);
        mux2PCLbl1.setBounds(750, 100, 40, 20);

        i26to31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i26to31.setText(B.To_Hexa(B.Jump_OP_CODE(no_ins)));
        getContentPane().add(i26to31);
        i26to31.setBounds(110, 160, 320, 30);

        PCAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PCAdd.setText("add");
        getContentPane().add(PCAdd);
        PCAdd.setBounds(100, 80, 90, 20);

        shiftLeft2ToAdd.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        shiftLeft2ToAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftLeft2ToAdd.setText("shift left 2");
        getContentPane().add(shiftLeft2ToAdd);
        shiftLeft2ToAdd.setBounds(390, 130, 80, 20);

        shiftLeft2ToMux.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        shiftLeft2ToMux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftLeft2ToMux.setText("shift left 2");
        getContentPane().add(shiftLeft2ToMux);
        shiftLeft2ToMux.setBounds(190, 40, 80, 20);

        jumpAddress2Mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumpAddress2Mux.setText(B.To_Hexa(jLabel58.getText()+shiftLeft0to27.getText()));
        getContentPane().add(jumpAddress2Mux);
        jumpAddress2Mux.setBounds(470, 50, 370, 20);

        branchAdd2mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branchAdd2mux.setText("x");
        getContentPane().add(branchAdd2mux);
        branchAdd2mux.setBounds(540, 90, 60, 20);

        And2Mux.setForeground(new java.awt.Color(0, 51, 255));
        And2Mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        And2Mux.setText("x");
        getContentPane().add(And2Mux);
        And2Mux.setBounds(610, 130, 80, 20);

        jumpCntrl.setForeground(new java.awt.Color(0, 51, 255));
        jumpCntrl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumpCntrl.setText("0");
        getContentPane().add(jumpCntrl);
        jumpCntrl.setBounds(300, 130, 80, 20);

        memToReg.setForeground(new java.awt.Color(0, 51, 255));
        memToReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memToReg.setText("x");
        getContentPane().add(memToReg);
        memToReg.setBounds(340, 170, 80, 20);

        AluControl.setForeground(new java.awt.Color(0, 51, 255));
        AluControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AluControl.setText("x");
        getContentPane().add(AluControl);
        AluControl.setBounds(340, 170, 80, 40);

        MemWrite.setForeground(new java.awt.Color(0, 51, 255));
        MemWrite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemWrite.setText("0");
        getContentPane().add(MemWrite);
        MemWrite.setBounds(350, 190, 60, 30);

        AluSrc.setForeground(new java.awt.Color(0, 51, 255));
        AluSrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AluSrc.setText("x");
        getContentPane().add(AluSrc);
        AluSrc.setBounds(350, 200, 60, 30);

        regWrite.setForeground(new java.awt.Color(0, 51, 255));
        regWrite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regWrite.setText("0");
        getContentPane().add(regWrite);
        regWrite.setBounds(300, 210, 60, 30);

        zeroFlagSignal.setForeground(new java.awt.Color(0, 51, 255));
        zeroFlagSignal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zeroFlagSignal.setText("x");
        getContentPane().add(zeroFlagSignal);
        zeroFlagSignal.setBounds(520, 310, 60, 30);

        regDst.setForeground(new java.awt.Color(0, 51, 255));
        regDst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regDst.setText("x");
        getContentPane().add(regDst);
        regDst.setBounds(240, 90, 80, 20);

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText(B.To_Hexa(B.Jump_Label_First_4_BINARY_NUMBERS(B.ADDRESS(no_ins)+"")));
        getContentPane().add(jLabel58);
        jLabel58.setBounds(230, 70, 180, 20);

        branch.setForeground(new java.awt.Color(0, 51, 255));
        branch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branch.setText("x");
        getContentPane().add(branch);
        branch.setBounds(340, 140, 80, 20);

        input4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        input4.setText("4");
        getContentPane().add(input4);
        input4.setBounds(50, 110, 41, 20);

        i21to25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i21to25.setText("x");
        getContentPane().add(i21to25);
        i21to25.setBounds(210, 300, 80, 20);

        rs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rs.setText("x");
        getContentPane().add(rs);
        rs.setBounds(390, 300, 80, 20);

        i0to25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i0to25.setText(B.To_Hexa(B.Jump_Label_Value_26(B.Get_Label_Value_BINARY_16_bit(B.Get_Label_value(no_ins)))));
        getContentPane().add(i0to25);
        i0to25.setBounds(140, 250, 280, 20);

        shiftLeft0to27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftLeft0to27.setText(B.To_Hexa(B.Jump_Label_Value_28(B.Jump_Label_Value_26(B.Jump_Label_Value_26(B.Get_Label_Value_BINARY_16_bit(B.Get_Label_value(no_ins)))))));
        getContentPane().add(shiftLeft0to27);
        shiftLeft0to27.setBounds(240, 30, 320, 20);

        readReg1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        readReg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readReg1.setText("read reg1");
        readReg1.setToolTipText("");
        getContentPane().add(readReg1);
        readReg1.setBounds(300, 310, 60, 20);

        readData1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        readData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readData1.setText("read data1");
        readData1.setToolTipText("");
        getContentPane().add(readData1);
        readData1.setBounds(330, 300, 70, 20);

        Mux2PC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mux2PC.setText(B.To_Hexa(jumpAddress2Mux.getText()));
        getContentPane().add(Mux2PC);
        Mux2PC.setBounds(650, 0, 180, 30);

        add2Mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add2Mux.setText("x");
        getContentPane().add(add2Mux);
        add2Mux.setBounds(360, 60, 41, 20);

        signExt2ShiftLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signExt2ShiftLeft.setText("x");
        getContentPane().add(signExt2ShiftLeft);
        signExt2ShiftLeft.setBounds(370, 460, 40, 20);

        mux2RegFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2RegFile.setText("x");
        getContentPane().add(mux2RegFile);
        mux2RegFile.setBounds(710, 370, 90, 40);

        rt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rt.setText("x");
        getContentPane().add(rt);
        rt.setBounds(360, 340, 90, 30);

        AluCntrl2Alu.setForeground(new java.awt.Color(0, 51, 255));
        AluCntrl2Alu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AluCntrl2Alu.setText("x");
        getContentPane().add(AluCntrl2Alu);
        AluCntrl2Alu.setBounds(440, 450, 90, 40);

        dataFromMem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataFromMem.setText("x");
        getContentPane().add(dataFromMem);
        dataFromMem.setBounds(650, 350, 90, 40);

        i11to15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i11to15.setText("x");
        getContentPane().add(i11to15);
        i11to15.setBounds(190, 400, 80, 20);

        rt2WriteData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rt2WriteData.setText("x");
        getContentPane().add(rt2WriteData);
        rt2WriteData.setBounds(410, 410, 90, 30);

        PC2Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PC2Add.setText(B.To_Hexa(B.ADDRESS(no_ins)+""));
        getContentPane().add(PC2Add);
        PC2Add.setBounds(0, 300, 290, 30);

        instruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction.setText("instruction");
        getContentPane().add(instruction);
        instruction.setBounds(90, 390, 90, 30);

        i0to5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i0to5.setText("x");
        getContentPane().add(i0to5);
        i0to5.setBounds(290, 500, 80, 20);

        mux2Alu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2Alu.setText("x");
        getContentPane().add(mux2Alu);
        mux2Alu.setBounds(420, 350, 90, 30);

        mux2Mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mux2Mux.setText("x");
        getContentPane().add(mux2Mux);
        mux2Mux.setBounds(700, 90, 60, 20);

        backGroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jump/jump.jpg"))); // NOI18N
        getContentPane().add(backGroundLbl);
        backGroundLbl.setBounds(0, 0, 847, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jump.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jump.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jump.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jump.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new jump().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Alu2mux;
    public javax.swing.JLabel AluCntrl2Alu;
    public javax.swing.JLabel AluControl;
    private javax.swing.JLabel AluSrc;
    private javax.swing.JLabel And2Mux;
    private javax.swing.JLabel MemWrite;
    public javax.swing.JLabel Mux2PC;
    private javax.swing.JLabel PC;
    public javax.swing.JLabel PC2Add;
    private javax.swing.JLabel PCAdd;
    public javax.swing.JLabel add2Mux;
    private javax.swing.JLabel addressDataMem;
    private javax.swing.JLabel alu;
    private javax.swing.JLabel aluControl;
    private javax.swing.JLabel backGroundLbl;
    private javax.swing.JLabel branch;
    private javax.swing.JLabel branchAdd;
    public javax.swing.JLabel branchAdd2mux;
    private javax.swing.JLabel control;
    public javax.swing.JLabel dataFromMem;
    private javax.swing.JLabel dataMem;
    public javax.swing.JLabel i0to15;
    public javax.swing.JLabel i0to25;
    public javax.swing.JLabel i0to5;
    public javax.swing.JLabel i11to15;
    public javax.swing.JLabel i16to20;
    public javax.swing.JLabel i21to25;
    public javax.swing.JLabel i26to31;
    private javax.swing.JLabel iMem;
    public javax.swing.JLabel imemInstrction;
    private javax.swing.JLabel input4;
    private javax.swing.JLabel instruction;
    public javax.swing.JLabel jLabel58;
    public javax.swing.JLabel jumpAddress2Mux;
    private javax.swing.JLabel jumpCntrl;
    private javax.swing.JLabel memRead;
    private javax.swing.JLabel memToReg;
    public javax.swing.JLabel mux2Alu;
    private javax.swing.JLabel mux2AluLbl0;
    private javax.swing.JLabel mux2AluLbl1;
    public javax.swing.JLabel mux2Mux;
    private javax.swing.JLabel mux2PCLbl0;
    private javax.swing.JLabel mux2PCLbl1;
    public javax.swing.JLabel mux2RegFile;
    private javax.swing.JLabel mux2WriteRegLbl0;
    private javax.swing.JLabel mux2WriteRegLbl1;
    private javax.swing.JLabel mux2muxLbl0;
    private javax.swing.JLabel mux2muxLbl1;
    public javax.swing.JLabel mux2regfile;
    private javax.swing.JLabel muxDataMemLbl0;
    private javax.swing.JLabel muxDataMemLbl1;
    public javax.swing.JLabel pc2Imem;
    private javax.swing.JLabel readAddress;
    private javax.swing.JLabel readData;
    private javax.swing.JLabel readData1;
    private javax.swing.JLabel readData2;
    private javax.swing.JLabel readReg1;
    private javax.swing.JLabel readReg2;
    private javax.swing.JLabel regDst;
    private javax.swing.JLabel regFile;
    private javax.swing.JLabel regWrite;
    public javax.swing.JLabel rs;
    public javax.swing.JLabel rt;
    public javax.swing.JLabel rt2WriteData;
    public javax.swing.JLabel shiftLeft0to27;
    public javax.swing.JLabel shiftLeft2Add;
    private javax.swing.JLabel shiftLeft2ToAdd;
    private javax.swing.JLabel shiftLeft2ToMux;
    private javax.swing.JLabel signExt;
    public javax.swing.JLabel signExt2ShiftLeft;
    private javax.swing.JLabel writeDataDataMem;
    private javax.swing.JLabel writeDataRegFile;
    private javax.swing.JLabel writeReg;
    private javax.swing.JLabel zeroFlag;
    public javax.swing.JLabel zeroFlagSignal;
    // End of variables declaration//GEN-END:variables
}
