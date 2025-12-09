package JavaCoreFoundations.day12;

public enum PolymorphicEnum {
    ACTIVE("Is active") {
        @Override
        public boolean isActive() {
            return true;
        }
    },

    INACTIVE("Is registered but inactive") {
        @Override
        public boolean isActive() {
            return false;
        }
    },

    NON_REGISTERED("It has never get registered") {
        @Override
        public boolean isActive() {
            return false;
        }
    };

    public abstract boolean isActive();

    PolymorphicEnum(String description) {
        this.description = description;
    }

    private final String description;

    public String getDescription() {
        return description;
    }
}
