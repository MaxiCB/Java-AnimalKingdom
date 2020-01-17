public class Fish extends AbstractAnimal implements Animal
{

    private String name;

    public Fish(String name, int fuel, int year)
    {
        super(fuel, year);
        this.fuel *= 2;
        this.name = name;
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
        return "Swim";
    }

    @Override
    public String getBreath() {
        return "Gills";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
    }

    @Override
    public int getYear() {
        return year;
    }
}
