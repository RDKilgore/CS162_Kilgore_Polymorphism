public class Main {
    public static void main(String[] args) {
        TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        System.out.println(technicalWriter.toString());
        System.out.println();
        Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        System.out.println(engineer.toString());
        System.out.println();
        ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);
        System.out.println(productManager.toString());
        System.out.println();
    }
}
