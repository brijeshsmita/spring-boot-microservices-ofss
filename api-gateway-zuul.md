# Using Netflix-OSS Zuul As API Gateway

1.  Create New Spring Starter Project
    Name:           demo-api-gateway
    Dependencies:   Zuul, Discovery Client

2.  Open DemoApiGatewayApplication.Java
    Add annotation:
        @EnableZuulProxy
        @EnableDiscoveryClient

3.  Open "Application.properties"

        server.port=8000
        spring.application.name=api-server
        eureka.client.fetch-registry=true
        eureka.client.service-url.default-zone=http://localhost:8761/eureka
        # URL localhost:8000
        # After adding prefix:
        # URL localhost:8000/api/
        zuul.prefix=/api
        # URL localhost:8000/api/exchange
        zuul.routes.exchange.service-id=exchange-service

4.  Execution Sequence:
        1. Start Eureka server "demo-eureka"
        2. Start Config Server "demo-config1"
        3. Start Real Service "demo-exchangeservice"
        4. Start API Gateway "demo-api-gateway"

5.  Open Web browser and visit URL:
        http://localhost:8000/api/exchange/