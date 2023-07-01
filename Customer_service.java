import java.util.Scanner;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий фильтрации
 * и выведет ноутбуки, отвечающие фильтру.
 * NoteBook notebook1 = new NoteBook
 * NoteBook notebook2 = new NoteBook
 * NoteBook notebook3 = new NoteBook
 * NoteBook notebook4 = new NoteBook
 * NoteBook notebook5 = new NoteBook
 * 
 * Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД hd hdd
 * 3 - Операционная система
 * 4 - Цвет
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * 
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 * 
 * Класс сделать в отдельном файле
 * 
 * приветствие
 * Выбор параметра
 * выбор конкретнее
 * вывод подходящих
 */
public class Customer_service {

    static NoteBook notebook1 = new NoteBook();
    static NoteBook notebook2 = new NoteBook();
    static NoteBook notebook3 = new NoteBook();
    static NoteBook notebook4 = new NoteBook();

    public static void main(String[] args) {
        System.out.println(
                "Добрый день. Данный сервис поможет вам определить более подходящие варианты ноутбука под необходимые вам параметры");

        notebook1.RAM = 1024;
        notebook1.HD = 204;
        notebook1.OS = "Windows";
        notebook1.Color = "Black";

        notebook2.RAM = 2048;
        notebook2.HD = 102;
        notebook2.OS = "Mac Os";
        notebook2.Color = "White";

        notebook3.RAM = 6144;
        notebook3.HD = 6144;
        notebook3.OS = "Windows";
        notebook3.Color = "Yellow";

        notebook4.RAM = 8192;
        notebook4.HD = 8192;
        notebook4.OS = "Linux";
        notebook4.Color = "Yellow";
        operation();
    }

    public static void operation() {
        printinfo();
        System.out.println("Выберите необходимую операцию");

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = iScanner.next();

        try {
            int b = Integer.parseInt(input);

            while (b != 0) {
                switch (b) {
                    case 1:
                        serchNoteBook();
                        printinfo();
                        break;
                    case 2:
                        System.out.println("Введите номер ноутбука ");
                        int j = iScanner.nextInt();
                        check(j);
                        printinfo();
                        break;
                    case 3:
                        info();
                        printinfo();
                        break;
                    default:
                        System.out.println("Данные не верны, попробуйте еще раз");
                        printinfo();
                        break;
                }

                input = iScanner.next();
                b = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение, попробуйте еще раз");
            operation();
        }

        System.out.println("Всего доброго!");
    }

    public static void serchNoteBook() {

        printinfo2();

        Scanner iScanner = new Scanner(System.in);
        String input2 = iScanner.next();
        try {
            int a = Integer.parseInt(input2);
            while (a != 0) {
                switch (a) {
                    case 1:
                        System.out.print("Введите необходимое количество оперативной памяти  ");
                        int c = iScanner.nextInt();
                        RamNotebooks(c);
                        printinfo2();
                        ;
                        break;
                    case 2:
                        System.out.print("Введите необходимое количество жесткого диска : ");
                        Scanner iScanner1 = new Scanner(System.in);
                        int d = iScanner1.nextInt();
                        HDNotebooks(d);
                        printinfo2();
                        break;
                    case 3:
                        System.out.print("Введите необходимую операционную систему(Windows,Mac Os, Linux) ");
                        Scanner iScanner2 = new Scanner(System.in);
                        String newOS = iScanner2.next();
                        OSNotebooks(newOS);
                        printinfo2();
                        break;
                    case 4:
                        System.out.print("Введите необходимый цвет");
                        Scanner iScanner3 = new Scanner(System.in);
                        String newColor = iScanner3.next();
                        ColorNotebooks(newColor);
                        printinfo2();
                    default:
                        System.out.println("Данные не верны, попробуйте еще раз");

                        break;
                }
                input2 = iScanner.next();
                a = Integer.parseInt(input2);
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение, попробуйте еще раз");
            operation();
        }

    }

    public static void printinfo() {
        System.out.println("1 - Выбор параметра");
        System.out.println("2 - Выбрать конкретное");
        System.out.println("3 - Вывод подходящих");
        System.out.println("0 - Выход");
    }

    public static void printinfo2() {
        System.out.println("Выберите необходимый параметр фильтрации");
        System.out.println("1 - \u041E\u0417\u0423\r\n" + //
                "2 - \u041E\u0431\u044A\u0435\u043C \u0416\u0414 hd hdd\r\n" + //
                "3 - \u041E\u043F\u0435\u0440\u0430\u0446\u0438\u043E\u043D\u043D\u0430\u044F \u0441\u0438\u0441\u0442\u0435\u043C\u0430\r\n"
                + //
                "4 - \u0426\u0432\u0435\u0442");
        System.out.println("0 - Вернуться в главное меню");

        System.out.print("Введите число: ");

    }

    public static void RamNotebooks(int c) {
        if (notebook1.RAM >= c) {
            System.out.println("Notebook 1: " + notebook1.RAM);
        }
        if (notebook2.RAM >= c) {
            System.out.println("Notebook 2: " + notebook2.RAM);
        }
        if (notebook3.RAM >= c) {
            System.out.println("Notebook 3: " + notebook3.RAM);
        }
        if (notebook4.RAM >= c) {
            System.out.println("Notebook 4: " + notebook4.RAM);
        }

    }

    public static void HDNotebooks(int d) {
        if (notebook1.HD >= d) {
            System.out.println("Notebook 1: " + notebook1.HD);
        }
        if (notebook2.HD >= d) {
            System.out.println("Notebook 2: " + notebook2.HD);
        }
        if (notebook3.HD >= d) {
            System.out.println("Notebook 3: " + notebook3.HD);
        }
        if (notebook4.HD >= d) {
            System.out.println("Notebook 4: " + notebook4.HD);
        }

    }

    public static void OSNotebooks(String newOS) {
        if (notebook1.OS.equals(newOS)) {
            System.out.println("Notebook 1: " + notebook1.OS);
        }
        if (notebook2.OS.equals(newOS)) {
            System.out.println("Notebook 2: " + notebook2.OS);
        }
        if (notebook3.OS.equals(newOS)) {
            System.out.println("Notebook 3: " + notebook3.OS);
        }
        if (notebook4.OS.equals(newOS)) {
            System.out.println("Notebook 4: " + notebook4.OS);
        }
    }

    public static void ColorNotebooks(String newColor) {
        if (notebook1.Color.equals(newColor)) {
            System.out.println("Notebook 1: " + notebook1.Color);
        }
        if (notebook2.Color.equals(newColor)) {
            System.out.println("Notebook 2: " + notebook2.Color);
        }
        if (notebook3.Color.equals(newColor)) {
            System.out.println("Notebook 3: " + notebook3.Color);
        }
        if (notebook4.Color.equals(newColor)) {
            System.out.println("Notebook 4: " + notebook4.Color);
        }
    }

    public static void check(int j) {
        if (j <= 1) {
            System.out.println(
                    "Ноутбук 1 имеет " + notebook1.RAM + " оператвной памяти, " + notebook1.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook1.OS + " , цвет корпуса: " + notebook1.Color);
        }
        if (j == 2) {
            System.out.println(
                    "Ноутбук 2 имеет " + notebook2.RAM + " оператвной памяти, " + notebook2.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook2.OS + " , цвет корпуса: " + notebook2.Color);
        }
        if (j == 3) {
            System.out.println(
                    "Ноутбук 3 имеет " + notebook3.RAM + " оператвной памяти, " + notebook3.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook3.OS + " , цвет корпуса: " + notebook3.Color);
        }
        if (j == 4) {
            System.out.println(
                    "Ноутбук 4 имеет " + notebook4.RAM + " оператвной памяти, " + notebook4.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook4.OS + " , цвет корпуса: " + notebook4.Color);
        }
        if (j > 4) {
            System.out.println("Такой позиции еще не добавили");
        }

    }



    public static void info() {
        System.out.println("Ноутбук 1 имеет " + notebook1.RAM + " оператвной памяти, " + notebook1.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook1.OS + " , цвет корпуса: " + notebook1.Color);;
        System.out.println("Ноутбук 2 имеет " + notebook2.RAM + " оператвной памяти, " + notebook2.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook2.OS + " , цвет корпуса: " + notebook2.Color);
        System.out.println("Ноутбук 3 имеет " + notebook3.RAM + " оператвной памяти, " + notebook3.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook3.OS + " , цвет корпуса: " + notebook3.Color);
        System.out.println("Ноутбук 4 имеет " + notebook4.RAM + " оператвной памяти, " + notebook4.HD + " объем HDD диска, "
                            + "операционную ситиему: " + notebook4.OS + " , цвет корпуса: " + notebook4.Color);
        
    }

}
