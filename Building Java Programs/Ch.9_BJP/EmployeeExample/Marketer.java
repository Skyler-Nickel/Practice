// Exercise 1:
// Write a class Marketer to accompany the other law firm classes described in this chapter
// Marketers make $50,000($10,000 more than general employees) and have an additional
// method called advertise that prints "Act now, while supplies last!"

public class Marketer extends Employee {
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
    
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}
