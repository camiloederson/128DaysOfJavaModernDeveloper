package Testing;

import java.util.WeakHashMap;

public class Password {

    public SecurityLevel provePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password must not be null");
        }
        if (password.length() < 8) return SecurityLevel.WEAK;
        if (password.matches("[a-zA-Z]+")) return SecurityLevel.WEAK;
        if (password.matches("[a-zA-Z0-9]+")) return SecurityLevel.MEDIUM;
        return SecurityLevel.STRONG;
    }
}
