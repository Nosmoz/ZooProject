package TypeAnimals.TerrestrialsAnimals.WolfProject;

public class WolfHowls {
    protected Wolf wolf;
    protected WolfPack wolfPack;
    protected WolfCoupleAlpha wolfCoupleAlpha;

    public void wolfHowls()
    {
        if (wolf == wolfCoupleAlpha.getMaleAlpha())
        {
            System.out.println("I'm the alpha male for the hounds : " + wolf.getHounds());
        }
        else if (wolf == wolfCoupleAlpha.getFemaleAlpha())
        {
            System.out.println("I'm the alpha female for the hounds : " + wolf.getHounds());
        }
        else
        {
            System.out.println("I'm on the hounds : " + wolf.getHounds());
        }
        for (Wolf wolfmember : wolfPack.getHoundwolf())
        {
            System.out.println("I respond because we are on the same hounds: " + wolfmember.getHounds());
        }
    }

    public void wolfHowlsPutDomination()
    {
        wolf.getFactorDomination();
    }

    public void wolfHowlsAttacked(Wolf wolf1, Wolf wolf2)
    {
        if(!wolf1.isFailFightVsAlphaMale() || wolf1.getRank() == RankWolf.omega)
        {
            System.out.println(wolf2 + "agressive with " + wolf1);
        }
    }

    public void wolfHowlsAggressor(Wolf wolf1, Wolf wolf2)
    {
        System.out.println(wolf2 + "is submissive by " + wolf1);
    }

}
