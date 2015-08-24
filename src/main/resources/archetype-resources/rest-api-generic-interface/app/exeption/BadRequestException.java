#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package exeption;

public class BadRequestException extends ApiException {

	private int code;
	
	public BadRequestException (int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
