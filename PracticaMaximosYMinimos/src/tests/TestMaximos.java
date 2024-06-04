package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import clase.Maximos;

class TestMaximos {

	@Test
    public void testMaximoDe2EnterosPositivos() {
        Maximos maximos = new Maximos();
        assertEquals(5, maximos.MaximoDe2EnterosPositivos(5, 3));
        assertEquals(8, maximos.MaximoDe2EnterosPositivos(6, 8));
        assertEquals(-1, maximos.MaximoDe2EnterosPositivos(-1, 10));
        assertEquals(-2, maximos.MaximoDe2EnterosPositivos(10, -2));
    }
}

