package com.company;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelities;
    private final BodyTypes bodyType;

//    public static final int STAR = 1;
//    public static final int PLANET = 1;
//    public static final int DWARF_PLANET = 1;
//    public static final int MOON = 1;
//    public static final int COMET = 1;
//    public static final int ASTEROID = 1;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelities = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatelities() {
        return new HashSet<>(this.satelities);
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatelite(HeavenlyBody moon) {
        return satelities.add(moon);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())) {
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        //System.out.println("hashCode() called ");
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.bodyType + " , " + this.orbitalPeriod;
    }
}