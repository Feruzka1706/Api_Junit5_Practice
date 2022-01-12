package utility;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.*;

public class FruitApiBase {

    @BeforeAll
    public static void setup(){
     baseURI=ConfigReader.read("FruitURL");
     basePath="/shop";

    }


    @AfterAll
    public static void tearDown(){
        reset();
    }


}
