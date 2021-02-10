package ru.netology.domain;

// рассматриваем Assert Equals
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {


    // у нас есть 2 продукта, которые идентичны внутри. но это 2 разных объекта в памяти
    @Test
    public void shouldUseEquals() {
        Product first = new Product(1,"Java I",1000);
        Product second = new Product(1,"Java I",1000);
        assertEquals(first, second); // равны ли первый и второй объект
        // падение теста связано с тем, что ссылки не равны
        //org.opentest4j.AssertionFailedError:
        //Expected :ru.netology.domain.Product@1283bb96
        //Actual   :ru.netology.domain.Product@74f0ea28
    }
}
