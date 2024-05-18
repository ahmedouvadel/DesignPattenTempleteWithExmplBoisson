package com.example.templete.Boisson;

public abstract class BoissonCafeinee {

    public final void suivreRecette(){
        preparer();
        faireBouillir();
        ajouterSupplements();
        verserDansTasse();


    }

    abstract void preparer();
    abstract void ajouterSupplements();

    private void faireBouillir() {
        System.out.println("Bouillir l'eau");
    }

    private void verserDansTasse() {
        System.out.println("Versé Dans le Tasse");
    }
}
