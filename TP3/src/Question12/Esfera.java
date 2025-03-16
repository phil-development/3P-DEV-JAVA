package Question12;

public class Esfera {
    double raio;
    static final double PI = Math.PI;

    public double calcularVolume() {
        return (4.0 / 3.0) * PI * raio * raio * raio;
    }
}