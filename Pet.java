//    import:

//    name and sort of class:
public class Pet  {
//    name and type of variables:
    String name;
    int age;
    String species;
    Person owner;

//    constructor(s):

    public Pet(int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.species = species;
    }

//    getters:

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

//    setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

//    method(s):

//    stay away from this } it closes the class
}