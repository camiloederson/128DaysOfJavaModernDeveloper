package JavaCoreFoundations.day12;

public enum EnumExample {
    ACTIVE("user currently working on"),
    NON_ACTIVE ("User currently not working on"),
    NON_REGISTERED("User never registered");

    private String description;

    EnumExample(String description ){
        this.description = description;
    }

    public boolean isActive(){
        return this == ACTIVE;
    }

    public boolean isUnRegistered(){
        return this == NON_REGISTERED;
    }

    public String getDescription() {
        return description;
    }
}
