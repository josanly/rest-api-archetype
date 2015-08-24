#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import org.junit.Test;

import play.mvc.Content;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test 
    public void simpleCheck() {
    	System.out.println("[DEBUG] ApplicationTest - simpleCheck");
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
        System.out.println("[DEBUG] ApplicationTest - simpleCheck END");
    }
    
    @Test
    public void renderTemplate() {
    	System.out.println("[DEBUG] ApplicationTest - renderTemplate");
        Content html = views.html.index.render("TITLE", "SUB_TITLE", "home");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("TITLE");
        System.out.println("[DEBUG] ApplicationTest - renderTemplate END");
    }
  
   
}
