import java.util.ArrayList;

//  Main Class - Entry Point
public class Main
{

    public static ArrayList<AbstractAnimal> filteredList = new ArrayList<>();

    public static void filterVehicles(ArrayList<AbstractAnimal> animals, CheckAnimal tester, boolean printit)
    {
        filteredList.clear();

        for (AbstractAnimal a : animals)
        {
            if (tester.test(a))
            {
                if (printit)
                {
                    System.out.println(a.getName() + " " + a.getFuelLevel());
                }
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] args)
    {

        Mammal Panda = new Mammal("Panda", 1, 1869);
        Mammal Zebra = new Mammal("Zebra", 1, 1778);
        Mammal Koala = new Mammal("Koala", 1, 1816);
        Mammal Sloth = new Mammal("Sloth", 1, 1804);
        Mammal Armadillo = new Mammal("Armadillo", 1, 1758);
        Mammal Raccoon = new Mammal("Raccoon", 1, 1758);
        Mammal Bigfoot = new Mammal("Bigfoot", 1, 2021);

        Birds Pigeon = new Birds("Pigeon", 1, 1837);
        Birds Peacock = new Birds("Peacock", 1, 1821);
        Birds Toucan = new Birds("Toucan", 1, 1758);
        Birds Parrot = new Birds("Parrot", 1, 1824);
        Birds Swan = new Birds("Swan", 1, 1758);

        Fish Salmon = new Fish("Salmon", 1, 1758);
        Fish Catfish = new Fish("Catfish", 1, 1817);
        Fish Perch = new Fish("Perch", 1, 1758);


        ArrayList<AbstractAnimal> animalList = new ArrayList<>();
        animalList.add(Panda);
        animalList.add(Zebra);
        animalList.add(Koala);
        animalList.add(Sloth);
        animalList.add(Armadillo);
        animalList.add(Raccoon);
        animalList.add(Bigfoot);

        animalList.add(Pigeon);
        animalList.add(Peacock);
        animalList.add(Toucan);
        animalList.add(Parrot);
        animalList.add(Swan);

        animalList.add(Salmon);
        animalList.add(Catfish);
        animalList.add(Perch);


        System.out.println("\n*** Animals Sorted by Name ***");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalList.forEach((v) -> System.out.println(v.getName()));

        System.out.println("\n*** Horse with postive Fuel Sorted by Name ***");
        filterVehicles(animalList, v -> (v.getFuelLevel() > 0) && (v instanceof Animal), false);
        filteredList.sort((v1, v2) -> v1.getYear() > v2.getYear() ? -1 : (v1.getYear() < v2.getYear()) ? 1 : 0);
        filteredList.forEach((v) -> System.out.println(v.getYear()));
    }
}