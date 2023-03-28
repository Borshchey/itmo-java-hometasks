package ru.itmo.homeworks.hw6.Task2;

public class Product {
    // Свойства: название продукта / белки / жиры / углеводы / калории
    //Минимум 4 конструктора
    //Реализовать необходимые проверки входящих данных


    private String productName;
    private int protein;
    private int fat;
    private int carbohydrate;
    private int calorie;

    public Product(){
        System.out.println("Создан новый продукт");
    }

    public Product(String productName){
        getCalorie();
        getFat();
    }

    public Product(int fat, int carbohydrate, int protein){
        setFat(fat);
        setProtein(protein);
        setCarbohydrate(carbohydrate);
    }

    public Product(int calorie){
        setCalorie(calorie);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.length() < 3) {
            throw new IllegalArgumentException("Имя должно быть не менее 3 символов");
        }        this.productName = productName;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        if (protein <= 0) {
            throw new IllegalArgumentException("Значение протеинов не может быть отрицательным");
        }
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        if (fat <= 0) {
            throw new IllegalArgumentException("Значение жиров не может быть отрицательным");
        }
        this.fat = fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        if (carbohydrate <= 0) {
            throw new IllegalArgumentException("Значение углеводов не может быть отрицательным");
        }
        this.carbohydrate = carbohydrate;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        if (calorie <= 0) {
            throw new IllegalArgumentException("Значение калорий не может быть отрицательным");
        }
        this.calorie = calorie;
    }





}
