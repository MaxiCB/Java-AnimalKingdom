// Animal Abstraction Class
/*
- Eat
- Move
 */

public abstract class AbstractAnimal
{
    protected int fuel;
    protected int year;

    public AbstractAnimal(int fuel, int year)
    {
        this.fuel = fuel;
        this.year = year;
    }

    public AbstractAnimal()
    {
        fuel = 1;
    }

    public abstract String getName();
    public abstract int getYear();
    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();

    public void move()
    {
        fuel--;
    }

    public void move(int steps)
    {
        fuel = fuel - steps;
    }

    public int getFuelLevel()
    {
        return fuel;
    }

    public void addFuel(int i)
    {
        fuel = fuel + i;
    }

    public void eat(int i)
    {
        addFuel(i);
    }
}
