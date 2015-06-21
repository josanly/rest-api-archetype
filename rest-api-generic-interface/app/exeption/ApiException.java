/**
 * 
 */
package exeption;

/**
 * Basic Exception used by API controller to report any error occurrences to client
 * @author ajosso
 *
 */
public class ApiException extends Exception{
	private int code;

	public ApiException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
