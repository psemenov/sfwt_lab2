import functions.trigonometric.*;

public class main {
    public static void main(String[] args) {
        Sin mySin = new Sin();
        Cos myCos = new Cos();
        Tan myTan = new Tan();
        Sec mySec = new Sec();
        Csc myCsc = new Csc();
        System.out.println("Sin: " + mySin.calcValue(0.5) + " : " + Math.sin(0.5));
        System.out.println("Cos: " + myCos.calcValue(0.5) + " : " + Math.cos(0.5));
        System.out.println("Tan: " + myTan.calcValue(0.5) + " : " + Math.tan(0.5));
        System.out.println("Sec: " + mySec.calcValue(0.5) + " : " + 1/Math.cos(0.5));
        System.out.println("Csc: " + myCsc.calcValue(0.5) + " : " + 1/Math.sin(0.5));

    }
}
