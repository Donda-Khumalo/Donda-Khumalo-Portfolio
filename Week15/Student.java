public class Student {
    // Instance Variables
    private String firstName="";
    private int age=0;
    private String country="";

    // Static Variable
    private static int numStudents = 0;

    // Constructor(s)
    public Student(String firstName, int age, String country) {
        this.firstName = firstName;
        this.age = age;
        this.country = country;
        numStudents++;
    }
    public Student() {
        this.firstName = "";
        this.age = 0;
        this.country = "";
        numStudents++;
    }

    // Method(s) - Accessors
    public String getName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    // Method(s) - Mutators
    public void setName(String newName) {
        firstName = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setCountry(String newCountry) {
        country = newCountry;
    }

    // Method(s) - Static
    public static int getInstanceCount() {
        return numStudents;
    }

    // toString() method
    public String toString() {
        return "Name: " + firstName + "\nAge: " + age + "\nCountry: " + country;
    }
}
