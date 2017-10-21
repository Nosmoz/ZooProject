package TypeAnimals.TerrestrialsAnimals.WolfProject;

import TypeAnimals.Others.SexualType;
import java.util.ArrayList;

/**
 * This class modelize the class WolfPack
 * @author Romain Goffi
 */
public class WolfPack
{
    protected WolfHowls wolfHowls;
    protected WolfCoupleAlpha leadersWolf;
    protected ArrayList<Wolf> houndwolf;
    protected RankWolf temporaryValue;

    /**
     * Constructor for the class WolfPack
     * @param leadersWolf
     */
    public WolfPack(WolfCoupleAlpha leadersWolf)
    {
        this.leadersWolf = leadersWolf;
        this.houndwolf = new ArrayList<Wolf>();
    }

    /**
     * Method to add a wolf on a hound
     * @param wolf
     */
    public void addWolf(Wolf wolf)
    {
        if (wolf.getRank() != RankWolf.alpha && wolf.isFailFightVsAlphaMale() && wolf.getHounds() == null)
        {
            wolf.setHounds(this);
            houndwolf.add(wolf);
        }
    }

    /**
     * Method to remove a wolf on a hound
     * @param wolf
     */
    public void removeWolf(Wolf wolf)
    {
        if (!wolf.isFailFightVsAlphaMale() && wolf.getHounds() != null)
        {
            wolf.setRank(RankWolf.omega);
            wolf.setHounds(null);
            houndwolf.remove(wolf);
        }
    }

    /**
     * Method to create the new alpha couple
     * @param wolf1
     * @param wolf2
     */
    public void createNewCouple(Wolf wolf1, Wolf wolf2)
    {
        if(wolf1.getSexe() != wolf2.getSexe() && wolf1.getSexe() == SexualType.Male)
        {
            leadersWolf = new WolfCoupleAlpha(wolf1, wolf2);
            leadersWolf.setCompteurChildren(0);
        }
    }


    /**
     * Method for fighting two wolfs
     * @param wolf1
     * @param wolf2
     */
    public void dominateWolf(Wolf wolf1, Wolf wolf2)
    {
        if ((wolf1.getSexe() == SexualType.Female && wolf1.getRank() != RankWolf.alpha)||
                (wolf2.getSexe() == SexualType.Female && wolf2.getRank() != RankWolf.alpha)||
                wolf1.getSexe() == SexualType.Male && wolf2.getSexe() == SexualType.Male)
        {
            if (wolf1.getRank().getValue() - wolf2.getRank().getValue() <= 5)
            {
                if(wolf1.getLevel() <= wolf2.getLevel() && wolf1.getImpetuous() >= 8 )
                {
                    if ((byte)Math.random()*3 >= 2)
                    {
                        if(wolf2.getRank() == RankWolf.alpha)
                        {
                            changeRanking(wolf1, wolf2);
                            createNewCouple(wolf1, leadersWolf.getFemaleAlpha());
                        }
                        else
                        {
                            changeRanking(wolf1, wolf2);
                        }
                        wolfHowls.wolfHowlsAggressor(wolf1, wolf2);
                    }
                    else if (wolf2.getRank() == RankWolf.alpha)
                    {
                        wolf1.setFailFightVsAlphaMale(true);
                        wolfHowls.wolfHowlsAttacked(wolf1, wolf2);
                    }
                    wolf1.setImpetuous(wolf1.getImpetuous()/2);
                }
                else if (wolf1.getLevel() <= wolf2.getLevel() && wolf1.getImpetuous() < 4 )
                {
                    if ((byte)Math.random()*10 <= 1)
                    {
                        if(wolf2.getRank() == RankWolf.alpha)
                        {
                            changeRanking(wolf1, wolf2);
                            createNewCouple(wolf1, leadersWolf.getFemaleAlpha());
                        }
                        else
                        {
                            changeRanking(wolf1, wolf2);
                        }
                        wolfHowls.wolfHowlsAggressor(wolf1, wolf2);
                    }
                    else if (wolf2.getRank() == RankWolf.alpha)
                    {
                        wolf1.setFailFightVsAlphaMale(true);

                    }
                    if(wolf1.getImpetuous() >= 1)
                    {
                        wolf1.setImpetuous(wolf1.getImpetuous()-1);
                    }
                    wolfHowls.wolfHowlsAttacked(wolf1, wolf2);
                }
                else
                {
                    if ((byte)Math.random()*3 > 1)
                    {
                        if(wolf2.getRank() == RankWolf.alpha)
                        {
                            changeRanking(wolf1, wolf2);
                            createNewCouple(wolf1, leadersWolf.getFemaleAlpha());
                        }
                        else
                        {
                            changeRanking(wolf1, wolf2);
                        }
                        wolfHowls.wolfHowlsAggressor(wolf1, wolf2);
                    }

                }
            }
            else if(wolf1.getLevel() > wolf2.getLevel())
            {
                if (wolf2.getFactorDomination() < 0.2 && wolf2.getRank() != RankWolf.omega)
                {
                    demoteRanking(wolf2);
                }
            }
        }
    }

    /**
     * Method to change the rank after a fight
     * @param wolf1
     * @param wolf2
     */
    public void changeRanking(Wolf wolf1, Wolf wolf2)
    {
        temporaryValue = wolf2.getRank();
        wolf2.setRank(wolf1.getRank());
        wolf1.setRank(temporaryValue);
    }

    /**
     * Method to demote a wolf after a lot of loosing fight
     * @param wolf
     */
    public void demoteRanking(Wolf wolf)
    {
        wolf.setRank(wolf.getRank().values()[wolf.getRank().getValue()+1]);
    }

    /**
     * Methode to reproduce the alpha couple
     */
    public void wolfReproduction(String name)
    {
        if(leadersWolf.getCompteurChildren() < 7)
        {
            houndwolf.add(leadersWolf.reproduction(name));
        }
        else
        {
            System.out.println("They can't create a new wolf");
        }
    }

    /**
     * All of getters and setters for the class Animals
     */
    public WolfCoupleAlpha getLeadersWolf() { return leadersWolf; }

    public void setLeadersWolf(WolfCoupleAlpha leadersWolf) { this.leadersWolf = leadersWolf; }

    public ArrayList<Wolf> getHoundwolf() { return houndwolf; }

    public void setHoundwolf(ArrayList<Wolf> followersWolf) { this.houndwolf = followersWolf; }

    /**
     *
     * @return caracteristiques for WolfPack
     */
    @Override
    public String toString()
    {
        String houndsCoupleAlpha = "Leaders" + leadersWolf;
        for (Wolf wolf:houndwolf) { houndsCoupleAlpha += " " + wolf ; }
        return houndsCoupleAlpha;
    }
}
