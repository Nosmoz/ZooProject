package TypeAnimals.TerrestrialsAnimals.WolfProject;

import TypeAnimals.Others.SexualType;
import java.util.ArrayList;

public class WolfPack
{
    private WolfCoupleAlpha leadersWolf;
    private ArrayList<Wolf> followersWolf;
    private RankWolf temporaryValue;

    public WolfPack(WolfCoupleAlpha leadersWolf)
    {
        this.leadersWolf = leadersWolf;
        this.followersWolf = new ArrayList<Wolf>();
    }


    public void addWolf(Wolf wolf)
    {
        if (wolf.getRank() != RankWolf.alpha && wolf.isFailFightVsAlphaMale() && wolf.getHounds() == null)
        {
            wolf.setHounds(this);
            followersWolf.add(wolf);
        }
    }

    public void removeWolf(Wolf wolf)
    {
        if (!wolf.isFailFightVsAlphaMale() && wolf.getHounds() != null)
        {
            wolf.setRank(RankWolf.omega);
            wolf.setHounds(null);
            followersWolf.remove(wolf);
        }
    }

    public void createNewCouple(Wolf wolf1, Wolf wolf2)
    {
        if(wolf1.getSexe() != wolf2.getSexe() && wolf1.getSexe() == SexualType.Male)
        {
            leadersWolf = new WolfCoupleAlpha(wolf1, wolf2);
        }
    }


    /**
     * Method to dominate wolf and become more stonger
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
                    }
                    else if (wolf2.getRank() == RankWolf.alpha)
                    {
                        wolf1.setFailFightVsAlphaMale(true);
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
                    }
                    else if (wolf2.getRank() == RankWolf.alpha)
                    {
                        wolf1.setFailFightVsAlphaMale(true);
                    }
                    if(wolf1.getImpetuous() >= 1)
                    {
                        wolf1.setImpetuous(wolf1.getImpetuous()-1);
                    }
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

    public void changeRanking(Wolf wolf1, Wolf wolf2)
    {
        temporaryValue = wolf2.getRank();
        wolf2.setRank(wolf1.getRank());
        wolf1.setRank(temporaryValue);
    }

    public void demoteRanking(Wolf wolf)
    {
        wolf.setRank(wolf.getRank().values()[wolf.getRank().getValue()+1]);
    }

    public void wolfReproduction() {}

    public WolfCoupleAlpha getLeadersWolf() { return leadersWolf; }

    public void setLeadersWolf(WolfCoupleAlpha leadersWolf) { this.leadersWolf = leadersWolf; }

    public ArrayList<Wolf> getFollowersWolf() { return followersWolf; }

    public void setFollowersWolf(ArrayList<Wolf> followersWolf) { this.followersWolf = followersWolf; }

    @Override
    public String toString()
    {
        String houndsCoupleAlpha = "Leaders" + leadersWolf;
        for (Wolf wolf:followersWolf) { houndsCoupleAlpha += " " + wolf ; }
        return houndsCoupleAlpha;
    }
}
