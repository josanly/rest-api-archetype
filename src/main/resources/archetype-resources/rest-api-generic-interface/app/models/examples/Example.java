#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package models.examples;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Example of Object
 * @author ajosso
 *
 */

@XmlRootElement(name = "Example")
public class Example {
	
	private Long id;
	private String name;
	
	
	public Example(Long id) {
		super();
		this.id = id;
		this.name = new String("example");
	}
	
	@XmlElement(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
