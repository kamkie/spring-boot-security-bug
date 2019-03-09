# spring mvc vs ant matcher permitall

I found problem in new version of spring boot 2.0.5 with security maters other than mvcMatchers (antMatchers and requestMatchers -> EndpointRequest) when server.servlet.path is set to some path

additionally I found that without using server.servlet.path content negotiation for `/` does not work and controller always wins over static files

example behaves little bit different when mvcMatchers will be replaced with equivalent antMatchers in`SecurityConfig` 

changing version of spring security doesn't help

in spring boot release notes I found this commit https://github.com/spring-projects/spring-boot/commit/b93c2b9a9fba057470b03944cdd59e37f1ebbc59


in file `DemoApplication.http`  and `DemoApplication-no-context-path.http` i crated and commented example requests that shows this problem


