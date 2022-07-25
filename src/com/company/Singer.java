package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    void singing() {
        System.out.println("He can singing in Rap ");
    }
    void playGitar(){
        System.out.println("Can play gitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
