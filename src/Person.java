//    import:
import java.util.ArrayList;

//    name and sort of class:
public class Person {
//    name and type of variables:
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<String> children;
    private ArrayList<String> siblings;
    private ArrayList<String> pets;


//    constructor(s):
    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    //    getters:

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

//    setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    method(s):
    static void addParents() {
        Person parent1 = new Person("Henk", "De Vries", 34, "male" );
        Person parent2 = new Person("Ingrid", "De Wit", 28, "female");
    }
    static void addChild() {

    }
    static void addPet() {

    }
    static void addSibling() {

    }
    static void getGrandChildren() {

    }
//    stay away from this } it closes the class
}