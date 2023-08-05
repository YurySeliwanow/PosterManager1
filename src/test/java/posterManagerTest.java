import org.example.posterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterManagerTest {

    @Test
    public void films1() {
        posterManager manager = new posterManager();
        manager.addMovie("Films I");
        String[] expected = {"Films I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noFilms() {
        posterManager manager = new posterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void severalFilms() {
        posterManager manager = new posterManager();
        manager.addMovie("Films I");
        manager.addMovie("Films II");
        manager.addMovie("Films III");
        String[] expected = {"Films I", "Films II", "Films III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesReverse() {
        posterManager manager = new posterManager();
        manager.addMovie("Films I");
        manager.addMovie("Films II");
        manager.addMovie("Films III");
        String[] expected = {"Films III", "Films II", "Films I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
