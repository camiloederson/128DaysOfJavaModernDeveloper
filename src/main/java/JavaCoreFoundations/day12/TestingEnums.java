package JavaCoreFoundations.day12;

public class TestingEnums {
    public static void main(String[] args) {
        for (BasicEnum value : BasicEnum.values()){
            System.out.println("➕ " + value);
        }

        BasicEnum currentStatus = BasicEnum.ACTIVE;
        System.out.println("🆎 The current status is: " + currentStatus);

        EnumExample isRegistered = EnumExample.NON_REGISTERED;
        System.out.println("🔎 CURRENT STATUS");
        System.out.println(isRegistered.isUnRegistered() ? "❌ Non registered" : " ✅ Registered");
    }
}
