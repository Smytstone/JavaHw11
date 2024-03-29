import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FilmItems;

public class FilmManagerTest {

    @Test
    public void shouldAddFilmsTestCase1() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilmsTestCase2() {
        FilmManager manager = new FilmManager();
        manager.addMovie("Spider-man");

        String[] expected = {"Spider-man"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilmsTestCase3() {
        FilmManager manager = new FilmManager();
        manager.addMovie("Spider-man");
        manager.addMovie("Shining");
        manager.addMovie("Dune");
        manager.addMovie("Fly");
        manager.addMovie("Dawn of the dead");
        manager.addMovie("Dune 3");

        String[] expected = {"Spider-man", "Shining", "Dune", "Fly", "Dawn of the dead", "Dune 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseFiveFilms() {
        FilmManager manager = new FilmManager();
        manager.addMovie("Spider-man");
        manager.addMovie("Shining");
        manager.addMovie("Dune");
        manager.addMovie("Fly");
        manager.addMovie("Dawn of the dead");
        manager.addMovie("Dune 3");

        String[] expected = {"Dune 3", "Dawn of the dead", "Fly", "Dune", "Shining"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseThreeFilms() {
        FilmManager manager = new FilmManager(3);
        manager.addMovie("Spider-man");
        manager.addMovie("Shining");
        manager.addMovie("Dune");
        manager.addMovie("Fly");
        manager.addMovie("Dawn of the dead");
        manager.addMovie("Dune 3");

        String[] expected = {"Dune 3", "Dawn of the dead", "Fly"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
