package com.example.templete.Boisson;

public class The extends BoissonCafeinee{
    @Override
    void preparer() {
        System.out.println("Prepare Thé ");
    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajouter un peut de menthe et de sucre");

    }
}
