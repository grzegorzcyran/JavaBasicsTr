package edu.sda.java.advanced.enums;

public enum Gender {
    FEMALE("f", "kobieta"),
    MALE("m", "mężczyzna");

    private String abbreviate;
    private String plTranslation;

    Gender(String abbreviate, String plTranslation) {
        this.abbreviate = abbreviate;
        this.plTranslation = plTranslation;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public String getPlTranslation() {
        return plTranslation;
    }

    public static Gender findByAbbrev(String abbrev) {
        for (Gender value : Gender.values()) {
            if(value.abbreviate.equalsIgnoreCase(abbrev)) {
                return value;
            }
        }
        return null; //if no abbreviation fits
    }
}
