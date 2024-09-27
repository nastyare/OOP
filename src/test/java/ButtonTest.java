import org.example.ButtonClick;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonTest {
    @Test
    void click() {
        ButtonClick.Button button = new ButtonClick.Button();

        button.click();
        button.click();
        button.click();

        assertEquals(3, button.getClickCount());
    }
}
