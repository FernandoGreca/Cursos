package entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double soma(){
        return n1 + n2 + n3;
    }
    public double diferenca(){
        return 60 - soma();
    }
    public String toString() {
        return "MISSING "
            + String.format("%.2f", diferenca())
            + " POINTS";
    }
}
