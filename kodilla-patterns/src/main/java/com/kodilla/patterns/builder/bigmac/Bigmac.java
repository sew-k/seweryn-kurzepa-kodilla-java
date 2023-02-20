package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private boolean sesameBun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    private final List<String> sauceMenu = new ArrayList<>(Arrays.asList("standard", "barbecue", "1000-islands"));
    private final List<String> ingredientsMenu = new ArrayList<>(Arrays.asList("salad", "onion", "becon", "cucumber", "chilli peppers", "mushrooms", "pawns", "cheese"));

    private Bigmac(boolean sesameBun, int burgers, String sauce, List<String> ingredients) {
        this.sesameBun = sesameBun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public boolean isSesameBun() {
        return sesameBun;
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

    public List<String> getSauceMenu() {
        return sauceMenu;
    }

    public List<String> getIngredientsMenu() {
        return ingredientsMenu;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "sesameBun=" + sesameBun +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                ", sauceMenu=" + sauceMenu +
                ", ingredientsMenu=" + ingredientsMenu +
                '}';
    }

    public static class BigmacBuilder {
        private boolean sesameBun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        private final List<String> sauceMenu = new ArrayList<>(Arrays.asList("standard", "barbecue", "1000-islands"));
        private final List<String> ingredientsMenu = new ArrayList<>(Arrays.asList("salad", "onions", "becon", "cucumbers", "chilli peppers", "mushrooms", "prawns", "cheese"));

        public BigmacBuilder sesameBun(boolean withSesame) {
            this.sesameBun = withSesame;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredients(String... ingredients) {
            for (String ingredient : ingredients) {
                this.ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            if (burgers > 4) {
                throw new IllegalStateException("too much burgers!");
            }
            if (!sauceMenu.contains(sauce)) {
                throw new IllegalStateException("don't have such sauce in menu!");
            }
            if (!ingredientsMenu.containsAll(ingredients)) {
                throw new IllegalStateException("don't have such ingredient in menu!");
            }
            return new Bigmac(sesameBun, burgers, sauce, ingredients);
        }
    }
}
