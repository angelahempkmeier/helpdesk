package models.enums;

import java.util.Arrays;

public enum ProfileEnum {
    ROLE_ADMIN("role-admin"),
    ROLE_CUSTOMER("role-customer"),
    ROLE_TECHNICIAN("role-technician");

    private final String description;

    ProfileEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ProfileEnum toEnum(final String description) {
        return Arrays.stream(ProfileEnum.values())
                .filter(profileEnum -> profileEnum.getDescription().equals(description))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid description: " + description));
    }
}
