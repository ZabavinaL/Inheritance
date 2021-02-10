package ru.netology.domain;

import ru.netology.domain.Product;

import java.util.Objects;

// класс книги (создаем дочерний класс)
public class Book extends Product {
    private String author; // автор
    private int pages; // количество страниц в книге
    private int publishedYear; // год издания

    // создали конструктор без параметров
    Book(){
        super();
    }

    // создаем конструктор для дочернего класса (Book)
    // для того, чтобы проинициализировать значения в полях, которые относятся к родительскому классу,
    // при создании дочернего класса,
    // мы сначала вызываем его конструктор - super(id, name, price);
    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    // создаем геттеры и сеттеры на поля (при создании не видим родительских)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    // переопределяем метод equals()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages && publishedYear == book.publishedYear && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, publishedYear);
    }
}
