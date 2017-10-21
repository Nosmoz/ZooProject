package TypeAnimals.TerrestrialsAnimals.WolfProject;

import TypeAnimals.Others.SexualType;


public class WolfCoupleAlpha {
    private Wolf maleAlpha;
    private Wolf femaleAlpha;
    private int compteurChildren;

    public WolfCoupleAlpha(Wolf usWolf1, Wolf usWolf2)
    {
        if (usWolf1.getSexe() != usWolf2.getSexe() && usWolf1.getSexe() == SexualType.Male
                && usWolf1.getRank() == RankWolf.alpha && usWolf2.getRank() == RankWolf.alpha)
        {
            this.maleAlpha = usWolf1;
            this.femaleAlpha = usWolf2;
            this.compteurChildren = 0;
        }
        else
        {
            System.out.println("They can't create the alpha couple");
        }
    }

    public Wolf getMaleAlpha() {
        return maleAlpha;
    }

    public void setMaleAlpha(Wolf maleBecomeAlpha)
    {
            maleBecomeAlpha.setRank(RankWolf.alpha);
            this.maleAlpha = maleBecomeAlpha;
    }

    public Wolf getFemaleAlpha() {
        return femaleAlpha;
    }

    public void setFemaleAlpha(Wolf femaleBecomeAlpha)
    {
        femaleBecomeAlpha.setRank(RankWolf.alpha);
        this.femaleAlpha = femaleBecomeAlpha;
    }

    public int getCompteurChildren() {
        return compteurChildren;
    }

    public void setCompteurChildren(int compteurChildren) {
        this.compteurChildren = compteurChildren;
    }
}
