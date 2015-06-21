import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.FIREFOX;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

import org.junit.Test;

import play.libs.F.Callback;
import play.test.TestBrowser;

public class IntegrationTest {

	
    /**
     * add your integration test here
     * in this example we just check if the welcome page is being shown
     */
	/* Integration Tests have been disabled because htmlunit does not support jquery 1.11 (waiting for a fix) 
	 * 
	 */
    @Test
    public void test() {
    	System.out.println("[DEBUG] IntegrationTest - test");
        running(testServer(3333, fakeApplication(inMemoryDatabase())), FIREFOX, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333/");
                assertThat(browser.pageSource()).contains("rest-api-generic-interface");
                System.out.println("[DEBUG] IntegrationTest - test END");
            }
        });
    }
  
}
