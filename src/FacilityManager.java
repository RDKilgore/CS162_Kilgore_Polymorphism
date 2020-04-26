import java.util.ArrayList;

public class FacilityManager extends Employee {
    private ArrayList<Employee> companyX = new ArrayList<Employee>();
    private double raise;
    public FacilityManager() {
        super();
    }

    public FacilityManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
    }

    public void giveRaise() {
        super.getBaseSalary();
    }

    public void setTechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        companyX.add(new TechnicalWriter(name, baseSalary, yearsOfExperience, yearsAtCompany));
    }

    public void setEngineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        companyX.add(new Engineer(name, baseSalary, yearsOfExperience, yearsAtCompany));
    }

    public void setProductManger(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        companyX.add(new ProductManager(name, baseSalary, yearsOfExperience, yearsAtCompany));
    }

    public void printAllEmployees() {
        for (int i = 0; i < companyX.size(); i++) {
            System.out.println(companyX.get(i).toString());
        }
    }
}
