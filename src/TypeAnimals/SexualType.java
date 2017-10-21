package TypeAnimals;

/**
 * This enum modelize the enum for the sexe
 * @author Romain Goffi
 */
public enum SexualType {
    Male, Female;

    /**
     *
     * @return value for the sexe of animal (birth)
     */
    public static SexualType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
