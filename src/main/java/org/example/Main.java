package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        var meat = new Meat(5, 100);
        var red = new Apple(10, 50, Colour.RED);
        var green = new Apple(8, 60, Colour.GREEN);
        var invalidApple = new Apple(8, 60, null);

                Food[] items = {meat, red, green, invalidApple};
                var cart = new ShoppingCart(items);


        System.out.println("Общая сумма товаров без скидки: " + cart.totalPrice());

        System.out.println("Общая сумма товаров со скидки: " + cart.discountPrice());

        System.out.println("Сумма всех вегетерианских продуктов без скидки: " + cart.vegPrice());
    }
}
