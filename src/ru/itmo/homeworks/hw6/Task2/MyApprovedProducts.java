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
    private boolean isProductAdded;

    public boolean isProductAdded() {
        return isProductAdded;
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

    public String addProductToList(boolean isProductAdded, Product product) {
        if (isProductAdded == true) {
            throw new IllegalArgumentException("Такой продукт уже есть в списке");
        } else if ((product.getCalorie() > maxCaloriesCount) || (product.getCarbohydrate() > maxCarbohydrateCount) || (product.getFat() > maxFatsCount) || (product.getProtein() > maxProteinsCount))
        {
            throw new IllegalArgumentException("Превышены лимиты по характеристикам продукта");
        }
        else {
                for (int i = 0; i < productsList.length; i++) {
                    for (Product example : productsList) {
                        if (example == null) {
                            example.setProductName(product.getProductName());
                            break;
                        }
                    }
                }
            return ("Продукт добавлен");
        }
    }

    public void getAllProductsNames(Product[] productsList) {
        String[] productsNamesList = new String[productsList.length];
        int i = 0;
        for (Product product : productsList) {
            if (i > productsList.length) {break;}
            productsNamesList[i] = product.getProductName();
            i++;
            }
        System.out.println(Arrays.toString(productsNamesList));
        }
}

