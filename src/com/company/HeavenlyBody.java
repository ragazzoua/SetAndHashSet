package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelities;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelities = new HashSet<>();
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

    public boolean addMoon(HeavenlyBody moon) {
        return satelities.add(moon);
    }


    public boolean equals(HeavenlyBody obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }
}