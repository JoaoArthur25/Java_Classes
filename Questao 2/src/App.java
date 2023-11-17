public class App {
    public static void main(String[] args) throws Exception {
        

        FormaGeometrica forma1 = new Circulo(5);
        FormaGeometrica forma2 = new Retangulo(5, 10);

        System.out.println("Area do circulo: " + forma1.calcularArea());
        System.out.println("Area do retangulo: " + forma2.calcularArea());
        
    }
}
