package ProjetZoo;

public class Animals {
    private String name;
    private int sexe;
    private double weight;
    private int age;
    private double hungry;
    private boolean is_Mammal;
    private boolean is_Sleep;
    private boolean is_Sick;

    public void eat()
    {
        if (hungry > 0.5 || is_Sleep == true)
        {
            System.out.println("he's not hungry");
        }
        else if (hungry <= 0.5 && is_Sleep == false)
        {
            System.out.println("He can eat");
            hungry = hungry + 0.5 ;
        }
    }


    public void output_sound()
    {

    }

    public void cure()
    {
        if (is_Sick == true)
        {
            is_Sick = false;
            System.out.print("He been cured");
        }
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
            System.out.println("He stop sleeping");
        }
    }

    public void move()
    {
        // If dépendant du statut de l'animal
    }

    public void birth()
    {
        if(is_Mammal == true && sexe == 2)
        {
            System.out.println(" Naissance de type normal");
        }
        else if (sexe == 2)
        {
            System.out.println("Naissance par oeufs");
        }
        else
        {
            System.out.println("Impossible car mâle");
        }

    }

}
