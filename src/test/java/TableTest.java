package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TableTest {



    @Test
    void testSetAndGetValues() {
        Table table = new Table(3, 3);

        assertTrue(table.setValue(1, 1, 10));

        assertEquals(10, table.getValue(1, 1));

        assertEquals(0, table.getValue(0, 0));
        assertEquals(0, table.getValue(2, 2));
    }

    @Test
    void testAverage() {
        Table table = new Table(2, 2);

        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);

        double expectedAverage = (1 + 2 + 3 + 4) / 4.0;
        assertEquals(expectedAverage, table.average());
    }
}
