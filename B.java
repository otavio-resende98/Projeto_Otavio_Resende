import static java.lang.System.out;

public class B {
    
    private int B1;
    private float B2;

    public B() {
        System.out.println("Construtor de B");
        B1 = 0;
        B2 = 0;
    }

    public int getB1() {
        System.out.println("Método getB1");
        return B1;
    }

    public float getB2() {
        System.out.println("Método getB2");
        return B2;
    }

    public void setB1(int B1) {
        System.out.println("Método setB1");
        this.B1 = B1;
    }

    public void setB2(float B2) {
        System.out.println("Método setB2");
        this.B2 = B2;
    }

    public void MB1() {
        System.out.println("Método MB1");
    }

    public void MB2() {
        System.out.println("Método MB2");
    }

    public void MB3() {
        System.out.println("Método MB3");
    }
}