package ec.edu.epn;

import com.fasterxml.jackson.databind.ObjectMapper;
import ec.edu.epn.service.util.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {ThymeleafAutoConfiguration.class})
//@Configuration
//public class restApplication extends SpringBootServletInitializer{
public class restApplication {
    public static void main(String[] args) {
        SpringApplication.run(restApplication.class, args);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String password = "Chester_1";
        String encodedPassword = passwordEncoder.encode(password);

        System.out.println();
        System.out.println("Password is         : " + password);
        System.out.println("Encoded Password is : " + encodedPassword);
        System.out.println();


        boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
        System.out.println("Password : " + password + "  isPasswordMatch    : " + isPasswordMatch);


        System.out.println("CCLAVE GENERADA: " + Utils.generateRandomPassword());
        System.out.println("CCLAVE GENERADA: " + Utils.generateRandomPassword());
        System.out.println("CCLAVE GENERADA: " + Utils.generateRandomPassword());

    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ObjectMapper serializadorPredeterminado() {
        return new ObjectMapper();
    }

	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(restApplication.class);
	}*/

}
