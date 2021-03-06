package sample.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * A sample Spring Boot application that starts the Camel routes.
 */
@SpringBootApplication
// load the spring xml file from classpath
//@ImportResource("classpath:my-camel.xml")
@ImportResource("classpath:cxf-call.xml")
public class SampleCamelApplication {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SampleCamelApplication.class, args);
    }

}