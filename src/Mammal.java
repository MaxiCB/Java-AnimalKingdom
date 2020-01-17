public class Mammal extends AbstractAnimal implements Animal
{

    private String name;

    public Mammal(String name, int fuel, int year)
    {
        super(fuel, year);
        this.fuel *= 2;
        this.name = name;
        this.year = year;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void move() {
        fuel = fuel - 1;
    }

    @Override
    public void eat(int i) {
        fuel = fuel + i;
    }

    @Override
    public String getMove() {
        return "Walk";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Live Birth";
    }

    @Override
    public int getYear() {
        return year;
    }
}
