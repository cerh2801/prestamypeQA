package StepDefinition.prestamype;

import Base.BaseTest;

public class GoogleTest extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        GoogleTest test = new GoogleTest();

        test.setUp();

        test.driver.get("https://public.test.prestamype.com/");
        Thread.sleep(4000);

        test.screen();

        test.tearDown();
    }


}
