package info.moraes.eurekaserverpb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerPbApplication {

	public static void main(String[] args) {
		SpringApplication.run(info.moraes.eurekaserverpb.EurekaServerPbApplication.class, args);
	}

}
