package MODULE_2.SET_3;

public class calcu{
    private int a, b;
    private String op;

    public calcu() {
        a = 0;
        b = 0;
        op = " ";
    }

    public calcu(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.op = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        if (op.equals("+")) {
            this.op = "add";
        } else if (op.equals("-")) {
            this.op = "subtract";
        } else if (op.equals("*")) {
            this.op = "multiply";
        } else if (op.equals("/")) {
            this.op = "divide";
        } else {
            this.op = " ";        
        }
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }

}
