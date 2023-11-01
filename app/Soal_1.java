package app;

import data.Balok;
import data.Bola;
import data.Circle;
import data.Kerucut;
import data.Rectangle;
import data.Tabung;

public class Soal_1 {
    public static void main(String[] args) {
        // Lingkaran
        Circle lingkaran = new Circle(20);
        System.out.println(lingkaran);
        System.out.println("Area lingkaran = " + lingkaran.getArea());
        System.out.println("Perimeter lingkaran = " + lingkaran.getPerimeter() + "\n");

        // Rectangle
        Rectangle kotak = new Rectangle(10, 5);
        System.out.println(kotak);
        System.out.println("Area kotak = " + kotak.getArea());
        System.out.println("Perimeter kotak = " + kotak.getPerimeter() + "\n");

        // Tabung
        Tabung tabung = new Tabung(20, 10);
        System.out.println(tabung);
        System.out.println("Area tabung = " + tabung.getArea());
        System.out.println("Perimeter tabung = " + tabung.getPerimeter() + "\n");

        // Kerucut
        Kerucut kerucut = new Kerucut(10, 20);
        System.out.println(kerucut);
        System.out.println("Area kerucut = " + kerucut.getArea());
        System.out.println("Perimeter kerucut = " + kerucut.getPerimeter() + "\n");

        // Bola
        Bola bola = new Bola(10);
        System.out.println(bola);
        System.out.println("Area bola = " + bola.getArea());
        System.out.println("Perimeter bola = " + bola.getPerimeter() + "\n");

        // Balok
        Balok balok = new Balok(10, 5, 20);
        System.out.println(balok);           
        System.out.println("Area balok = " + balok.getArea());
        System.out.println("Perimeter balok = " + balok.getPerimeter() + "\n");
        
    }
}
