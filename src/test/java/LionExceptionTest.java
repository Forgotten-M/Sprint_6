import com.example.Lion;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionExceptionTest {

    //тест на появление исключения и сравнение сообщения с ожидаемым
    @Test
    public void lionTestExpectedException() {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> new Lion("Алекс", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}