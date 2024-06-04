package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clase.Maximos;

class TestMinimos {

	@Test
    public void testMinimoDe2EnterosPositivos() {
        Maximos maximos = new Maximos();
        assertEquals(3, maximos.MenorDe2EnterosPositivos(3, 5));
        assertEquals(8, maximos.MenorDe2EnterosPositivos(8, 6));
        assertEquals(-1, maximos.MenorDe2EnterosPositivos(-1, 10));
        assertEquals(-2, maximos.MenorDe2EnterosPositivos(10, -2));
    }

}
