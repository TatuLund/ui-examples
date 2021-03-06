package com.vaadin.invoice.editor;

import java.util.Random;

public enum Currency {
    EURO("EUR"), USD("USD"), GBP("GBP");

    private String stringRepresentation;

    private Currency(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public static Currency getRandomCurrency() {
        Random random = new Random();
        return Currency.values()[random.nextInt(values().length)];
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }

    @Override
    public String toString() {
        return getStringRepresentation();
    }
}
