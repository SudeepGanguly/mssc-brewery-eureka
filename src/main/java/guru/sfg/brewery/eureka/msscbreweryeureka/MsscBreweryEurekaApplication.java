package guru.sfg.brewery.eureka.msscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsscBreweryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBreweryEurekaApplication.class, args);
    }

}
