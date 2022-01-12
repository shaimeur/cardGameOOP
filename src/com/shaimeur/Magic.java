package com.shaimeur;

public class Magic extends Cards {
    private String description;

    public Magic(String cardName, int cost, String description,Cards type) {
        super(cardName, cost,type);
        this.setDescription(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(String description) {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
