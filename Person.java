public class Person {
    String firstName, lastName;
    int age, SSN;

    public Person(String firstName, String lastName, int age, int SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.SSN = SSN;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSSN(int SSN){
        this.SSN = SSN;
    }
    public int getSSN(){
        return SSN;
    }

    public String toString(){
        return "Output: \nSSN: " + SSN + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age;
    }
}
