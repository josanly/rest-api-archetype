#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package controllers.api.examples;

import javax.ws.rs.PathParam;

import models.examples.Example;
import play.mvc.Result;
import play.Logger;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import controllers.api.BaseApiController;

import org.example.App;

/**
 * Example of API controller with swagger-core annotations to generate json file documentation
 * @author ajosso
 *
 */
@Api(value = "/api/examples", description = "Examples of Operations")
public class Examples extends BaseApiController {

	@ApiOperation(value = "Find example by ID",
            notes = "Returns an example when ID < 10.  ID > 10 or nonintegers will simulate API error conditions",
            responseClass = "models.examples.Example", httpMethod = "GET")
    @ApiResponses(
    	value = {
    		@ApiResponse(
    				errors = {
    						@ApiError(code = 400, reason = "Invalid ID supplied"), 
    						@ApiError(code = 404, reason = "Example not found")}, 
    				value = "Invalid ID supplied"),
            @ApiResponse(
            	errors = {
    				@ApiError(code = 500, reason = "Bad Request 500"), 
    				@ApiError(code = 502, reason = "Bad Request 502")}, 
    			value = "Bad Request")})
    public static Result get(
            @ApiParam(value = "ID of example that needs to be fetched", allowableValues = "range[1,5]", required = true) @PathParam("id") Long id) {
		if(id <= 10){
        Example example = new Example(id);
		return JsonResponse(example);
		} else {
			return JsonResponse(null, 400);
		}
    }

    public static Result coreCall(){
        String coreResponse = App.main();
        Logger.of("application").info("coreCall");
        return JsonResponse(coreResponse);
    }
}
