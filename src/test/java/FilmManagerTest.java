import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FilmItems;

public class FilmManagerTest {
    FilmRepository repo = new FilmRepository();
    FilmManager manager = new FilmManager(repo);

    FilmItems item1 = new FilmItems(1, "Zombieland", "Ужасы", "img1");
    FilmItems item2 = new FilmItems(2, "Drive", "Криминал", "img2");
    FilmItems item3 = new FilmItems(3, "Avatar", "Научная фантастика", "img3");
    FilmItems item4 = new FilmItems(4, "Dune", "Научная фантастика", "img4");
    FilmItems item5 = new FilmItems(5, "Spider-Man", "Супергероика", "img5");
    FilmItems item6 = new FilmItems(6, "Spider-Man 2", "Супергероика", "img6");
    FilmItems item7 = new FilmItems(7, "Spider-Man 3", "Супергероика", "img7");

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
    }

    @Test
    public void shouldReverseFiveFilms() {

        FilmItems [] expected = {item7, item6, item5, item4, item3};
        FilmItems [] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseThreeFilms() {

        FilmItems [] expected = {item7, item6, item5, item4};
        FilmItems [] actual = manager.findLast(4);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {

        FilmItems [] expected = {item1, item2, item3, item4, item5, item6, item7};
        FilmItems [] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
