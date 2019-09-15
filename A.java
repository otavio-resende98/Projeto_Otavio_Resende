import static java.lang.System.out;

public class A {
    
    private int A1;
    private float A2;

    public A() {
        System.out.println("Construtor de A");
        A1 = 0;
        A2 = 0;
    }

    public int getA1() {
        System.out.println("Método getA1");
        return A1;
    }

    public float getA2() {
        System.out.println("Método getA2");
        return A2;
    }

    public void setA1(int A1) {
        System.out.println("Método setA1");
        this.A1 = A1;
    }

    public void setA2(float A2) {
        System.out.println("Método setA2");
        this.A2 = A2;
    }

    public void MA1() {
        System.out.println("Método MA1");
    }

    public void MA2() {
        System.out.println("Método MA2");
    }

    public void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }
}