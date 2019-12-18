package com.accenture.lkm.assignmentday1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.accenture.lkm.assignmentday1.dao.CustomerDAO;


@SpringBootApplication
@ImportResource(locations="classpath:com/lkm/accenture/spring-servlet.xml")
public class App {

	public static void main(String[] args) {
				
		SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        //returns an instance of ConfigurableApplicationContext that can be used to perform normal Spring operations.
        ConfigurableApplicationContext ctx= app.run(args);
      
        CustomerDAO customerDAO= (CustomerDAO)
        		ctx.getBean("customerDAO");
        //System.out.println("customerDAO" +customerDAO.getCustomerDetailsById(1001));
	}

}
