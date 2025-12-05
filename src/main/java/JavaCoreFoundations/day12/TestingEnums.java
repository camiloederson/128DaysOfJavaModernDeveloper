package JavaCoreFoundations.day12;

public class TestingEnums {
    public static void main(String[] args) {
        for (BasicEnum value : BasicEnum.values()){
            System.out.println("➕ " + value);
        }

        BasicEnum currentStatus = BasicEnum.ACTIVE;
        System.out.println("🆎 The current status is: " + currentStatus);

        EnumExample user = EnumExample.NON_REGISTERED;
        System.out.println("🥾 WELCOME TO THE SYSTEM");
        System.out.println("🔎 CURRENT STATUS");
        System.out.println(user.isUnRegistered() ? "❌ Not registered" : " ✅ Registered");
        System.out.println(user.canLogin() ? "📋 You can login the site" : "❌ I'm sorry you need to be registered to enter");
    }
}
