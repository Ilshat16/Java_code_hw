package HW4.models;

public enum Holidays {
    TYPICAL_DAY("сегодня обычный день"),
    WOMANS_DAY("С праздником 8 марта"),
    MANS_DAY("С праздником 23 февраля"),
    NEW_YEAR("С новым годом");

    private final String congratulation;

    Holidays(String congratulation) {
        this.congratulation = congratulation;
    }

    public String getCongratulation() {
        return congratulation;
    }
}
