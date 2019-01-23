package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BicmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private List<String> possibleBuns = Arrays.asList("with sesame seeds", "without sesame seeds");
        private List<String> possibleSauces = Arrays.asList("standard", "1000 island", "barbecue");
        private List<String> possibleIngredients = Arrays.asList("salad", "onion", "bacon", "cucumber", "chilli peppers"
                , "mushrooms", "shrimps", "cheese");

        public BicmacBuilder bun(String bun) {
            if (possibleBuns.contains(bun)){
                this.bun = bun;
            }
            return this;
        }

        public BicmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BicmacBuilder sauce(String sauce) {
            if (possibleSauces.contains(sauce)) {
                this.sauce = sauce;
            }
            return this;
        }

        public BicmacBuilder ingredients(String ingredient) {
            if (possibleIngredients.contains(ingredient)) {
                this.ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
