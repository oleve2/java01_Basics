package Task17_treeset_treemap;

import java.util.Comparator;

public class SpacePersonComparator implements Comparator<Person> {
    public int countCharOccurance(String word, String c) {
        String[] wordSplit = word.toLowerCase().split("");
        int numOfMatches = 0;
        for ( String w : wordSplit ) {
            if (w.equals(c.toLowerCase())) {
                numOfMatches += 1;
            }
        }
        return numOfMatches;
    }

    @Override
    public int compare(Person o1, Person o2) {
        // у кого больше опыта
        if (o1.getExperience() > o2.getExperience()) {
            return -1;
        } else if (o1.getExperience() < o2.getExperience()) {
            return 1;
        } else {
            // тот, у кого в имени с фамилией (т.е. name) больше букв s или S
            int cntS1 = countCharOccurance(o1.getName(), "s");
            int cntS2 =  countCharOccurance(o2.getName(), "s");
            if (cntS1 > cntS2) {
                return -1;
            } else if (cntS1 < cntS2) {
                return 1;
            } else {
                // тот, у кого имя с фамилией (т.е. name) короче
                if (o1.getName().length() < o2.getName().length()) {
                    return -1;
                } else if (o1.getName().length() > o2.getName().length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

}
