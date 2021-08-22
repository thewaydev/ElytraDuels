package net.elytrapvp.elytraduels.game.kit;

import org.bukkit.entity.Player;

/**
 * Stores all information about a kit.
 */
public abstract class Kit {
    private final String name;

    // Information about abilities.
    private int doubleJumps;
    private int repulsors;
    private int tripleShots;

    // integer settings.
    private int voidLevel;
    private double rodMultiplier;

    // boolean settings.
    private boolean hasRanked;
    private boolean hunger;
    private boolean naturalRegen;
    private boolean rangedDamage;
    private boolean waterKills;

    /**
     * Creates a new kit.
     * @param name Name of the kit.
     */
    public Kit(String name) {
        this.name = name;

        doubleJumps = 0;
        repulsors = 0;
        tripleShots = 0;

        voidLevel = 16;
        rodMultiplier = 1.0;

        hasRanked = false;
        hunger = false;
        naturalRegen = true;
        rangedDamage = false;
        waterKills = false;
    }

    /**
     * Apply the kit to a player.
     * @param player Player to apply to.
     */
    public abstract void apply(Player player);

    /**
     * Get the total number of double jumps
     * that can be used in this kit.
     * @return Amount of double jumps.
     */
    public int getDoubleJumps() {
        return doubleJumps;
    }

    /**
     * Get the name of the kit.
     * @return Name of the kit.
     */
    public String getName() {
        return name;
    }

    /**
     * Get if the kit should have natural regen.
     * @return Whether or not the kit has natural regen.
     */
    public boolean naturalRegen() {
        return naturalRegen;
    }

    /**
     * Get the total number of repulsors
     * that can be used in this kit.
     * @return Amount of repulsors.
     */
    public int getRepulsors() {
        return repulsors;
    }

    /**
     * Get the kit's rod multiplier.
     * @return Rod multiplier.
     */
    public double getRodMultiplier() {
        return rodMultiplier;
    }

    /**
     * Get the total number of triple shots
     * that can be used in this kit.
     * @return Amount of triple shots.
     */
    public int getTripleShots() {
        return tripleShots;
    }

    /**
     * Get the Y coordinate value that should kill a player.
     * @return Void level.
     */
    public int getVoidLevel() {
        return voidLevel;
    }

    /**
     * Get whether the kit has any abilities.
     * @return Whether or not the kit has abilities.
     */
    public boolean hasAbilities() {
        return doubleJumps > 0 || repulsors > 0 || tripleShots > 0;
    }

    /**
     * Get if the kit should have hunger.
     * @return Whether or not the kit has hunger.
     */
    public boolean hasHunger() {
        return hunger;
    }

    /**
     * Get if the kit will be available ranked.
     * @return Whether or not the kit will have ranked.
     */
    public boolean hasRanked() {
        return hasRanked;
    }

    /**
     * Get if the kit will have ranged ranged.
     * @return Whether or not the kit as ranged damage.
     */
    public boolean hasRangedDamage() {
        return rangedDamage;
    }

    /**
     * Get if the kit should kill the player
     *  when they touch water.
     * @return Wether or not water kills the player.
     */
    public boolean waterKills() {
        return waterKills;
    }

    /**
     * Set the amount of double jumps the kit has.
     * @param doubleJumps Amount of double jumps.
     */
    public void setDoubleJumps(int doubleJumps) {
        this.doubleJumps = doubleJumps;
    }

    /**
     * Sets if the kit will be available in ranked play.
     * @param hasRanked Whether or not a ranked variant exists.
     */
    public void setHasRanked(boolean hasRanked) {
        this.hasRanked = hasRanked;
    }

    /**
     * Set it the kit should have hunger.
     * @param hunger Whether or not the kit has hunger.
     */
    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    /**
     * Set if the kit should have natural regen.
     * @param naturalRegen Whether or not the kit has natural regen.
     */
    public void setNaturalRegen(boolean naturalRegen) {
        this.naturalRegen = naturalRegen;
    }

    /**
     * Set if the kit should have ranged damage.
     * @param rangedDamage Whether or not the kit has ranged damage.
     */
    public void setRangedDamage(boolean rangedDamage) {
        this.rangedDamage = rangedDamage;
    }

    /**
     * Set the amount of repulsors the kit has.
     * @param repulsors Amount of repulsors.
     */
    public void setRepulsors(int repulsors) {
        this.repulsors = repulsors;
    }

    /**
     * Get the rod multiplier of the kit.
     * @param rodMultiplier New rod multiplier.
     */
    public void setRodMultiplier(double rodMultiplier) {
        this.rodMultiplier = rodMultiplier;
    }

    /**
     * Set the amount of triple shots the kits should have.
     * @param tripleShots Amount of triple shots.
     */
    public void setTripleShots(int tripleShots) {
        this.tripleShots = tripleShots;
    }

    /**
     * Set the void level of the kit.
     * @param voidLevel void level.
     */
    public void setVoidLevel(int voidLevel) {
        this.voidLevel = voidLevel;
    }

    /**
     * Set if water should kill players.
     * @param waterKills Whether or not water kills players.
     */
    public void setWaterKills(boolean waterKills) {
        this.waterKills = waterKills;
    }
}