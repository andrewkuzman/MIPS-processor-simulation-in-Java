package architecture.pkg2;

public class Internal {

    public static void main(String[] args) {
        int x = 5;
        String str16 = Integer.toBinaryString(x);
        System.out.println(str16);
    }

}

class regFile {

    final private int zero = 0;
    private float at;
    private float v0;
    private float v1;
    private float a0;
    private float a1;
    private float a2;
    private float a3;
    private float t0;
    private float t1;
    private float t2;
    private float t3;
    private float t4;
    private float t5;
    private float t6;
    private float t7;
    private float s0;
    private float s1;
    private float s2;
    private float s3;
    private float s4;
    private float s5;
    private float s6;
    private float s7;
    private float t8;
    private float t9;
    private float sp;
    private float ra;
}

class ALU {

    public float add(float x, float y) {
        return x + y;
    }

    public float sub(float x, float y) {
        return x - y;
    }

    public float mul(float x, float y) {
        return x * y;
    }

    public float div(float x, float y) {
        return x / y;
    }

    public int and(int x, int y) {
        if (x == y) {
            return 1;
        } else {
            return 0;
        }
    }

    public int or(int x, int y) {
        if (x == 1 | y == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int slt(int x, int y) {
        if (x < y) {
            return 1;
        } else {
            return 0;
        }
    }
}

class mem {

    public float[] f = new float[1024];
}

class control {

    private int redDst;
    private int branch;
    private int memRead;
    private int memToReg;
    private int aluOp;
    private int memwrite;
    private int aluSrc;
    private int regWrite;

    private int aluControl(int x, int y) {
        if (x == 0) {
            return 2;
        } else if (x == 1) {
            return 6;
        } else {
            return 5;
        }
    }
}

class operation {

    public int sll(int x) {
        return x * 4;
    }

    public int signExt(int x) {
        String str16 = Integer.toBinaryString(x);
        char[] str32 = new char[32];
        char[] a = str16.toCharArray();
        if (a[0] == 0) {
            for (int i = 0; i < 16; i++) {
                str32[i] = 0;
            }
            for (int i = 16; i < 32; i++) {
                str32[i] = a[i - 16];
            }
        } else {
            for (int i = 0; i < 16; i++) {
                str32[i] = 1;
            }
            for (int i = 16; i < 32; i++) {
                str32[i] = a[i - 16];
            }
        }
        String ext = new String(str32);
        return Integer.parseInt(ext);
    }
}
