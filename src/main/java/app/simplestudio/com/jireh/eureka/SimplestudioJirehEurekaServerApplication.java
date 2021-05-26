package app.simplestudio.com.jireh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SimplestudioJirehEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplestudioJirehEurekaServerApplication.class, args);
	}

}
