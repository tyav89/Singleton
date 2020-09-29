import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {
    static Logger logger1;
    static Logger logger2;

    @BeforeEach
    void init() {
        logger1 = Logger.getInstance();
        logger2 = Logger.getInstance();
    }

    @Test
    void getInstance() {
        assertEquals(logger1, logger2);
    }
}