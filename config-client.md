## Config Server client example

1. Create new Spring Starter Project

    Name:           demo-exchangeservice
    Dependencies:   Eureka Discovery , Config Client, Web

2.  Create a new Class:  HomeController
    Add following code

        @RestController
        public class HomeController {
        // Inject property USD into current variable
            @Value("${USD}")
            private String rupeesToUsd;
            
            @GetMapping("/")
            public String rate() {
                return rupeesToUsd;
            }
        }

3.  Open Application.properties file and add:

        spring.application.name=exchange-service
        server.port=0
        spring.cloud.config.uri=http://localhost:8888

4.  Open "demo-config1" and add few more properties
        
        eureka.client.register-with-eureka=false
        eureka.client.fetch-registry=true
        eureka.client.service-url.default-zone=http://localhost:8761/eureka

5.  Run application in following order:

        1. Run demo-eureka
        2. Run demo-config1
        3. Run demo-exchangeservice