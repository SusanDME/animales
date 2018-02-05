package com.company;

public class Main {

    public static void main(String[] args) {
	AnimalDomestico g;
	AnimalDomestico p;
	Veterinario vet;

	g = new Gato("Mimi","negro");
	vet = new Veterinario(g);
	vet.curar();
	/*g.saludar();*/
	p = new Perro("boby","cafe y blanco","San Bernardo");
	vet = new Veterinario(p);
	/*p.saludar();*/
    }
}
