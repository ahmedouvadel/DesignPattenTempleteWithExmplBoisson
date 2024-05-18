package com.example.templete;

import com.example.templete.Boisson.BoissonCafeinee;
import com.example.templete.Boisson.Cafe;
import com.example.templete.Boisson.The;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoissonTest {

    public static void main(String[] args) {
        SpringApplication.run(BoissonTest.class, args);

        System.out.println("\n");
        // Question 1
        System.out.println("Question 1 ");
        System.out.println("Réponse : le modele de conception qui permet de modéliser ce probleme c'est la pattron Templete\n");
        // Réponse : le modele de conception qui permet de modéliser ce probleme c'est la pattron Templete

        System.out.println("To make the Caffe !! ");
        BoissonCafeinee caffe = new Cafe();
        caffe.suivreRecette();
        System.out.println(caffe);

        System.out.println("----------------------------------------------------------");

        System.out.println("To make the The !! ");
        BoissonCafeinee the = new The();
        the.suivreRecette();
        System.out.println(the);

    }




}
