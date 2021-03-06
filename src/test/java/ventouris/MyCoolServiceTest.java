package ventouris;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ventouris.util.Locator;

import java.util.Arrays;
import java.util.List;

class MyCoolServiceTest {

    @BeforeEach
    void setUp() {
        Locator.setRunningInTest(true);
    }

    @AfterEach
    void tearDown() {
        Locator.setRunningInTest(false);
    }

    @Test
    void doTest() {
        MyCoolService myCoolService = new MyCoolService();

        List<String> result = myCoolService.doWork(Arrays.asList("a", "b", null, "c"));

        Assertions.assertThat(result)
                  .hasSize(1)
                  .containsOnlyNulls();
    }

}