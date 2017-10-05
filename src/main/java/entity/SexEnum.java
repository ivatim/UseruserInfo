package entity;

public enum SexEnum {

    UNSPECIFIED("Не указан"),
    MALE("Мужской"),
    FEMALE("Женский");

    private String sexName;

    SexEnum(String sexName) {
        this.sexName = sexName;
    }

    public String getSexName() {
        return sexName;
    }
}
