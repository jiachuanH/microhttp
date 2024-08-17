package org.microhttp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.microhttp.log.Logger;
import org.microhttp.log.NoopLogger;

public class LoggerTest {

    @Test
    public void noopLogger() {
        Logger logger = NoopLogger.instance();
        assertFalse(logger.enabled());
        assertSame(NoopLogger.instance(), logger);
    }
}
