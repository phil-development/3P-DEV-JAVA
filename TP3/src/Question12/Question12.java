package Question12;

public class Question12 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.raio = 3.0;

        Esfera esfera = new Esfera();
        esfera.raio = 5.0;

        double areaCirculo = circulo.calcularArea();
        double volumeEsfera = esfera.calcularVolume();

        System.out.println("Área do círculo: " + areaCirculo);
        System.out.println("Volume da esfera: " + volumeEsfera);
    }
}
