package com.springboot.template.restapi.model;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coffee {

    @Id
    private int id;
    private String name;
    private String ingredient;

    public Coffee() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Coffee id(int id) {
        setId(id);
        return this;
    }

    public Coffee name(String name) {
        setName(name);
        return this;
    }

    public Coffee ingredient(String ingredient) {
        setIngredient(ingredient);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coffee)) {
            return false;
        }
        Coffee coffee = (Coffee) o;
        return id == coffee.id && Objects.equals(name, coffee.name) && Objects.equals(ingredient, coffee.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ingredient);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", ingredient='" + getIngredient() + "'" +
            "}";
    }

    public Coffee(int id, String name, String ingredient) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
    }

}
