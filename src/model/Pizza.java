package model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String cheese;
    private final List<String> toppings;
    private final SizeType size;
    private final CrustType crust;

    private Pizza(String cheese, List<String> toppings, SizeType size, CrustType crust) {
        this.cheese = cheese;
        this.toppings = toppings;
        this.size = size;
        this.crust = crust;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public SizeType getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }

    @Override
    public String toString() {
        return "Detalhes da Pizza:\n" +
                "Queijo: " + cheese + "\n" +
                "Coberturas: " + String.join(", ", toppings) + "\n" +
                "Tamanho: " + size + "\n" +
                "Tipo de Massa: " + crust + "\n";
    }


}
