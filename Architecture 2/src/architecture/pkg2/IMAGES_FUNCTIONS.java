package architecture.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static architecture.pkg2.Buttons.address;
import static architecture.pkg2.Buttons.aluOp;

public class IMAGES_FUNCTIONS {

    Variables an = new Variables();
    $Value V = new $Value();

    public void IMAGES_FUNCTIONS() {
    }

    public String R_Type_INSBINARY(int x) {
        String s1 = First_Reg_BINARY(x);
        String s2 = Second_Reg_BINARY(x);

        switch (an.pp[x][1].getText()) {
            case "add":
                String s3 = Third_Reg_BINARY(x);
                return "000000" + s2 + s3 + s1 + "00000" + "100000";
            case "sub":
                String s4 = Third_Reg_BINARY(x);
                return "000000" + s2 + s4 + s1 + "00000" + "100010";
            case "sll":
                String o1 = Get_Offset(x);
                return "000000" + "00000" + s2 + s1 + o1 + "000000";
            case "srl":
                String o2 = Get_Offset(x);
                return "000000" + "00000" + s2 + s1 + o2 + "000010";
            case "slt":
                String s5 = Third_Reg_BINARY(x);
                return "000000" + s2 + s5 + s1 + "00000" + "101010";
            case "and":
                String s6 = Third_Reg_BINARY(x);
                return "000000" + s2 + s6 + s1 + "00000" + "100100";
            case "or":
                String s7 = Third_Reg_BINARY(x);
                return "000000" + s2 + s7 + s1 + "00000" + "100101";
            case "nor":
                String s8 = Third_Reg_BINARY(x);
                return "000000" + s2 + s8 + s1 + "00000" + "100111";
            // case "jr":return "000000"+s3+s2+s1+"00000"+"001000";
            case "sltu":
                String s9 = Third_Reg_BINARY(x);
                return "000000" + s2 + s9 + s1 + "00000" + "101011";
        }
        return "";
    }

    public String Get_Function_Code(int x) {
        switch (an.pp[x][1].getText()) {
            case "add":
                return "100000";
            case "sub":
                return "100010";
            case "sll":
                return "000000";
            case "srl":
                return "000010";
            case "slt":
                return "101010";
            case "and":
                return "100100";
            case "or":
                return "100101";
            case "nor":
                return "100111";
            case "jr":
                return "001000";
            case "sltu":
                return "101011";
        }
        return "";
    }

    public String Get_OPCode_I_Type(int x) {
        switch (an.pp[x][1].getText()) {
            case "addi":
                return "001000";
            case "lw":
                return "100011";
            case "lh":
                return "100001";
            case "lhu":
                return "100101";
            case "lb":
                return "100000";
            case "lbu":
                return "100100";
            case "lui":
                return "001111";
            case "sw":
                return "101011";
            case "sh":
                return "101001";
            case "sb":
                return "101000";
            case "slti":
                return "001010";
            case "andi":
                return "001100";
            case "ori":
                return "001101";
            case "beq":
                return "000100";
            case "bne":
                return "000101";
            case "sltui":
                return "001011";
        }
        return "";
    }

    public String Get_OPCode_R_Type(int x) {
        return "000000";
    }

    public String Get_Offset(int x) {
        String s = Integer.toBinaryString(Integer.parseInt(an.pp[x][4].getText().trim()));
        if (s.length() == 1) {
            return "0000" + s;
        } else if (s.length() == 2) {
            return "000" + s;
        } else if (s.length() == 3) {
            return "00" + s;
        } else if (s.length() == 4) {
            return "0" + s;
        } else if (s.length() == 5) {
            return s;
        } else if (s.length() == 0) {
            return "00000";
        } else {
            return null;
        }
    }

    public String First_Reg_BINARY(int x) {
        switch (an.pp[x][2].getText()) {
            case "$zero":
                return "00000";
            case "$t0":
                return "00001";
            case "$t1":
                return "00010";
            case "$t2":
                return "00011";
            case "$t3":
                return "00100";
            case "$t4":
                return "00101";
            case "$t5":
                return "00110";
            case "$t6":
                return "00111";
            case "$t7":
                return "01000";
            case "$t8":
                return "01001";
            case "$t9":
                return "01010";
            case "$s0":
                return "01011";
            case "$s1":
                return "01100";
            case "$s2":
                return "01101";
            case "$s3":
                return "01110";
            case "$s4":
                return "01111";
            case "$s5":
                return "10000";
            case "$s6":
                return "10001";
            case "$s7":
                return "10010";
            case "$at":
                return "10011";
            case "$a0":
                return "10100";
            case "$a1":
                return "10101";
            case "$a2":
                return "10110";
            case "$a3":
                return "10111";
            case "$v0":
                return "11000";
            case "$v1":
                return "11001";
            case "$ra":
                return "11010";
            case "$sp":
                return "11011";

        }
        return null;
    }

    public String Second_Reg_BINARY(int x) {
        switch (an.pp[x][3].getText()) {
            case "$zero":
                return "00000";
            case "$t0":
                return "00001";
            case "$t1":
                return "00010";
            case "$t2":
                return "00011";
            case "$t3":
                return "00100";
            case "$t4":
                return "00101";
            case "$t5":
                return "00110";
            case "$t6":
                return "00111";
            case "$t7":
                return "01000";
            case "$t8":
                return "01001";
            case "$t9":
                return "01010";
            case "$s0":
                return "01011";
            case "$s1":
                return "01100";
            case "$s2":
                return "01101";
            case "$s3":
                return "01110";
            case "$s4":
                return "01111";
            case "$s5":
                return "10000";
            case "$s6":
                return "10001";
            case "$s7":
                return "10010";
            case "$at":
                return "10011";
            case "$a0":
                return "10100";
            case "$a1":
                return "10101";
            case "$a2":
                return "10110";
            case "$a3":
                return "10111";
            case "$v0":
                return "11000";
            case "$v1":
                return "11001";
            case "$ra":
                return "11010";
            case "$sp":
                return "11011";

        }
        return null;
    }

    public String Third_Reg_BINARY(int x) {
        switch (an.pp[x][4].getText()) {
            case "$zero":
                return "00000";
            case "$t0":
                return "00001";
            case "$t1":
                return "00010";
            case "$t2":
                return "00011";
            case "$t3":
                return "00100";
            case "$t4":
                return "00101";
            case "$t5":
                return "00110";
            case "$t6":
                return "00111";
            case "$t7":
                return "01000";
            case "$t8":
                return "01001";
            case "$t9":
                return "01010";
            case "$s0":
                return "01011";
            case "$s1":
                return "01100";
            case "$s2":
                return "01101";
            case "$s3":
                return "01110";
            case "$s4":
                return "01111";
            case "$s5":
                return "10000";
            case "$s6":
                return "10001";
            case "$s7":
                return "10010";
            case "$at":
                return "10011";
            case "$a0":
                return "10100";
            case "$a1":
                return "10101";
            case "$a2":
                return "10110";
            case "$a3":
                return "10111";
            case "$v0":
                return "11000";
            case "$v1":
                return "11001";
            case "$ra":
                return "11010";
            case "$sp":
                return "11011";

        }
        return null;
    }

    public String I_Type_INSBINARY(int x) {
        String s1 = First_Reg_BINARY(x);
        String s2 = Second_Reg_BINARY(x);
        switch (an.pp[x][1].getText()) {
            case "addi":
                String r1 = REAL_Number_BINARY(x);
                return "001000" + s2 + s1 + r1;
            case "lw":
                String r2 = REAL_Number_BINARY(x);
                return "100011" + s2 + s1 + r2;
            case "lh":
                String r3 = REAL_Number_BINARY(x);
                return "100001" + s2 + s1 + r3;
            case "lhu":
                String r4 = REAL_Number_BINARY(x);
                return "100101" + s2 + s1 + r4;
            case "lb":
                String r5 = REAL_Number_BINARY(x);
                return "100000" + s2 + s1 + r5;
            case "lbu":
                String r6 = REAL_Number_BINARY(x);
                return "100100" + s2 + s1 + r6;
            case "lui":
                String r7 = REAL_Number_BINARY(x);
                return "001111" + s2 + s1 + r7;
            case "sw":
                String r8 = REAL_Number_BINARY(x);
                return "101011" + s2 + s1 + r8;
            case "sh":
                String r9 = REAL_Number_BINARY(x);
                return "101001" + s2 + s1 + r9;
            case "sb":
                String r10 = REAL_Number_BINARY(x);
                return "101000" + s2 + s1 + r10;
            case "slti":
                String r11 = REAL_Number_BINARY(x);
                return "001010" + s2 + s1 + r11;
            case "andi":
                String r12 = REAL_Number_BINARY(x);
                return "001100" + s2 + s1 + r12;
            case "ori":
                String r13 = REAL_Number_BINARY(x);
                return "001101" + s2 + s1 + r13;
            case "beq":
                String L1 = Get_Label_Value_BINARY_16_bit(Get_Label_value(x));
                return "000100" + s2 + s1 + L1;
            case "bne":
                String L2 = Get_Label_Value_BINARY_16_bit(Get_Label_value(x));
                return "000101" + s2 + s1 + L2;
            case "sltui":
                String r14 = REAL_Number_BINARY(x);
                return "001011" + s2 + s1 + r14;
        }
        return "";
    }

    public String REAL_Number_BINARY(int x) {
        String s = Integer.toBinaryString(Integer.parseInt(an.pp[x][4].getText().trim()));
        switch (s.length()) {
            case 0:
                return "0000000000000000" + s;
            case 1:
                return "000000000000000" + s;
            case 2:
                return "00000000000000" + s;
            case 3:
                return "0000000000000" + s;
            case 4:
                return "000000000000" + s;
            case 5:
                return "00000000000" + s;
            case 6:
                return "0000000000" + s;
            case 7:
                return "000000000" + s;
            case 8:
                return "00000000" + s;
            case 9:
                return "0000000" + s;
            case 10:
                return "000000" + s;
            case 11:
                return "00000" + s;
            case 12:
                return "0000" + s;
            case 13:
                return "000" + s;
            case 14:
                return "00" + s;
            case 15:
                return "0" + s;
            case 16:
                return s;
        }
        return null;
    }

    public String Real_Number_32_Bit(String s) {
        return "0000000000000000" + s;
    }

    public String To_Hexa(String s) {
        int x = Integer.parseInt(s);
        return Integer.toHexString(x);
    }

    public String Value(int x) {
        switch (an.pp[x][3].getText()) {
            case "$zero":
                return "" + V.$_V[0];
            case "$t0":
                return "" + V.$_V[1];
            case "$t1":
                return "" + V.$_V[2];
            case "$t2":
                return "" + V.$_V[3];
            case "$t3":
                return "" + V.$_V[4];
            case "$t4":
                return "" + V.$_V[5];
            case "$t5":
                return "" + V.$_V[6];
            case "$t6":
                return "" + V.$_V[7];
            case "$t7":
                return "" + V.$_V[8];
            case "$t8":
                return "" + V.$_V[9];
            case "$t9":
                return "" + V.$_V[10];
            case "$s0":
                return "" + V.$_V[11];
            case "$s1":
                return "" + V.$_V[12];
            case "$s2":
                return "" + V.$_V[13];
            case "$s3":
                return "" + V.$_V[14];
            case "$s4":
                return "" + V.$_V[15];
            case "$s5":
                return "" + V.$_V[16];
            case "$s6":
                return "" + V.$_V[17];
            case "$s7":
                return "" + V.$_V[18];
            case "$at":
                return "" + V.$_V[19];
            case "$a0":
                return "" + V.$_V[20];
            case "$a1":
                return "" + V.$_V[21];
            case "$a2":
                return "" + V.$_V[22];
            case "$a3":
                return "" + V.$_V[23];
            case "$v0":
                return "" + V.$_V[24];
            case "$v1":
                return "" + V.$_V[25];
            case "$ra":
                return "" + V.$_V[26];
            case "$sp":
                return "" + V.$_V[27];
        }
        return "" + 0;
    }

    public String Value_Of_First_Reg_R_Type(int x) {
        switch (an.pp[x][2].getText()) {
            case "$zero":
                return "" + V.$_V[0];
            case "$t0":
                return "" + V.$_V[1];
            case "$t1":
                return "" + V.$_V[2];
            case "$t2":
                return "" + V.$_V[3];
            case "$t3":
                return "" + V.$_V[4];
            case "$t4":
                return "" + V.$_V[5];
            case "$t5":
                return "" + V.$_V[6];
            case "$t6":
                return "" + V.$_V[7];
            case "$t7":
                return "" + V.$_V[8];
            case "$t8":
                return "" + V.$_V[9];
            case "$t9":
                return "" + V.$_V[10];
            case "$s0":
                return "" + V.$_V[11];
            case "$s1":
                return "" + V.$_V[12];
            case "$s2":
                return "" + V.$_V[13];
            case "$s3":
                return "" + V.$_V[14];
            case "$s4":
                return "" + V.$_V[15];
            case "$s5":
                return "" + V.$_V[16];
            case "$s6":
                return "" + V.$_V[17];
            case "$s7":
                return "" + V.$_V[18];
            case "$at":
                return "" + V.$_V[19];
            case "$a0":
                return "" + V.$_V[20];
            case "$a1":
                return "" + V.$_V[21];
            case "$a2":
                return "" + V.$_V[22];
            case "$a3":
                return "" + V.$_V[23];
            case "$v0":
                return "" + V.$_V[24];
            case "$v1":
                return "" + V.$_V[25];
            case "$ra":
                return "" + V.$_V[26];
            case "$sp":
                return "" + V.$_V[27];
        }
        return "" + 0;
    }

    public String Get_Label_BINARY(int x) {
        return null;
    }

    public String Value_Of_Third_Reg_R_Type(int x) {
        switch (an.pp[x][4].getText()) {
            case "$zero":
                return "" + V.$_V[0];
            case "$t0":
                return "" + V.$_V[1];
            case "$t1":
                return "" + V.$_V[2];
            case "$t2":
                return "" + V.$_V[3];
            case "$t3":
                return "" + V.$_V[4];
            case "$t4":
                return "" + V.$_V[5];
            case "$t5":
                return "" + V.$_V[6];
            case "$t6":
                return "" + V.$_V[7];
            case "$t7":
                return "" + V.$_V[8];
            case "$t8":
                return "" + V.$_V[9];
            case "$t9":
                return "" + V.$_V[10];
            case "$s0":
                return "" + V.$_V[11];
            case "$s1":
                return "" + V.$_V[12];
            case "$s2":
                return "" + V.$_V[13];
            case "$s3":
                return "" + V.$_V[14];
            case "$s4":
                return "" + V.$_V[15];
            case "$s5":
                return "" + V.$_V[16];
            case "$s6":
                return "" + V.$_V[17];
            case "$s7":
                return "" + V.$_V[18];
            case "$at":
                return "" + V.$_V[19];
            case "$a0":
                return "" + V.$_V[20];
            case "$a1":
                return "" + V.$_V[21];
            case "$a2":
                return "" + V.$_V[22];
            case "$a3":
                return "" + V.$_V[23];
            case "$v0":
                return "" + V.$_V[24];
            case "$v1":
                return "" + V.$_V[25];
            case "$ra":
                return "" + V.$_V[26];
            case "$sp":
                return "" + V.$_V[27];
        }
        return "" + 0;
    }

    public String Value_Of_Second_Reg_R_Type(int x) {
        switch (an.pp[x][3].getText()) {
            case "$zero":
                return "" + V.$_V[0];
            case "$t0":
                return "" + V.$_V[1];
            case "$t1":
                return "" + V.$_V[2];
            case "$t2":
                return "" + V.$_V[3];
            case "$t3":
                return "" + V.$_V[4];
            case "$t4":
                return "" + V.$_V[5];
            case "$t5":
                return "" + V.$_V[6];
            case "$t6":
                return "" + V.$_V[7];
            case "$t7":
                return "" + V.$_V[8];
            case "$t8":
                return "" + V.$_V[9];
            case "$t9":
                return "" + V.$_V[10];
            case "$s0":
                return "" + V.$_V[11];
            case "$s1":
                return "" + V.$_V[12];
            case "$s2":
                return "" + V.$_V[13];
            case "$s3":
                return "" + V.$_V[14];
            case "$s4":
                return "" + V.$_V[15];
            case "$s5":
                return "" + V.$_V[16];
            case "$s6":
                return "" + V.$_V[17];
            case "$s7":
                return "" + V.$_V[18];
            case "$at":
                return "" + V.$_V[19];
            case "$a0":
                return "" + V.$_V[20];
            case "$a1":
                return "" + V.$_V[21];
            case "$a2":
                return "" + V.$_V[22];
            case "$a3":
                return "" + V.$_V[23];
            case "$v0":
                return "" + V.$_V[24];
            case "$v1":
                return "" + V.$_V[25];
            case "$ra":
                return "" + V.$_V[26];
            case "$sp":
                return "" + V.$_V[27];
        }
        return "" + 0;
    }

    public int Value_Of_First_Reg_R_Type_INT_VALUE(int x) {
        switch (an.pp[x][2].getText()) {
            case "$zero":
                return V.$_V[0];
            case "$t0":
                return V.$_V[1];
            case "$t1":
                return V.$_V[2];
            case "$t2":
                return V.$_V[3];
            case "$t3":
                return V.$_V[4];
            case "$t4":
                return V.$_V[5];
            case "$t5":
                return V.$_V[6];
            case "$t6":
                return V.$_V[7];
            case "$t7":
                return V.$_V[8];
            case "$t8":
                return V.$_V[9];
            case "$t9":
                return V.$_V[10];
            case "$s0":
                return V.$_V[11];
            case "$s1":
                return V.$_V[12];
            case "$s2":
                return V.$_V[13];
            case "$s3":
                return V.$_V[14];
            case "$s4":
                return V.$_V[15];
            case "$s5":
                return V.$_V[16];
            case "$s6":
                return V.$_V[17];
            case "$s7":
                return V.$_V[18];
            case "$at":
                return V.$_V[19];
            case "$a0":
                return V.$_V[20];
            case "$a1":
                return V.$_V[21];
            case "$a2":
                return V.$_V[22];
            case "$a3":
                return V.$_V[23];
            case "$v0":
                return V.$_V[24];
            case "$v1":
                return V.$_V[25];
            case "$ra":
                return V.$_V[26];
            case "$sp":
                return V.$_V[27];
        }
        return 0;
    }

    public int Plus_2_BINARY(int x) {
        int y, z;
        y = Integer.parseInt(an.pp[x][4].getText().trim());
        z = Value_Of_First_Reg_R_Type_INT_VALUE(x);
        return (x + y);
    }

    public int Get_REG_Value(int REG_NUM) {
        return V.$_V[REG_NUM];
    }

    public int Get_Label_value(int x) {
        for (int v = 0; v < an.n; v++) {
            if ((an.pp[x][4].getText()).equalsIgnoreCase(an.pp[v][0].getText())) {
                if (x < v) {
                    return ((v - x) * 4) - 4;
                } else {
                    return ((v - x) * 4) + 4;
                }
            }
        }
        return 0;
    }

    public String Get_Label_Value_BINARY_16_bit(int Value) {
        String s = Integer.toBinaryString(Value);
        switch (s.length()) {
            case 0:
                return "0000000000000000" + s;
            case 1:
                return "000000000000000" + s;
            case 2:
                return "00000000000000" + s;
            case 3:
                return "0000000000000" + s;
            case 4:
                return "000000000000" + s;
            case 5:
                return "00000000000" + s;
            case 6:
                return "0000000000" + s;
            case 7:
                return "000000000" + s;
            case 8:
                return "00000000" + s;
            case 9:
                return "0000000" + s;
            case 10:
                return "000000" + s;
            case 11:
                return "00000" + s;
            case 12:
                return "0000" + s;
            case 13:
                return "000" + s;
            case 14:
                return "00" + s;
            case 15:
                return "0" + s;
            case 16:
                return s;
        }
        return null;
    }

    public String Get_Label_Value_BINARY_32_bit(String Value_BINARY_16_Bit) {
        return "0000000000000000" + Value_BINARY_16_Bit;
    }

    public String Label_32_times_4_BINARY(int Label_Value) {
        return Get_Label_Value_BINARY_32_bit(Get_Label_Value_BINARY_16_bit(Label_Value * 4));
    }

    public String ADDing_ADDRESS(int address_VALUE, int x) {
        int z = address_VALUE + (Get_Label_value(x) * 4);
        String s = Integer.toBinaryString(z);
        switch (s.length()) {
            case 0:
                return "00000000000000000000000000000000" + s;
            case 1:
                return "0000000000000000000000000000000" + s;
            case 2:
                return "000000000000000000000000000000" + s;
            case 3:
                return "00000000000000000000000000000" + s;
            case 4:
                return "0000000000000000000000000000" + s;
            case 5:
                return "000000000000000000000000000" + s;
            case 6:
                return "00000000000000000000000000" + s;
            case 7:
                return "0000000000000000000000000" + s;
            case 8:
                return "000000000000000000000000" + s;
            case 9:
                return "00000000000000000000000" + s;
            case 10:
                return "0000000000000000000000" + s;
            case 11:
                return "000000000000000000000" + s;
            case 12:
                return "00000000000000000000" + s;
            case 13:
                return "0000000000000000000" + s;
            case 14:
                return "000000000000000000" + s;
            case 15:
                return "00000000000000000" + s;
            case 16:
                return "0000000000000000" + s;
            case 17:
                return "000000000000000" + s;
            case 18:
                return "00000000000000" + s;
            case 19:
                return "0000000000000" + s;
            case 20:
                return "000000000000" + s;
            case 21:
                return "00000000000" + s;
            case 22:
                return "0000000000" + s;
            case 23:
                return "000000000" + s;
            case 24:
                return "00000000" + s;
            case 25:
                return "0000000" + s;
            case 26:
                return "000000" + s;
            case 27:
                return "00000" + s;
            case 28:
                return "0000" + s;
            case 29:
                return "000" + s;
            case 30:
                return "00" + s;
            case 31:
                return "0" + s;
            case 32:
                return "" + s;
        }
        return null;
    }

    public String Jump_INSTRUCTION_BINARY(int x) {
        String s = Jump_Label_Value_26(Get_Label_Value_BINARY_16_bit(Get_Label_value(x)));
        switch (an.pp[x][1].getText()) {
            case "j":
                return "000010" + s;
            case "jal":
                return "000011" + s;
        }
        return null;
    }

    public String Jump_OP_CODE(int x) {
        switch (an.pp[x][1].getText()) {
            case "j":
                return "000010";
            case "jal":
                return "000011";
        }
        return null;
    }

    public String Jump_Label_Value_26(String Value_BINARY_16_Bit) {
        return "0000000000" + Value_BINARY_16_Bit;
    }

    public String Jump_Label_Value_28(String Jump_Label_Value_26) {
        return Jump_Label_Value_26 + "00";
    }

    public String Jump_Label_First_4_BINARY_NUMBERS(String Address_32) {
        char[] a = Address_32.toCharArray();
        char[] b = new char[4];
        b = a;

        String s = new String(b);
        return s;
    }

    public int ADDRESS(int x) {
        int z=address + (x * 4);
        return z;
    }

    public String B() {
        return "To Be Detrmined";
    }

}
