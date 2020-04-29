import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Owner boss = new Owner();
        boss.addTechnicalWriter("Mark", 50000, 4, 2, "Technical Writer");
        boss.addProductManger("April", 50000, 4, 2, "Product Manager");
        boss.addEngineer("Mae", 50000, 4, 2, "Engineer");
        boss.addProductManger("June", 50000, 4, 2, "Product Manager");
        boss.giveRaise(Engineer.class, 0.25);
        boss.giveRaise(TechnicalWriter.class, 0.25);
        boss.giveRaise(ProductManager.class, 0.25);
        boss.viewAllEmployees();
    }
}

