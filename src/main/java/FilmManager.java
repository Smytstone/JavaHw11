import ru.netology.javaqa.FilmItems;

public class FilmManager {
    private FilmRepository repo;

    public FilmManager(FilmRepository repo) {
        this.repo = repo;
    }

    public void add(FilmItems item) {
        repo.save(item);
    }

    public FilmItems[] findAll() {
        FilmItems[] all = repo.getItems();
        return all;
    }

    public FilmItems[] findLast() {
        int findLastLimit = 5;
        FilmItems[] all = repo.getItems();
        FilmItems[] reversed = new FilmItems[findLastLimit];
        for (int i = 0; i < findLastLimit; i++) {
            reversed[i] = all[all.length - 1 - i];
            }
        return reversed;
    }

    public FilmItems[] findLast(int findLastLimit) {
        FilmItems[] all = repo.getItems();
        FilmItems[] reversed = new FilmItems[findLastLimit];
        for (int i = 0; i < findLastLimit; i++) {
            reversed[i] = all[all.length - 1 - i];
            }
        return reversed;
    }
}
