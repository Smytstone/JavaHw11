import ru.netology.javaqa.FilmItems;

public class FilmRepository {
    private FilmItems[] items = new FilmItems[0];

    public void save(FilmItems item) {
        FilmItems[] tmp = new FilmItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }


    public FilmItems[] getItems() {
        return items;
    }
}
