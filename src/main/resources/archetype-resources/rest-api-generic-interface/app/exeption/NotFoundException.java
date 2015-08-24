#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package exeption;

public class NotFoundException extends ApiException {

	private int code;

	public NotFoundException (int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
