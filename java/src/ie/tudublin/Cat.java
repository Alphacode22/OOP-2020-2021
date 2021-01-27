package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;
    public Cat(String name)
    {
        super(name);
        setNumLives(9);
    }

    public int getNumLives()
    {
        return numLives;
    }

    public void setNumLives(int numLives)
    {
        this.numLives = numLives;
    }

    public void kill()
    {
        if(numLives >0)
        {
            numLives --;
            System.out.println("Ouch");
        }
        else
        {
            System.out.println("Dead");
        }
    }
}