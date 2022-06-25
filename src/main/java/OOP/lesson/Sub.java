package OOP.lesson;

public class Sub extends Action {

    public Sub(double a, double b) {
        Action.a = a;
        Action.b = b;
    }

    @Override
    public double getResult() {
        return a - b;
    }
}