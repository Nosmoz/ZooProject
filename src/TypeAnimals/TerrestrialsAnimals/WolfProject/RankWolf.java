package TypeAnimals.TerrestrialsAnimals.WolfProject;

/**
 * This enum modelize the enum for the rank
 * @author Romain Goffi
 */
public enum RankWolf {
    alpha(1), beta(2), gamma(3), delta(4), epsilon(5), zeta(6), eta(7), theta(8), iota(9), kappa(10), lambda(11), mu(12),
    nu(13), xi(14), omicron(15), pi(16), rho(17), sigma(18), tau(19), upsilon(20), phi(21), chi(22), psi(23), omega(24);

    private final int value;

    RankWolf(int value)
    {
        this.value = value;
    }
    public int getValue() { return value; }
}
