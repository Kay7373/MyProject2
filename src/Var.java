public class Var {
    public static void main(String[] args) {
        //Прошло 234 дня. Сколько полных недель прошло за этот период? А месяцев?
        int x = 234;
        int week = x/7;
        int month = x/30;
        System.out.println("Прошло недель:" +week);
        System.out.println("Прошло месяцев:"+month);
        //Дано двузначное число 57. Найти:число десятков в нем; Число единиц в нем; Сумму его цифр; Произведение его цифр.
        int y = 57;
        int doz = y/10;
        int un = y%10;
        int sum = doz + un;
        int mul = doz * un;
        System.out.println("Число десятков:"+doz);
        System.out.println("Число единиц:"+un);
        System.out.println("Сумма цифр в числе:"+sum);
        System.out.println("Произведение цифр:"+mul);
        //Найдите возраст человека, если известно, что год его рождения 1991. Выведите полученный результат в виде “Возраст = …”
        int god=1991;
        int year=2023-god;
        System.out.println("Возраст:"+year);
    }

}
