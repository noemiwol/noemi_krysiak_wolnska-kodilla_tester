package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public String getStampStamped() {
        return stampStamped;
    }

    private String stampName;
    private String stampSize;
    private String stampStamped;

    public Stamp(String stampName, String stampSize, String stampStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampStamped = stampStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", stampStamped='" + stampStamped + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals( stampName, stamp.stampName ) &&
                Objects.equals( stampSize, stamp.stampSize ) &&
                Objects.equals( stampStamped, stamp.stampStamped );
    }

    @Override
    public int hashCode() {
        return Objects.hash( stampName, stampSize, stampStamped );
    }
}
