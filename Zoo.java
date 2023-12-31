public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    private int animalCount=0;

    public Zoo(String name, String city, int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        this.animals=new Animal[nbrCages];

    }
   /* public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }
    */

   @Override
   public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            return false;
        }
    }


        /*public void displayAnimals(){
            for (int i = 0; i < animals.length; i++) {
                System.out.println(animals[i]);
            }
        }*/

        public int searchAnimal(Animal animal) {
            for (int j = 0; j < animals.length; j++) {
                if (animals[j]==animal) {
                    return j;
                }
            }
                return -1;
            }

    public boolean removeAnimal(Animal animal) {
        animalCount=animals.length;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i]==animal) {
                for (int j = i; j < animals.length - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount- 1] = null;
                animalCount=animalCount-1 ;
                return true;
            }
        }
        return false;
    }






}
