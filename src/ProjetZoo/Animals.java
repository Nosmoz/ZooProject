package ProjetZoo;

public class Animals {
    private String name;
    private String sexe;
    private double weight;
    private double age;
    private double hungry;
    private boolean is_Sleep;
    private String life;
    private String test;

    public void eat()
    {
        if (hungry > 0.5)
        {
            System.out.println("he's not hungry");
        }
        else if (hungry <= 0.5 && is_Sleep == false)
        {
            System.out.println("He can eat");
            hungry = hungry + 0.5 ;
        }
        else
        {
            System.out.println("He can't eat because he sleep");
        }
    }


    public void output_sound()
    {

    }

    public void cure()
    {

    }

    public void stase()
    {
        if (is_Sleep == false)
        {
            is_Sleep = true;
            System.out.println("He start sleeping");
        }
        else
        {
            is_Sleep = false;
            System.out.print("He stop sleeping");
        }
    }

    public void move()
    {
        // If dépendant du statut de l'animal
    }

    public void birth()
    {

    }

}
