package steps;

import com.wex.test.laercio.demo.DemoApplication;
import com.wex.test.laercio.demo.model.User;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration
@DirtiesContext
public class api_steps {

    protected RestTemplate restTemplate = new RestTemplate();
    String baseURL =  "http://localhost:8080";
    ResponseEntity<String> statusMovieEndPoint;
    User userById;

    @When("^calls \"([^\"]*)\"$")
    public void calls(String url) throws Throwable {
        try{
            statusMovieEndPoint = restTemplate.getForEntity(new URI(baseURL + url), String.class);
        } catch (Exception e){
            System.out.println("url failed");
            System.out.println(statusMovieEndPoint.getStatusCode().toString());
        }
    }

    @Then("^receives response status value \"([^\"]*)\"$")
    public void receives_response_status_value(String status) throws Throwable {
        Assert.assertEquals(status, statusMovieEndPoint.getStatusCode().toString());
        System.out.println(statusMovieEndPoint.getStatusCode().toString());
    }

    @When("^calls \"([^\"]*)\" with valid id \"([^\"]*)\"$")
    public void calls_with_valid_id(String url, String id) throws Throwable {
        try{
            userById = restTemplate.getForObject(new URI(baseURL + url + id), User.class);
        } catch (Exception e){
            System.out.println("url failed");
        }
    }

    @Then("^receives response with first_name key value \"([^\"]*)\"$")
    public void receives_response_with_first_name_key_value(String firstname) throws Throwable {
        Assert.assertEquals(firstname, userById.getFirstName());
        System.out.println(userById.getFirstName());
        System.out.println(userById.getUserId());
    }
}
