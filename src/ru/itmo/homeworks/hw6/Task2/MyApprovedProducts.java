package ru.itmo.homeworks.hw6.Task2;

import ru.itmo.homeworks.hw6.Task1.Climber;
import java.util.Arrays;

public class MyApprovedProducts {
    // Свойства:
    // максимальное количество белков
    // максимальное количество жиров
    // максимальное количество углеводов
    // максимальное количество калорий
    // список продуктов (массив)
    //Реализовать метод, который принимает на Продукт и добавляет его в список (массив),
    // если характеристики продукта полностью соответствуют заявленным разрешениям,
    // в противном случае сообщить, по какой причине продукт не может быть добавлен в список
    // (например, слишком большое содержание калорий)
    //Реализовать метод, который выводит названия всех продуктов из списка

    private int maxProteinsCount;
    private int maxFatsCount;
    private int maxCarbohydrateCount;
    private int maxCaloriesCount;
    private Product[] productsList;
    private int index; // счетчик продуктов
    private int len = 10; // длина массива

    private int i = 0; //счетчик имен

    public MyApprovedProducts(){
        productsList = new Product[10];
    }

    public void setMaxProteinsCount(int maxProteinsCount) {
        this.maxProteinsCount = maxProteinsCount;
    }

    public void setMaxFatsCount(int maxFatsCount) {
        this.maxFatsCount = maxFatsCount;
    }

    public void setMaxCarbohydrateCount(int maxCarbohydrateCount) {
        this.maxCarbohydrateCount = maxCarbohydrateCount;
    }

    public void setMaxCaloriesCount(int maxCaloriesCount) {
        this.maxCaloriesCount = maxCaloriesCount;
    }

    public Product[] getProductsList() {
        return productsList;
    }

    public int getMaxProteinsCount() {return maxProteinsCount;}
    public int getMaxFatsCount() {return maxFatsCount;}
    public int getMaxCarbohydrateCount() {return maxCarbohydrateCount;}
    public int getMaxCaloriesCount() {return maxCaloriesCount;}

    public void addProductToList(Product product) {
        if (product == null) {
            System.out.println("Не может быть пустой продукт");
            return;
        }
        if (product.getCalorie() > maxCaloriesCount) {
            System.out.println("Слишком много калорий");
            return;
        }
        if (product.getCarbohydrate() > maxCarbohydrateCount) {
            System.out.println("Слишком много углеводов");
            return;
        }
        if (product.getFat() > maxFatsCount) {
            System.out.println("Слишком много жиров");
            return;
        }
        if (product.getProtein() > maxProteinsCount) {
            System.out.println("Слишком много протеинов");
            return;}

        if (index < len) {
            productsList[index] = product;
            index++;
        } else {
            System.out.println("В массиве нет места");
        }
    }

    public void getAllProductsNames(Product[] productsList) {
        String[] productsNamesList = new String[productsList.length];
        for (Product product : productsList) {
            if (i > index) {
                System.out.println("список заполнен");
                return;
            }
            if (product == null) {
                System.out.println("Пустой продукт");
                return;
            }
            productsNamesList[i] = product.getProductName();
            i++;
            break;
            }
        System.out.println(Arrays.toString(productsNamesList));
        }
}

