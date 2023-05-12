package Lesson8;

public enum Level {
    INFO("Info"),

    DEBUG("Debug"),

    WARN("Warn"),

    ERROR("Error");

    private String level;

    private Level (String level) {
        this.level = level;
    }


    public String getLevel() {
        return level;


    }
}
