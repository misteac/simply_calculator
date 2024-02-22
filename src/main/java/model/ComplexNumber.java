package model;

public class ComplexNumber implements ModelInterface {
    private final float a;
    private final float b;

    public ComplexNumber(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public ComplexNumber add(ComplexNumber otherNumber) {

        float newA = a + otherNumber.getA();
        float newB = b + otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }
    public ComplexNumber subtract(ComplexNumber otherNumber) {

        float newA = a - otherNumber.getA();
        float newB = b - otherNumber.getB();
        return new ComplexNumber(newA, newB);

    }
    public ComplexNumber multiply(ComplexNumber otherNumber) {

        float newA = a * otherNumber.getA();
        float newB = b * otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }
    public ComplexNumber divide(ComplexNumber otherNumber) {

        float newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA())
                + (otherNumber.getB() * otherNumber.getB()));
        float newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA())
                + (otherNumber.getB() * otherNumber.getB()));
        return new ComplexNumber(newA, newB);
    }

    public String toString() {
        return "(" + a + ") + (" + b + ")i";
    }
}
