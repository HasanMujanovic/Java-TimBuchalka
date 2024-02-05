public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add (ComplexNumber add){
        this.real += add.getReal();
        this.imaginary += add.getImaginary();
    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;

    }
    public void subtract (ComplexNumber add){
        this.real -= add.getReal();
        this.real -= add.getImaginary();
}
}
