// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package HomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Laptops {
    // Поля
    private String brand;
    private String model;
    private String color;
    private Integer hdd;
    private Integer ram;
    private String os;
    private Integer price;

    // Конструктор
    public Laptops(String brand, String model, String color, Integer hdd, Integer ram, String os, Integer price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.price = price;

    }

    // Гет сет методы
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    // переопределяем метод чтобы на null выдавал true
    @Override
    public boolean equals(Object o) {
        if (o == null | this == o)
            return true;
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Laptops [brand=" + brand + ", model=" + model + ", color=" + color + ", hdd=" + hdd + ", ram=" + ram
                + ", os=" + os + ", price=" + price + "]\n";
    }

    // Метод фильтрации по всем категориям
    public static Set<Laptops> filter(Set<Laptops> laptops) {
        Scanner scan = new Scanner(System.in);

        // создаем map с выбраными характеристиками
        Map<String, Object> FilterChoice = new HashMap<>();
        System.out.println("Выберите характеристики: ");

        System.out.println("Бренд: ");
        String brand = scan.nextLine();
        FilterChoice.put("brand", brand);

        System.out.println("Модель: ");
        String model = scan.nextLine();
        FilterChoice.put("model", model);

        System.out.println("Цвет: ");
        String color = scan.nextLine();
        FilterChoice.put("color", color);

        System.out.println("OS: ");
        String os = scan.nextLine();
        FilterChoice.put("os", os);

        System.out.println("HDD: ");
        Integer hdd = scan.nextInt();
        FilterChoice.put("hdd", hdd);

        System.out.println("RAM: ");
        Integer ram = scan.nextInt();
        FilterChoice.put("ram", ram);

        System.out.println("Цена: ");
        Integer price = scan.nextInt();
        FilterChoice.put("price", price);

        Set<Laptops> resulSet = new HashSet<>();
        
        // фильтруем подходящие модели
        for (Laptops tempLaptop : laptops) {
            if(tempLaptop.getBrand().equals(FilterChoice.get("brand"))){
                if(tempLaptop.getModel().equals(FilterChoice.get("model"))){
                    if(tempLaptop.getColor().equals(FilterChoice.get("color"))){
                        if(tempLaptop.getOs().equals(FilterChoice.get("os"))){
                            if(tempLaptop.getHdd().equals(FilterChoice.get("hdd"))){
                                if(tempLaptop.getRam().equals(FilterChoice.get("ram"))){
                                    if(tempLaptop.getPrice().equals(FilterChoice.get("price"))){
                                        resulSet.add(tempLaptop);

                                    }
                                }

                            }

                        }

                    }
                }
            }
        }
        scan.close();
        return resulSet;
    }

    // метод фильтрации по выборочным характеристикам
    public static Set<Laptops> filterChoice(Set<Laptops> laptops) {
        Scanner scan = new Scanner(System.in);
        Set<Laptops> resSet = new HashSet<>(laptops);

        System.out.println("Укажите номер или номера критериев ноутбуков, если неважно используйте Enter: " +
                "\n1. Size Hdd \n2. Size Ram\n3. Os\n4. Color\n5. Brande\n6. Model\n7. Price");
        String userChoice = scan.nextLine();

        for (int i = 0; i < userChoice.length(); i++) {
            if (1 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите минимальный размер жёсткого диска: ");
                Integer minHdd = scan.nextInt();
                for (Laptops tempLaptop : laptops) {
                    if (minHdd > tempLaptop.getHdd()) {
                        resSet.remove(tempLaptop);
                    }
                }
            }

            if (2 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите минимальное количество оперативной памяти: ");
                Integer minRam = scan.nextInt();
                for (Laptops tempLaptop : laptops) {
                    if (minRam > tempLaptop.getRam()) {
                        resSet.remove(tempLaptop);
                    }
                }
            }

            if (3 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите операционную систему: ");
                String enterOperatingSystem = scan.nextLine();
                for (Laptops tempLaptop : laptops) {
                    if (enterOperatingSystem.equals(tempLaptop.getOs())) {
                        resSet.remove(tempLaptop);
                    }
                }
            }

            if (4 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите цвет ноутбука: ");
                String enterColor = scan.nextLine();
                for (Laptops tempLaptop : laptops) {
                    if (enterColor.equals(tempLaptop.getColor())) {
                        resSet.remove(tempLaptop);
                    }
                }
            }

            if (5 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите бренд: ");
                String enterBrand = scan.nextLine();
                for (Laptops tempLaptop : laptops) {
                    if (enterBrand.equals(tempLaptop.getBrand())) {
                        resSet.remove(tempLaptop);
                    }
                }
            }

            if (6 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите модель: ");
                String enterModel = scan.nextLine();
                for (Laptops tempLaptop : laptops) {
                    if (enterModel.equals(tempLaptop.getModel())) {
                        resSet.remove(tempLaptop);
                    }
                }
            }

            if (7 == Character.getNumericValue(userChoice.charAt(i))) {
                System.out.println("Укажите максимальную стоимость: ");
                Integer maxPrice = scan.nextInt();
                for (Laptops tempLaptop : laptops) {
                    if (maxPrice < tempLaptop.getPrice()) {
                        resSet.remove(tempLaptop);
                    }
                }
            }
        }

        scan.close();
        return resSet;
    }
}
