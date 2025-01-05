//    import:

//    name and sort of class:
public class Person {
//    name and type of variables:
    String name;
    String middleName;
    String lastName;
    String sex;
    int age;
    Person mother;
    Person father;
    String[] children;
    String[] siblings;
    String[] pets;


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