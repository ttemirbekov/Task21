package com.company;

public enum Weekdays {
    DUISHOMBU("Java okuim"),
    SHEYSHEMBI("Anglis til okuim"),
    SHARSHENBI("Persentatsiya kylam"),
    BEYSHEMBI("Tez jazganga mashygam"),
    JUMA("Kitep okuim"),
    ISHEMBI("Marafongo dayardanam"),
    JEKSHEMBI("Es aluu");

    private  String method;

    Weekdays(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Weekdays{" +
                "Kun tartip: " + method +
                "} " + super.toString();
    }
}