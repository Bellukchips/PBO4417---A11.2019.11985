/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harpindocar.data;

import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class ListCar {

    private ArrayList<Car> cars = new ArrayList<Car>();

    public ListCar() {
        Car car1 = new Car(1,200000000,"Honda Jazz","White,Red,Black");
        addData(car1);
        Car car2 = new Car(2,1000000000,"Pajero","Black,White");
        addData(car2);
        Car car3 = new Car(3,187000000,"Avanza","White,Black");
        addData(car3);
        Car car4 = new Car(4,321000000,"Kijang Inova","Black,White,Brown");
        addData(car4);
    }

    private void addData(Car car) {
        cars.add(car);
    }

    public void fetchData() {
        System.out.println("------LIST MOBIL YANG TERSEDIA-------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("");
            System.out.println("Merk  : " + cars.get(i).getMerk());
            System.out.println("Color : " + cars.get(i).getColor());
            System.out.println("Price : " + cars.get(i).getPrice());
            System.out.println("------------------------------------");

        }
    }
}
