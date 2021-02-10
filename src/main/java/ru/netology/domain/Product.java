package ru.netology.domain;


import java.util.Objects;

// выделяем класс и характеристики (в этой лекции !!без lombok!!)
public class Product {
    private int id;
    private String name;
    private int price;

    //добавляем конструктор на все поля


    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // добавляем конструктор, которые не принимает никаких параметров
    public Product() {}

    // делаем геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    // переопределение метода класса Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // если ссылки совпадают, то больше ничего не проверяем (один и тот же объект, true)
                                    // если ссылки не совпадают, то переходим на вторую строку (ниже)
        if (o == null || getClass() != o.getClass()) return false; // проверяем, что объекты относятся к одному классу
        Product product = (Product) o; // если классы совпадают, то переходим к механизму кастинга ( объект с типом продукт)
        return id == product.id && price == product.price && name.equals(product.name); // проверяем равенство всех полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    // переопределяем метод toString, в консоли был красивый вывод

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
