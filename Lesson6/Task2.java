// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.'


public class Task2 {
    public static void main(String[] args) {
        VetCat cat=new VetCat("Бася", "Брит", "Рыжий", "Иванов",null,null, 'M');

        cat.setName("Вася");
        System.out.println(cat.getName()); 
        System.out.println(cat);
    }
}
