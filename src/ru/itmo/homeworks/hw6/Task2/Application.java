package ru.itmo.homeworks.hw6.Task2;

public class Application {
    // Создать не менее 4 экземпляров класса Product
    public static void main(String[] args) {


        Product product01 = new Product();

        String productName = "burger";
        Product product02 = new Product(productName);

        int fat = 30;
        int carbohydrate = 15;
        int protein = 12;
        Product product03 = new Product(fat, protein, carbohydrate);

        int calorie = 388;
        Product product04 = new Product(calorie);

        MyApprovedProducts test = new MyApprovedProducts();
        test.addProductToList(product02);
        test.getAllProductsNames(test.getProductsList());
    }
}
