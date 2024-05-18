package com.example.templete.Boisson;

public class Cafe extends BoissonCafeinee{
    @Override
    void preparer() {
        System.out.println("Prepare Caffe ");
    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajouter Lait et sucre");
    }
}
