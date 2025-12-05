package JavaCoreFoundations.day12;

public enum EnumExample {
    ACTIVE("User active"){
        @Override
        public boolean canLogin(){
            return true;
        }
    },
    NON_ACTIVE ("User not active"){
        @Override
        public boolean canLogin(){
            return true;
        }
    },
    NON_REGISTERED("User never registered"){
        @Override
        public boolean canLogin(){
            return false;
        }
    };

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

    public abstract boolean canLogin();
}
