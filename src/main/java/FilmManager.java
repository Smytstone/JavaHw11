public class FilmManager {

    private String[] items = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int Limit) {
        this.limit = Limit;
    }

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
        int findLastLimit;
        if (items.length < limit) {
            findLastLimit = items.length;
        } else {
            findLastLimit = limit;
        }
        String[] reversed = new String[findLastLimit];
        for (int i = 0; i < findLastLimit; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
