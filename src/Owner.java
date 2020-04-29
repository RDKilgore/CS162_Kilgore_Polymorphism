import java.util.ArrayList;

public class Owner {
    private ArrayList<Employee> companyX = new ArrayList<Employee>();
    private String name;
    private Boolean availableForMeeting;
    private String motto;
    private double raise;


    public Owner() {
        name = "Rian";
        availableForMeeting = false;
        motto = "\"Do what you can\" - Me";
        System.out.println(toString());
    }

    public void giveRaise(Class<?> className , double percentRaise) {
        for (Employee emp : companyX) {
            if (emp.getClass() == className) {
                this.raise = emp.getBaseSalary() * percentRaise;
                emp.setBaseSalary(raise);
            }
        }
    }

    public void addTechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, String staffedPosition) {
        companyX.add(new TechnicalWriter(name, baseSalary, yearsOfExperience, yearsAtCompany, staffedPosition));
    }

    public void addEngineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, String staffedPosition) {
        companyX.add(new Engineer(name, baseSalary, yearsOfExperience, yearsAtCompany, staffedPosition));
    }

    public void addProductManger(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, String staffedPosition) {
        companyX.add(new ProductManager(name, baseSalary, yearsOfExperience, yearsAtCompany, staffedPosition));
    }

        public boolean matches ( int i, String staffedPosition){
            return this.companyX.get(i).getStaffedPosition().equals(staffedPosition);
        }

        public String toString () {
            return "Owner of CompanyX is : " + name + "\nAvailable? " + availableForMeeting + "\nMotto for the day : " + motto;
        }

        public void viewAllEmployees () {
            for (int i = 0; i < companyX.size(); i++) {
                System.out.println(companyX.get(i).toString());
            }
        }
}
