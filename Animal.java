public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(){

    }
    public Animal(String family,String name,int age,boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;

    }
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }
}
