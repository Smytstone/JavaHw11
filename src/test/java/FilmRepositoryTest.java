import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FilmItems;

public class FilmRepositoryTest {
    FilmItems item1 = new FilmItems(1, "Zombieland", "Ужасы", "img1");
    FilmItems item2 = new FilmItems(2, "Drive", "Криминал", "img2");
    FilmItems item3 = new FilmItems(3, "Avatar", "Научная фантастика", "img3");

    @Test
    public void test() {
        FilmRepository repo = new FilmRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        FilmItems[] expected = {item1, item2, item3};
        FilmItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}
