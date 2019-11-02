import functions.trigonometric.*;

public class main {
    public static void main(String[] args) {
        Sin mySin = new Sin();
        Cos myCos = new Cos();
        System.out.println("Sin: " + mySin.calcValue(0.5) + " : " + Math.sin(0.5));
        System.out.println("Cos: " + myCos.calcValue(0.5) + " : " + Math.cos(0.5));

    }
}
