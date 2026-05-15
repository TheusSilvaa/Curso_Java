package entities;

public class Company extends User{

    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anuallncome, int numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10){
            return getAnuallncome() * 0.14;
        }
        else {
            return getAnuallncome() * 0.16;
        }
    }
}
