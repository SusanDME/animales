package com.company;

public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal) {
        this.animal = animal;
    }

    public void curar() {
        if (this.animal instanceof Gato) {
            System.out.println("Se esta curardo al gato");
        } else {
            System.out.println("Se esta curando al perro");
        }
    }
}

