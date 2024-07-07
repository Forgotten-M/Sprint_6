import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AlexTheLionTest {

    private AlexTheLion alexTheLion;
    private List<String> expectedFriends;
    private String placeOfLiving;

    @Before
    public void setupFeline() throws Exception {
        Feline feline = new Feline();
        alexTheLion = new AlexTheLion(feline);
        placeOfLiving = "Нью-Йоркский зоопарк";
        expectedFriends = List.of("Марти", "Глория", "Мелман");
    }

    //тест на получение списка друзей льва Алекса
    @Test
    public void eatMeatFelineTest() {
        assertEquals(expectedFriends, alexTheLion.getFriends());
    }

    //тест на количество львят льва Алекса
    @Test
    public void kittensAlexTheLionTest() {
        assertEquals(0, alexTheLion.getKittens());
    }

    //тест на получение места жительства льва Алекса
    @Test
    public void placeOfLivingAlexTheLionTest() {
        assertEquals(placeOfLiving, alexTheLion.getPlaceOfLiving());
    }
}