package Task17_treeset_treemap;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/* [Матчасть]
https://www.google.com/search?q=java+difference+between+comparator+and+comparable

Условие задачи

Перед вами программа отбора кандидатов в астронавты. В main заполнено множество из потенциальных кандидатов, из которых выбирается только два кандидата.
Критерии отбора таковы. При сравнении двух кандидатов лучший выбирается по принципу:
- тот у кого больше опыта; если опыт одинаковый то
- тот, у кого в имени с фамилией (т.е. name) больше букв s или S (от слова space - космос; было решено, что медийность - важная часть космонавтики); если по этому критерию оказываются равны, то
- тот, у кого имя с фамилией (т.е. name) короче (так легче будет запоминать имена астронавтов по всему миру)

Ваша задача реализовать компаратор, сортировка которым расставит кандидатов по убыванию их приоритета найма в астронавты. Ничего крмое класса компаратора менять нельзя. Программа в main в итоге должна выводить имена двух самых лучших кандидатов

*/

public class Main {
    public static void main(String[] args) {
        SpacePersonComparator spc = new SpacePersonComparator();
        TreeSet<Person> candidates = new TreeSet<>(spc);
        candidates.add(new Person("Sonya Popova", 35, 15));
        candidates.add(new Person("Dazdraperma Sponzhova", 33, 15));
        candidates.add(new Person("Salavat Netologshvili", 23, 13));
        candidates.add(new Person("Sasha Sun", 31, 15));
        candidates.add(new Person("Svetlana Morkov", 38, 15));
        candidates.add(new Person("Sasha Sosnova", 38, 11));

        /*for (Person p : candidates) {
            System.out.println(p);
        }*/

        Iterator<Person> it = candidates.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

    }
}
