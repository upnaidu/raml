/**
 * 
 */
package restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

/**
 * @author pentayya.u
 *
 */
@Path(value = "/api")
@Produces("application/json")
public class RestApi {

	private static Logger logger = Logger.getLogger(RestApi.class.getName());

	// http://localhost:8081/console/
	// After writing services in .raml
	// Right click in abc.raml file -> go to MULE -> Generate flows from RAML
	// We can see that flows are generated and give your API(services) flow reference
	@Path(value = "/hi")
	@GET
	public String hello() {
		
		logger.info("inside hi URL");
		System.out.println(":::/api/hi:::");

		return " Hello..! ";
	}

	@Path(value = "/hello")
	@GET
	public String hi() {

		logger.info("inside  hello URL");
		System.out.println(":::/api/hello:::");

		return " Hello World..!";
	}
	

	@Path(value = "/post/{name}")
	@GET
	public String postService(@PathParam(value="name")String name) {

		logger.info("inside  post URL");
		System.out.println(":::/api/post:::");

		return " Hello World..!"+name;
	}

}
