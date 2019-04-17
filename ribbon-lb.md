## Load Balancing (Client side load balancing)

1.  Create New Spring Starter Project

    Name:           demo-client

    Dependencies:   Discovery Client, Ribbon, Web

2.  Add following properties in "application.properties"

        exchange-service.ribbon.eureka.enabled=true
        eureka.client.register-with-eureka=false
        eureka.client.fetch-registry=true
        eureka.client.service-url.default-zone=http://localhost:8761/eureka

3.  Open DemoClientApplication.Java

        @SpringBootApplication
        @EnableDiscoveryClient
        @RibbonClient(name="exchange-service")
        public class DemoClientApplication implements CommandLineRunner{

            @LoadBalanced
            @Bean
            public RestTemplate template() {
                return new RestTemplate();
            }
            
            @Autowired
            private RestTemplate template;
            
            public static void main(String[] args) {
                SpringApplication.run(DemoClientApplication.class, args);
            }

            @Override
            public void run(String... args) throws Exception {
                // TODO Auto-generated method stub
                String msg = template.getForObject("http://exchange-service/", String.class);
                System.out.println("Got Response: "+msg);
            }

        }
4.  Sequence of Execution:

        1.  Start Eureka Server "demo-eureka"
        2.  Start Exchange service "demo-exchangeservice"
        3.  Start Client Application "demo-client"