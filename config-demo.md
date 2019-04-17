## Spring Config Server Demo
	1. Create new Spring Starter Project
		
		Name: 		demo-config1
		Dependency:	config-server

	2. Open DemoConfig1Application.java
		
		Add this annotation
		@EnableConfigServer

	3. Open application.properties file
	
		# Replace default profile (Uses GIT) with Native profile
		# Native profile can load configuration from file system
		# DO NOT depend on version control
		spring.profiles.active=native

		# Load all configurations from "configs" directory inside /src/main/resources
		spring.cloud.config.server.native.search-locations=classpath:/configs/

		spring.cloud.config.server.bootstrap=true
		# PORT for Config Server
		server.port=8888
		
	4. Create folder "configs" under "src/main/resources"
	
	5. Create "properties" for each microservice
	
		create a file "exchange-service.properties"
		Its a CONFIGURATION for Service "exchange-service"
		Values inside properties:
			
		USD=61.92
		ZAR=4.05
		YEN=0.67