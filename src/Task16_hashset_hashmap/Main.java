package Task16_hashset_hashmap;

/* ------------------------------------------------------------------------ */
/* [Задание 1]
Эта задача про телефонный справочник с поддержкой групп контактов.
Один контакт может входить в несколько групп.
Например, если вы работаете со своим другом, то он будет в группах "Друзья" и "Работа".
Должна быть возможность создания групп и контактов, добавления одного контакта в несколько групп.

Вам предстоит разработать систему классов:
- Contact - класс контакт
- PhoneBook - класс телефонной книги с контактами и группами.

Общаться с пользователем в main необязательно, просто продемонстрируйте работспособность ваших классов.

Функционал классов
- Создание группы контактов;
- Создание контакта;
- Добавление контакта в разные группы;
- Поиск контактов по группе;
- Поиск контакта по номеру (одну из этих двух последних операций можно сделать перебором);
*/

/* ------------------------------------------------------------------------ */
/* [задание 2]
Вы разрабатываете систему учета студентов.
Для каждого студента нужно хранить следующие данные – ФИО, номер группы, номер студенческого билета.
Уникальным идентификатором является номер студенческого билета.
Пользователь вводит данные студентов в бесконечном цикле до ввода команды "end".
По окончании ввода программа должна вывести список студентов.
Структура данных, куда сохраняются студенты, должна отбрасывать ввод студента с уже существующим в базе id и писать об этом пользователю.
Учитывайте, что имена у людей могут быть одинаковыми, а номера документов – нет.

Функционал программы
- Ввод информации о студентах;
- Вывод списка студентов.
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        laucnTask1();
        //launchTask2();
    }

    public static void laucnTask1() {
        // _________________________________________
        // [Задание 1]
        // Контакты
        Contact c1 = new Contact("White", "John", 13, "1234567");
        Contact c2 = new Contact("Pink", "Sarah", 34, "1223344");
        Contact c3 = new Contact("Brown", "James", 21, "1335566");
        Contact c4 = new Contact("Blue", "Maria", 19, "7654321");

        // Записная книжка
        PhoneBook pb1 = new PhoneBook("my phone book");

        // Создаем группу контактов, записываем туда контакты
        pb1.addContactGroupToPB("Мои друзья");
        pb1.addContactToCG("Мои друзья", c1);
        pb1.addContactToCG("Мои друзья", c1);
        pb1.addContactToCG("Мои друзья", c2);
        pb1.addContactToCG("Мои друзья", c3);
        pb1.getContactGroupMap().get("Мои друзья").printCGContacts();
        System.out.println("___________________");

        // добавление контактов в адресную книгу
        pb1.addContactToPhoneBook(c2);
        pb1.addContactToPhoneBook(c4);
        System.out.println("Phonebook contacts:");
        for (Contact c : pb1.getContactList()) {
            System.out.println(c);
        }

        System.out.println("========================");
        System.out.println("1) поиск контекта в несуществующей группе");
        pb1.searchContactInGroup("asd", c1);
        System.out.println("2) поиск контекта в существующей группе");
        pb1.searchContactInGroup("Мои друзья", c1);
        System.out.println("3) поиск контакта в списке контактов по номеру телефона");
        pb1.searchContactByPhone("7654321");
    }

    public static void launchTask2() {
        /*
        String s1 = "hello";
        String s2 = "bonjour";
        System.out.println(s1.hashCode() + " / " + s2.hashCode());
        Student stud1 = new Student("John Denver", "A101", "FCUKMUN");
        Student stud2 = new Student("John Denver", "A101", "FCUKMUN");
        System.out.println(stud1.hashCode() + " / " + stud2.hashCode());
        System.out.println(stud1.equals(stud2));
        */

        //Map<String, Student> studentMap = new HashMap<>();
        Set<Student> studentSet = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            String input = scan.nextLine();
            if (input.equals("end")) {
                Iterator<Student> iter = studentSet.iterator();
                while (iter.hasNext()) {
                    System.out.println(iter.next());
                }
                break;
            }
            String[] inputArr = input.split(", ");
            Student newStud = new Student(inputArr[0], inputArr[1], inputArr[2]);
            /*
            Продемонстрируйте
            - добавление объектов класса в HashSet (его создайте в Main),
            - ошибку при добавлении студентов с одинаковым номером,
            - возможность существования студентов с одинаковыми именами (но разными id).

            [Данные для ввода:]
            Иванов Петр Николаевич, 1243-Б, 31231343
            Иванов2 Петр2 Николаевич2, 1243-Б, 31231343
            Петрова Татьяна Михайловна, 1243-Б, 43221343
            Петрова Татьяна Михайловна, 1243-Б, 77777777
            */
            if (studentSet.contains(newStud)) {
                System.out.println("запись " + newStud + " уже существует");
            } else {
                studentSet.add(newStud);
            }
        }
    }
}
