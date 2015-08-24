#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App {

	static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        logger.info( "Hello World!" );
    }

    public static String main(){
    	logger.info( "Hello World!" );
    	return "Hello World!"; 
    }
}
