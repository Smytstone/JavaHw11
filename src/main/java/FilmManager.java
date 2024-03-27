import ru.netology.javaqa.FilmItems;

public class FilmManager {

    private String[] items = new String[0];

    public void addMovie(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int findLastLimit = 5;
        String[] all = findAll();
        String[] reversed = new String[findLastLimit];
        for (int i = 0; i < findLastLimit; i++) {
            reversed[i] = all[all.length - 1 - i];
            }
        return reversed;
    }

    public String[] findLast(int findLastLimit) {
        String[] all = findAll();
        String[] reversed = new String[findLastLimit];
        for (int i = 0; i < findLastLimit; i++) {
            reversed[i] = all[all.length - 1 - i];
            }
        return reversed;
    }
}
