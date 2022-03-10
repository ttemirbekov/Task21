package com.company;

public class Main {

    public static void main(String[] args) {

        Weekdays weekdays = Weekdays.ISHEMBI;

        switch (weekdays){
            case DUISHOMBU -> System.out.println("Java okuim");
            case SHEYSHEMBI -> System.out.println("Anglis til okuim");
            case SHARSHENBI -> System.out.println("Persentatsiya kylam");
            case BEYSHEMBI-> System.out.println("Tez jazganga mashygam");
            case JUMA-> System.out.println("Kitep okuim");
            case ISHEMBI-> System.out.println("Marafongo dayardanam");
            case JEKSHEMBI -> System.out.println("Basseinge baram");
        }
    }
}
